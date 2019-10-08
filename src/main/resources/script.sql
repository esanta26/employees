CREATE DATABASE IF NOT EXISTS employeesdb;
USE employeesdb;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200),
  `apellido` varchar(200),
  `fechanacimiento` date,
  `salario` numeric,
  PRIMARY KEY (`id`)
);

INSERT INTO `employeesdb`.`employees` (`nombre`, `apellido`, `fechanacimiento`, `salario`)
VALUES ('Juan', 'Murcia', '1996/11/11', '10000000');

