use ud14;

INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (84492730, "ABC", "SANTIAGO ARES", 999999998, 20);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (69276486, "DEF", "RUBEN TRINIDAD", 888888888, 21);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (81706358, "GHI", "SONIA MAGAÑA", 777777777, 22);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (11874046, "JKL", "CARLA BARRERA", 666666666, 23);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (11217924, "MNO", "ALVARO SALGUEIRO", 555555555, 24);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (89127083, "PQR", "LUIS FERRERO", 444444444, 25);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (59116090, "STU", "SANDRA PALACIO", 333333333, 26);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (95386097, "VWX", "INES HERMOSO", 222222222, 27);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (27452645, "YZ0", "TOMAS BAEZA", 111111111, 28);
INSERT INTO alumno (dni, direccion, nombre, telefono, edad) values (46301756, "123", "MARGARITA DONCEL", 000000000, 29);

INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (1, 84492730, 1, 999999998, "ABC", "ABC");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (2, 69276486, 2, 888888887, "DEF", "DEF");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (3, 81706358, 3, 777777776, "GHI", "GHI");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (4, 11874046, 4, 666666665, "JKL", "JKL");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (5, 11217924, 5, 555555554, "MNO", "MNO");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (6, 89127083, 6, 444444443, "PQR", "PQR");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (7, 59116090, 7, 333333332, "STU", "STU");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (8, 95386097, 8, 222222221, "VWX", "VWX");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (9, 27452645, 9, 111111110, "YZ0", "YZ0");
INSERT INTO empresa(codigo_empresa, dni, cif, telefono, direccion, nombre) values (10, 46301756, 10, 000000009, "123", "123");

INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (96978471, "MARIO", "MANCHADO", "ABC", 999999998);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (79095001, "MARCOS", "SIMO", "DEF", 888888888);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (52484120, "CLAUDIA", "LLORENS", "GHI", 777777777);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (72749113, "LUCIA", "FARIÑAS", "JKL", 666666666);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (11602080, "TOMAS", "BORGES", "MNO", 555555555);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (65051393, "ESTEBAN", "SILVESTRE", "PQR", 444444444);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (73390184, "ISABEL", "CENTENO", "STU", 333333333);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (64378945, "LORENA", "CODINA", "VWX", 222222222);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (51359737, "JULIO", "RIQUELME", "YZ0", 111111111);
INSERT INTO profesor(dni, nombre, apellido, direccion, telefono) values (32391184, "CLAUDIA", "URRUTIA", "123", 000000000);

INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				0, 96978471, 0, 60, "ABC", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 0);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				1, 79095001, 1, 60, "DEF", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 1);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				2, 52484120, 2, 60, "GHI", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 2);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				3, 72749113, 3, 60, "JKL", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 3);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				4, 11602080, 4, 60, "MNO", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 4);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				5, 65051393, 5, 60, "PQR", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 5);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				6, 73390184, 6, 60, "STU", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 6);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				7, 64378945, 7, 60, "VWX", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 7);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				8, 51359737, 8, 60, "YZ0", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 8);
INSERT INTO curso(codigo_curso, profe, programa, horas, titulo, fecha_inicio, fecha_fin, numero) values (
				9, 32391184, 9, 60, "123", CURDATE(), CURDATE() + INTERVAL 2 MONTH, 9);
                
INSERT INTO tienen(nota, codigo_curso, dni) values (0, 0, 84492730);
INSERT INTO tienen(nota, codigo_curso, dni) values (1, 1, 69276486);
INSERT INTO tienen(nota, codigo_curso, dni) values (2, 2, 81706358);
INSERT INTO tienen(nota, codigo_curso, dni) values (3, 3, 11874046);
INSERT INTO tienen(nota, codigo_curso, dni) values (4, 4, 11217924);
INSERT INTO tienen(nota, codigo_curso, dni) values (5, 5, 89127083);
INSERT INTO tienen(nota, codigo_curso, dni) values (6, 6, 59116090);
INSERT INTO tienen(nota, codigo_curso, dni) values (7, 7, 95386097);
INSERT INTO tienen(nota, codigo_curso, dni) values (8, 8, 27452645);
INSERT INTO tienen(nota, codigo_curso, dni) values (9, 9, 46301756);

DELETE FROM tienen WHERE dni = 46301756;

DELETE FROM curso WHERE codigo_curso = 9;

DELETE FROM empresa WHERE codigo_empresa = 10;

DELETE FROM alumno WHERE dni = 46301756;

-- Inseguro? MySQL Workbench se queja de que no borro mediante Primary Key usando un WHERE.
-- Pero DNI *es* la Primary Key de Profesor
-- Desactivamos momentáneamente la variable SQL_SAFE_UPDATES *sólo* para este DELETE
SET SQL_SAFE_UPDATES = 0;

-- Borramos...
DELETE FROM profesor WHERE dni = 32391184;

-- IMPORTANTE: Reactivamos la variable SQL_SAFE_UPDATES
SET SQL_SAFE_UPDATES = 1;

