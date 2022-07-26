CREATE DATABASE  IF NOT EXISTS `todoapp`;
USE `todoapp`;
--
DROP TABLE IF EXISTS `TODO_NOTES`;
DROP TABLE IF EXISTS `USERS`;
--
CREATE TABLE `TODO_NOTES`(
	`ID` int not null auto_increment,
    `USER` varchar(20) not null,
    `DESCRIPTION` varchar(20) not null,
    `TARGET_DATE` date not null,
    `IS_DONE` boolean default true,
    primary key (`ID`)
) engine=InnoDB auto_increment=1 default charset=latin1;
--
CREATE TABLE `USERS`(
	`ID` int not null auto_increment,
    `FULL_NAME` varchar(20) not null,
    `USER_NAME` varchar(20) not null,
    `PASSWORD` varchar(20) not null,
    primary key (`ID`)
) engine=InnoDB auto_increment=1 default charset=latin1;
--
INSERT INTO todoapp.todo_notes (ID, USER, DESCRIPTION, TARGET_DATE, IS_DONE)
VALUES (1, "CosmeFulano", "Learn Spring MVC", 2022-08-12, false);
INSERT INTO todoapp.todo_notes (ID, USER, DESCRIPTION, TARGET_DATE, IS_DONE)
VALUES (2, "CosmeFulanito", "Learn Hibernate", 2022-08-12, false);
INSERT INTO todoapp.todo_notes (ID, USER, DESCRIPTION, TARGET_DATE, IS_DONE)
VALUES (3, "CosmeFulanito", "Learn AOP", 2022-08-12, false);