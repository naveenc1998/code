CREATE SCHEMA epms; 

USE epms;

CREATE TABLE epms.employees ( 

id INT PRIMARY KEY  AUTO_INCREMENT, 

emp_name VARCHAR(255), 
 
date_of_joining DATE,

gender VARCHAR(255),

age INT,

designation VARCHAR(255),

email VARCHAR(255),

password VARCHAR(255)

); 