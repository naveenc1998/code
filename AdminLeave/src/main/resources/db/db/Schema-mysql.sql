USE mphasisdb;  

DROP TABLE IF EXISTS Book; 

CREATE TABLE mphasisdb.book ( 

book_id INT PRIMARY KEY  AUTO_INCREMENT, 

book_title VARCHAR(255), 
 
book_publisher VARCHAR(255),

book_pages INT,

book_year INT

); 