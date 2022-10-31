
USE epms;  

DROP TABLE IF EXISTS user; 

CREATE TABLE epms.user ( 

id INT PRIMARY KEY  AUTO_INCREMENT, 

username VARCHAR(255), 

name VARCHAR(255),

password VARCHAR(255),

role VARCHAR(255),

token VARCHAR(255)

); 