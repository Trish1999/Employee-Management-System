# Employee Management System

This is a web-based Employee Management System built using Java Servlets, JSP, and XML. The application provides two types of login portals: one for Admin and another for Employees. It performs CRUD (Create, Read, Update, Delete) operations, with all data stored in an Oracle database.

## Features

### Admin Portal:
- Admins can log in to the Admin Dashboard.
- Full access to the employee database.
- Perform CRUD operations on all employee records:
  - **Create:** Add new employee records.
  - **Read:** View details of all employees.
  - **Update:** Modify existing employee information.
  - **Delete:** Remove employee records.
  
### Employee Portal:
- Employees can log in to the Employee Dashboard.
- Limited access to personal data:
  - **Read:** View personal employee details.
  - **Update:** Modify their own information.

## Technology Stack
- **Backend:** Java Servlets, JSP
- **Frontend:** JSP, HTML, CSS
- **Database:** Oracle Database
- **Other:** XML for configuration

## How to Run
1. Ensure you have Java, Tomcat server, and Oracle Database installed.
2. Configure the database with the provided SQL scripts to set up the employee data schema.
3. Deploy the project on a Tomcat server.
4. Access the application via:
   - Admin Portal: `/admin-login`
   - Employee Portal: `/employee-login`

## CRUD Operations
- **Admin:** Can add, edit, delete, and view all employees.
- **Employee:** Can view and update their personal information only.

## Database
All employee data is securely stored in an Oracle database, and CRUD operations are performed using SQL queries executed through the Java Servlet.

