USE epms;  

DROP TABLE IF EXISTS Admin_Work_Schedule; 

CREATE TABLE epms.Admin_Work_Schedule ( 

id INT PRIMARY KEY  AUTO_INCREMENT, 

emp_name VARCHAR(255), 

work_date date(255),

work_time VARCHAR(255),

work_shift VARCHAR(255),

work_status VARCHAR(255),



); 