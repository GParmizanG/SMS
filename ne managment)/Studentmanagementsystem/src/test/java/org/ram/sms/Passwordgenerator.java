package org.ram.sms;//класс Passwordgenerator принадлежит пакету org.ram.sms

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;//импортирует класс BCryptPasswordEncoder из библиотеки Spring Security

public class Passwordgenerator {//метод, точка вхо в программу

	public static void main(String[] args) {//объект encoder типа BCryptPasswordEncoder

BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
String rawpassword="riya";
String encodedpassword=encoder.encode(rawpassword);
System.out.println(encodedpassword);
	}

}
