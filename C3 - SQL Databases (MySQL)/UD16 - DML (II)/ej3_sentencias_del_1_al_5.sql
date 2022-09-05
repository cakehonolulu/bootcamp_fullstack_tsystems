use actividades;
-- 1.obtener todos los almacenes;
select * from almacenes;

-- 2.obtener todas las cajas cuyo contenido tenga un valor superior a 150 euros
select * from cajas where valor >=150;

-- 3.obtener los tipos de contenidos de las cajas
select contenido from cajas group by contenido;

-- 4.obtener el valor medio de todas las cajas
select avg(valor) from cajas;

-- 5.obtener el valor medio de las cajas de cada almacen
select avg(valor),almacen from cajas group by almacen;