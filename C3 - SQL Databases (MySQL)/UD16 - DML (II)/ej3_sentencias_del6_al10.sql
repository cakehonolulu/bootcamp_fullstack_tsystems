use actividades;

-- 6.obtener los codigos de los almacenes en los cuales el
-- valor medio de las cajas sea suerior a 150 euros
select codigo from almacenes join cajas on 
almacenes.codigo = cajas.almacen group by almacenes.codigo
having avg(cajas.valor) > 150;

-- 7.obtener el numero de referencia de cada caja junto con 
-- nombre de la ciudad en el que se encuentra
select cajas.numreferencia, almacenes.LUGAR from almacenes join cajas on
cajas.almacen= almacenes.CODIGO;

-- 8.obtener el numero de cajas que hay en cada almacen
select count(cajas.numreferencia), almacenes.CODIGO from cajas join almacenes on
cajas.almacen = almacenes.codigo group by almacenes.codigo;


-- 9.obtener los codigos de los almacenes que estan saturados
-- (los almacenes donde el numero de cajas es superior a la capacidad)
select codigo from almacenes where capacidad < (select count(NUMREFERENCIA) from cajas where almacen = codigo);

-- 10.obtener los numeros de referencia de las cajas que estan en Bilbao
select numreferencia from almacenes join cajas on 
cajas.almacen = almacenes.codigo
 where lugar ="Bilbao";
