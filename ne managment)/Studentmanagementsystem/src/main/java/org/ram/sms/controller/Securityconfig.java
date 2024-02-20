package org.ram.sms.controller;

import org.ram.sms.service.Userdetailsserviceimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // анотации для вебсекьюрити
@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter{
	// методы настройки веб безопастности
	@Bean
	public UserDetailsService userdetailsservice() {
		return new Userdetailsserviceimpl(); // создает кодировщик паролей, а authenticationProvider() создает поставщика аутентификации (cвязывает кодировщик паролей)
	}
	
	@Bean
	public BCryptPasswordEncoder passwordencoder() {  // менеджер аутентификации для использования настроенного поставщика аутентификации.
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authprovider=new DaoAuthenticationProvider();
		authprovider.setPasswordEncoder(passwordencoder());
		authprovider.setUserDetailsService(userdetailsservice());
		
		return authprovider;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	
		auth.authenticationProvider(authenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
	http.authorizeRequests()
	.antMatchers("/students/delete/**").hasAuthority("ADMIN").antMatchers("/students/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
	.anyRequest()
	.authenticated().and().formLogin().permitAll().and().logout().permitAll()
	.and().exceptionHandling().accessDeniedPage("/403");
	}
	

}
