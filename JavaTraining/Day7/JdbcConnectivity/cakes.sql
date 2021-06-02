create database if not exists shop;
use shop;

create table cakes (
   id int,
   name varchar(50),
   price float,
   primary key (id));
 
insert into cakes values (1, 'choco truffle', 55.5);
insert into cakes values (2, 'red velvet', 70.0);
insert into cakes values (3, 'black forest', 60.0);
 
select * from cakes;


