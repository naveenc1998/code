USE emps;  

DROP TABLE IF EXISTS admin_attendance ; 

CREATE TABLE `admin_attendance` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date` DATE DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emp_name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

