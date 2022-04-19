DROP DATABASE IF EXISTS empleados;
CREATE DATABASE empleados;
USE empleados;


CREATE TABLE departamentos (
	dpto_id INTEGER,
	nombre VARCHAR(25),
	localidad VARCHAR(20),
	PRIMARY KEY (dpto_id)
	
);

CREATE TABLE empleados (
	empno_id INTEGER,
	nombre VARCHAR(30),
	oficio VARCHAR(20), 
	dir_id INTEGER,
	alta DATE,
	salario INTEGER,
	comision INTEGER,
	dpto INTEGER,
	PRIMARY KEY (empno_id),
	FOREIGN KEY (dpto) REFERENCES departamentos  (dpto_id),
	FOREIGN KEY (dir_id) REFERENCES empleados (empno_id)
);


INSERT INTO departamentos (dpto_id, nombre, localidad) VALUES
	(10, "Finanzas", "Huesca"),
	(20, "I+D", "Walqa-Cuarte"),
	(30, "Comercial", "Almudévar"),
	(40, "Producción", "Barbastro"),
	(50, "Marketing", "Zaragoza");

INSERT INTO empleados (empno_id, nombre, oficio, dir_id, alta, salario, comision, dpto) VALUES
	(1039, "Alberto Carrera Martín", "Presidente", NULL, "1999-10-27", 4900, NULL, 10),
	(1082, "Mario Carrera Bailín","Director", 1039, "2001-07-06", 3385, NULL,10),
	(1034, "Raquel Carrera Bailín","Empleado",1082, "2002-11-12", 2690, NULL,10),
    (2066, "Blanca Bailín Perarnau", "Director", 1039, "2001-07-12", 2970, NULL, 20), 
    (2002, "Araceli Carrera Salcedo", "Investigador", 2066, "2003-02-24",3000 ,NULL,20),
	(2069, "Fernando Carrera Martín", "Empleado", 2002, "2001-11-19",2840, NULL, 20),
	(2088, "Carmen Bailín Perarnau", "Investigador", 2066, "2001-10-19", 2600, NULL, 20),
	(2076, "Fernando Carrera Salcedo", "Empleado",2088, "2005-02-13", 2730,NULL, 20),
	(3098, "Fernando Martínez Pérez", "Director",  1039, "2000-02-03", 3150,  NULL, 30),
	(3099, "Belén Carrera Sausán", "Comercial", 3098, "2000-02-22", 2500, 500, 30),
	(3051, "Enrique Casado Alvarez", "Comercial", 3098, "2002-07-23", 2600, 550, 30),
	(3054, "Antonio Mériz Piedrafita", "Comercial", 3098, "2003-03-22", 2600, 1000, 30),
	(3044,"Lorenzo Blasco González", "Comercial", 3098, "2001-03-07", 2350, 400 , 30),
	(3000,"Javier Escartín Nasarre", "Empleado", 3098, "2003-07-13", 2435, NULL, 30);
  --
  --
  CREATE OR REPLACE VIEW estadisticas AS
SELECT dpto_id "Departamento", d.nombre "Nombre", count(empno_id) "Nº Empleados", 
		sum(ifnull(salario,0)) "Total Salario", sum(ifnull(comision,0)) "Total Comisión"
FROM  departamentos d  LEFT JOIN empleados  e
ON d.dpto_id = e.dpto
group by dpto_id;
 -- 
 -- 
  DELIMITER $$
  CREATE FUNCTION totalEmpleados (departamento INT)
  -- Si el número de departamento es 0 devuelve el total de empleados
  -- Para cualquier otro número devuelve el total de empleados de ese departamento
  RETURNS int
  READS SQL DATA
  BEGIN
        IF (departamento=0) THEN
			RETURN (SELECT COUNT(*) FROM empleados);
		ELSE
			RETURN (SELECT COUNT(*) FROM empleados WHERE dpto = departamento);
		END IF;        
  END$$
  
  CREATE PROCEDURE insertaDepartamento (IN numero INT, IN nombre VARCHAR(25), IN localidad VARCHAR(20), OUT resultado INT)
  -- Si la inserción es correcta devuelve 1, 
  -- Si el departamento está repetido devuelve 1062, para cualquier otro error devuelve 0
  BEGIN
	DECLARE EXIT HANDLER FOR 1062  SET resultado =1062; -- departamento repetido
	DECLARE EXIT HANDLER FOR SQLEXCEPTION  SET resultado =0; -- cualquier otro error
    INSERT INTO departamentos VALUES (numero, nombre, localidad);
    SET resultado=1;
  END$$
	

 
  
