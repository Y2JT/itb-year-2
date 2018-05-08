/* Create the table for books */
CREATE TABLE Books (
BookID int NOT NULL,
BookTitle varchar(255),
BookAuthor varchar(255),
BookPublisher varchar(255),
BookCondition varchar(255),
BookReleaseDate date NOT NULL,
BookLoanDate date,
BookReturnDate date,
PRIMARY KEY (BookID)
)

/*Create the table for users */
CREATE TABLE Users (
UserID int NOT NULL,
Username varchar(255),
Password varchar(40)
)

/*Insert the values into books - will update with loan dates, return dates and new coniditons */
INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Miss Peregrines Home for Peculiar Children', 'Ransom Riggs', 'Quirk Books', 'Good', '2013-08-13');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('The Very Hungry Caterpillar', 'Eric Carle', 'Penguin Books Ltd', 'Good', '2001-03-05');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('The Little Prince', 'Antoine de Saint-Exupery', 'Wordsworth Editions Ltd', 'Good', '1999-03-05');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Thing Explainer : Complicated Stuff in Simple Words', 'Randall Munroe', 'Hodder & Stoughton General Division', 'Good', '2015-11-24');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Harry Potter and the Philosophers Stone', 'J.K. Rowling', 'Bloomsbury Publishing PLC', 'Good', '1997-06-26');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Gangsta Granny', 'David Walliams', 'HarperCollins Publishers', 'Good', '2013-02-08');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('The Raven King', 'Maggie Stiefvater', 'Scholastic US', 'Good', '2016-04-26');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('The Journey', 'Francesca Sanna', 'Flying Eye Books', 'Good', '2016-09-13');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Cloth Lullaby', 'Amy Novesky', 'Abrams', 'Good', '2016-05-24');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Pax', 'Sara Pennypacker', 'HarperCollins Publishers', 'Good', '2016-12-16');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Cry Heart, but Never Break', 'Glen Ringtved', 'ENCHANTED LION BOOKS', 'Good', '2016-02-25');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('The Day I Became a Bird', 'Ingrid Chabbert', 'Kids Can Press', 'Good', '2016-09-06');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('The Sound of Silence', 'Katrina Goldsaito', 'Little, Brown & Company', 'Good', '2016-08-26');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Pinocchio: The Origin Story', 'Alessandro Sanna', 'ENCHANTED LION BOOKS', 'Good', '2016-08-23');

INSERT INTO Books (BookTitle, BookAuthor, BookPublisher, BookCondition, BookReleaseDate)
VALUES ('Daytime Visions', 'Isol', 'ENCHANTED LION BOOKS', 'Good', '2016-05-10');

/*Check table */
SELECT *
FROM books;