DROP TABLE IF EXISTS books;
CREATE TABLE books (
   book_id INT(11) NOT NULL AUTO_INCREMENT  PRIMARY KEY,
   title varchar(100) NOT NULL,
   author varchar(500) NOT NULL,
   year_written INT(4) NOT NULL,
   edition varchar(20) NOT NULL,
   price decimal(7,3)
);

DROP TABLE IF EXISTS User;
CREATE TABLE User (
   user_id INT(11) NOT NULL AUTO_INCREMENT  PRIMARY KEY,
   username varchar(100) NOT NULL,
   password varchar(500) NOT NULL,
   role varchar(100) NOT NULL,
   fullname varchar(200) NOT NULL,
);