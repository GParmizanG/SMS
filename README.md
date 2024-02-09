# TaskMaster

## Developers
- Arseni Sergejev
- Artjom Patoka

## Task
Development of a task management application, a system where users can log in, add, edit, and view tasks.

## Project Description
The main components of the application are:

### User
- **Attributes**: First Name, Last Name, Phone, Login, Password.
- **Roles**: "MANAGER", "CUSTOMER", "ADMINISTRATOR".

### Role
- **Types of Roles**: "MANAGER", "CUSTOMER", "ADMINISTRATOR".

### UserRoles
- **Relationship**: Defines the association between users and their roles.

### Task
- **Description**: Tasks that are created, edited, and viewed by users.
- **Purpose**: Tasks can be assigned to users.
- 
## User Information
- The "Admin" is the first user created, with access to all features.
  - **Username**: "Admin"
  - **Password**: "12345."
- A user with the "MANAGER" role can add tasks and edit the tasks they've created.

## Project Requirements
- Implementation of user login functionality.
- Ability to add, edit, and view tasks by users.
- Mechanism for assigning tasks to users.
- Ensuring password security using PBKDF2 algorithm with HMAC-SHA1.

## User Roles
1. **MANAGER**
    - **Description**: A user with the "MANAGER" role has the following capabilities:
      - Add Tasks: Can add new tasks to the task management system.
      - Edit Tasks: Can edit the tasks they have created.
2. **CUSTOMER**
    - **Description**: A user with the "CUSTOMER" role is limited to the following privileges:
      - View Tasks: Can view the list of tasks but does not have the authority to add or edit tasks directly.
      - Role Change Request: Can request a role change to "MANAGER" from the system administrator ("Admin") to gain additional task management capabilities.
3. **ADMINISTRATOR**
    - **Description**: The "ADMINISTRATOR" role has comprehensive access and administrative privileges:
      - Full System Access: Has access to all features within the task management system.
      - User Management: Can create initial user accounts, including the "Admin" user.
      - Role Management: Manages users and their roles through an administrative interface.
      - Access Control: Implements a mechanism for checking access rights to tasks based on user roles.
      - Security Enforcement: Ensures password security using the PBKDF2 algorithm with HMAC-SHA1.
      - Audit Trail: Provides the ability to audit user actions in the system.

## Deadline
- **13.02.2024**

## Evaluation Criteria
- **Functionality**: Workability of the main functions of the application.
- **Security**: Ensuring protection of user data, including storage and transmission of passwords.
- **Usability**: Intuitive interface for users of different roles.
- **Reliability**: No errors or unexpected application behavior.
- **Extensibility**: Ability to easily add new features and components in the future.
