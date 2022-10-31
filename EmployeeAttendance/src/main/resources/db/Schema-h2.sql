CREATE SCHEMA epms; 

USE epms; 

CREATE TABLE `admin_attendance` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emp_name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

