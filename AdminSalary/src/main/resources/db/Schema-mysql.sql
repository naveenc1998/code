USE epms;  

DROP TABLE IF EXISTS admin_salary; 

CREATE TABLE epms.admin_salary ( 

id INT NOT NULL AUTO_INCREMENT, 

emp_name VARCHAR(255),
 
deductions VARCHAR(255),

net_pay VARCHAR(255),

month VARCHAR(255),

); 