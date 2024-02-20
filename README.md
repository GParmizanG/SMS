- ### SMS

### Developers
- Arseni Sergejev
- Artjom Patoka

### Task
- Development of a SMS, a system where users can log in, add students  .

### Project Description
- The main components of the application are:

### User
- **Attributes**: First Name, Last Name, Gmail, Groupp, Password, Login.
- **Roles**: "Ediot", "ADMINISTRATOR".

### Task
- **Development of a SMS, a system where users can log in, add students.

### User Information
- The "Admin" is the first user created, with access to all features.
  - **Username**: "BrotXer"
  - **Password**: "riya."
- A user with the "Editor" role can add tasks and edit the tasks they've created.

### Comands SQL

- INSERT INTO users (userid, enabled, password, username) VALUES (1, 1, '$2a$10$b0iGiBLHSKsL58sjmGn4F.whPXN.iXdOgt1m.KHHKsh...', 'BrotXer');

- INSERT INTO roles (roleid, name) VALUES (1, 'ADMIN');
- INSERT INTO roles (roleid, name) VALUES (2, 'EDITOR');

- INSERT INTO user_roles (userid, roleid) VALUES (1, 1);


### Project Requirements
- Implementation of user login functionality.
- Ability to add, edit, and view tasks by users.
- Mechanism for assigning tasks to users.
- Ensuring password security using PBKDF2 algorithm with HMAC-SHA1.

### User Roles
1. **Editor**
    - **Description**: A user with the "MANAGER" role has the following capabilities:
      - Add Tasks: Can add new tasks to the task management system.
      - Edit Tasks: Can edit the tasks they have created.
3. **Admin**
    - Description: The "ADMINISTRATOR" role has comprehensive access and administrative privileges:
      - Full System Access: Has access to all features within the task management system.
      - User Management: Can create initial user accounts, including the "Admin" user.
      - Role Management: Manages users and their roles through an administrative interface.
      - Access Control: Implements a mechanism for checking access rights to tasks based on user roles.

### Deadline
- **20.02.2024**
