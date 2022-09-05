USE `actividades`;

-- Inserts
-- Fill 'departamentos' table
insert into departamentos(CODIGO, NOMBRE, PRESUPUESTO)
values
	(1, "ABC", 10.0),
    (2, "DEF", 20.0),
    (3, "GHI", 30.0),
    (4, "HJK", 40.0),
    (5, "LMN", 50.0),
    (6, "OPQ", 60.0),
    (7, "RST", 70.0),
    (8, "UVW", 80.0),
    (9, "XYZ", 90.0),
    (10, "012", 190.0);
    
-- Fill 'empleados' table
insert into empleados(DNI, NOMBRE, APELLIDOS, DEPARTAMENTO)
values
	("61896510", "A", "B" , 1),
    ("49843690", "C", "D" , 2),
    ("50489117", "E", "F", 3),
    ("31290305", "G", "H", 4),
    ("43028306", "I", "J", 5),
    ("70804115", "K", "L", 6),
    ("39177627", "M", "N", 7),
    ("36112237", "O", "P", 8),
    ("07413360", "Q", "R", 9),
    ("16582870", "S", "T", 10);

-- Queries

-- 1. Obtener los apellidos de los empleados.
select APELLIDOS from empleados;

-- 2. Obtener los apellidos de los empleados sin repeticiones.
select distinct APELLIDOS from empleados;

-- 3. Obtener todos los datos de los empleados que se apellidan 'Smith'.
select * from empleados where empleados.APELLIDOS = "Smith";

-- 4. Obtener todos los datos de los empleados que se apellidan 'Smith' y los que se apellidan 'Rogers'.
select * from empleados where empleados.APELLIDOS = "Smith" or empleados.APELLIDOS = "Rogers";

-- 5. Obtener todos los datos de los empleados que trabajan para el departamento 14.
select * from empleados inner join departamentos where empleados.DEPARTAMENTO = 14;

-- 6. Obtener todos los datos de los empleados que trabajan para el departamento 37 y para el departamento 77.
select * from empleados inner join departamentos where empleados.DEPARTAMENTO = 37 or empleados.DEPARTAMENTO = 77;

-- 7. Obtener todos los datos de los empleados cuyo apellido comienze por 'P'.
select * from empleados where empleados.APELLIDOS like 'P%';

-- 8. Obtener el presupuesto total de todos los departamentos.
select sum(PRESUPUESTO) from departamentos;

-- 9. Obtener el numero de empleados en cada departamento.
-- The select has 2 identities in order to display where the employees are.
select DEPARTAMENTO, count(DEPARTAMENTO) from empleados group by DEPARTAMENTO;

-- 10. Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento.
select * from empleados inner join departamentos where empleados.DEPARTAMENTO = departamentos.CODIGO;

-- 11. Obtener un listado completo de empleados, incluyendo el nombre y apellidos del empleado junto al nombre y presupuesto de su departamento.
select empleados.NOMBRE, empleados.APELLIDOS, empleados.DEPARTAMENTO, empleados.PRESUPUESTO from empleados
join departamentos where empleados.DEPARTAMENTO = departamentos.CODIGO;

-- 12. Obtener los nombres y apellidos de los empleados que trabajen en departamentos cuyo presupuesto sea mayor de 60.000 eur
select empleados.NOMBRE, empleados.APELLIDOS from empleados join departamentos where departamentos.PRESUPUESTO > 60000 and empleados.DEPARTAMENTO = departamentos.CODIGO;

-- 13. Obtener los datos de los departamentos cuyo presupuesto es superior al presupues-to medio de todos los departamentos.
select * from departamentos, (select avg(PRESUPUESTO) as PRESUPUESTO_PROMEDIO from departamentos) depts where departamentos.PRESUPUESTO > depts.PRESUPUESTO_PROMEDIO;

-- 14. Obtener los nombre (únicamente los nombres) de los departamentos que tienen más de dos empleados.
select depts.NOMBRE from (departamentos as depts inner join empleados on depts.CODIGO = empleados.DEPARTAMENTO) group by depts.NOMBRE having count(depts.NOMBRE) > 2;

-- 15. Añadir un nuevo departamento: 'Calidad', con presupuesto de 40000 eur y código11.
--	   Añadir un empleado vinculado al departamento recién creado: Esther Vázquez, DNI: 89267109

-- 'departamentos' Insert
insert into departamentos(CODIGO, NOMBRE, PRESUPUESTO)
values
	(11, "Calidad", 40000.00);

-- 'empleados' Insert
insert into empleados(DNI, NOMBRE, APELLIDOS, DEPARTAMENTO)
values
	(89267109, "Esther", "Vázquez", 11);
    
-- 16. Aplicar un recorte presupuestario del 10% a todos los departamentos.
-- 10% = x / 100 (1%) * 10
update departamentos set PRESUPUESTO = PRESUPUESTO - ((PRESUPUESTO / 100) * 10);

-- 17. Reasignar a los empleados del departamento de investigación ( código 77)
update empleados set DEPARTAMENTO = 14 where DEPARTAMENTO = 17;

-- 18. Despedir a todos los empleados que trabajan para el departamento de informática ( código 14).
delete from empleados where DEPARTAMENTO = 14;

-- 19. Despedir a todos los empleados que trabajen para departamentos cuyo presupuesto sea superior  a los 60000 eur.
delete empl from empleados as empl inner join departamentos where empl.DEPARTAMENTO = departamentos.CODIGO and departamentos.PRESUPUESTO > 60000;

-- 20. Despedir a todos los empleados.
delete from empleados;
