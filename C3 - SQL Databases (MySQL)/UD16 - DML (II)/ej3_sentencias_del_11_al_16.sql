#3.11
insert into almacenes values(6, "Barcelona", 3);
#3.12
insert into cajas values("H5RT", "Papel", 200, 2);
#3.13
update cajas set valor=valor-(valor*0.15);
#3.14
update cajas set valor=valor-(valor*0.25) where valor > (select valor from (select avg(valor) from cajas) as valor);#//?
#3.15
delete from cajas where valor<100;
#3.16
delete from cajas where almacen in (select codigo from (select codigo from almacenes where capacidad<(select count(numReferencia) from cajas where almacen >0)) as c);#//?

