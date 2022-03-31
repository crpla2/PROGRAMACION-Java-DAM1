DROP DATABASE IF EXISTS SAMPLE;
CREATE DATABASE SAMPLE;
USE SAMPLE;
CREATE TABLE Libros (idLibro INT NOT NULL, titulo VARCHAR(30), precio INT NOT NULL, CONSTRAINT claveLibro PRIMARY KEY (idLibro));
CREATE TABLE Autores (idAutor INT NOT NULL, nombre VARCHAR(30), nacionalidad VARCHAR(20),  CONSTRAINT claveAutor PRIMARY KEY (idAutor));
CREATE TABLE RelacionLibroAutor (idLibro INT, idAutor INT, CONSTRAINT claveRelacion PRIMARY KEY (idLibro, idAutor), CONSTRAINT claveLibroForanea FOREIGN KEY (idLibro) REFERENCES libros(idLibro), CONSTRAINT claveAutorForanea FOREIGN KEY (idAutor) REFERENCES autores(idAutor));
INSERT INTO Libros VALUES (1, 'Bambi', 3);
INSERT INTO Libros VALUES (2, 'Batman', 4);
INSERT INTO Libros VALUES (3, 'Spiderman', 2);
INSERT INTO Autores VALUES(1, 'Antonio', 'Español');
INSERT INTO Autores VALUES(2, 'Gerard', 'Frances');
INSERT INTO RelacionLibroAutor VALUES (1,1);
INSERT INTO RelacionLibroAutor VALUES (2,2);
INSERT INTO RelacionLibroAutor VALUES (3,2);


CREATE TABLE USUARIO (
username VARCHAR (20) PRIMARY KEY,
password VARCHAR (29),
nombre VARCHAR (40));
INSERT INTO USUARIO VALUES ('Alberto', '12345', 'Alberto Carrera Martín');
INSERT INTO USUARIO VALUES ('Belen', '67890', 'Belén Carrera Sausán');
INSERT INTO USUARIO VALUES ('admin', '54321', 'Administrador');
-- NOTA: LAS CLAVES NO SE GUARDAN ASÍ, SE ENCRIPTAN PREVIAMENTE....