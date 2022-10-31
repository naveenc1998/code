CREATE SCHEMA mphasisdb; 

USE mphasisdb; 

CREATE TABLE mphasisdb.book ( 

book_id INT NOT NULL AUTO_INCREMENT, 

book_title VARCHAR(255),
 
book_publisher VARCHAR(255),

book_pages INT,

book_year INT

); 