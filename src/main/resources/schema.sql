drop table books if exists;
CREATE TABLE books (
                               id INT NOT NULL AUTO_INCREMENT,
                               bookId VARCHAR(255) NOT NULL,
                               bookTitle VARCHAR(255) NOT NULL,
                               releaseDate DATE NOT NULL,
                               genre VARCHAR(255) NOT NULL,
                               ISBN VARCHAR(255) NOT NULL,
                               coverImageLink VARCHAR(255),
                               description VARCHAR(255),
                               author VARCHAR(255) NOT NULL,
                               PRIMARY KEY (id)
);