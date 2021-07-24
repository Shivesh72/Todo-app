# Todo-app
# TITLE: - ToDo App
## Introduction: -
TODO means "to do" or “to be done”. Something that someone will need to do or wants to do. It’s something like setting a target to achieve within some period of time. A short goal or a list of activities to be done or to achieve can be set in the “todo” list.

### Using Technologies: - HTML, CSS, JAVASCRIPT, jsp and Servlets, JDBC and MYSQL database
### IDE Tools: - NetBeans and VScode 
### Used Server: - Tomcat 
### Used libraries and their versions: -
  	• For server- Tomcat 9.0
			• For database – MySQL 8.0
			• For ide – NetBeans 12.0
			• Java version- jdk15 whereas it will work on all jdk8 and above
			• Used libraries (jar file)- jstl-1.2
			• Used browser- google chrome, whereas it will work on all browsers that supports basic above used technologies or can use the internal browser as well.
### Database: -Database has 2 tables. One is of users table and the other is todos table. Users table will store the user details that will be used to login And the todos table will store all the todo related details.

#### The table description is:
CREATE TABLE `users` (
`id` int(3) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(20) DEFAULT NULL,
 `last_name` varchar(20) DEFAULT NULL,
 `username` varchar(250) DEFAULT NULL,
 `password` varchar(20) DEFAULT NULL,
 PRIMARY KEY (`id`)
) 
CREATE TABLE `todos` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `description` varchar(255) DEFAULT NULL,
 `is_done` bit(1) NOT NULL,
 `target_date` datetime(6) DEFAULT NULL,
 `fid` int(3) NOT NULL references users (id),
 `title` varchar(255) DEFAULT NULL,
 PRIMARY KEY (`id`)
) 
## Implementation: -
	Shortly, in this todo web-app firstly a person has to register themselves and then they can login to their respective todo page using 
	their username and password that they have registered themselves with, where they can create their list of to-dos that they want to do or 
	achieve and they can see their whole list also. This app will be of great usage to the students and the office person to set goals and then chasing them. 
  ## User Registration Page: -
	In this page the user has to first register themselves. They have to give their name, user-name and password and then submit the details. 
	After this they will be needing the username and password through which they will login.After entering all the details, they can click on submit button and a 
	message will be shown in the notification area that they have successfully registered themselves. 
  ### Login page: -
 	This is basically the home page of this todo app where the users will login and they can reach to their respective todo page where they can 
 	add a new Todo task and edit or delete the already present to-do’s. 
  ### To-do list page: -
	After logging in this page will be shown where any user can then view 
	their todo list or they can click on the “Add ToDo” button to add a new todo.
  ### Add to-do page (todo form): -
	This page will be shown when user will click on the “Add ToDo” button. Here the user can add a new todo by filling in the basic details 
	of the todo like title, description, status and target date and then save after that this todo will also be visible with all the other todos. 

## This project has been made by 
## Shivesh Bharti
## MCA, NIT RAIPUR
