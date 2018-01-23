/*
SQL COMMAND TYPE
========================
DDL: data defintion language
	-create : create structure 
	-alter  : modify structure  
	-drop	: delete structure 
	-truncate : vacant table , remove all rows however structure will remain same
DML: data manipulation language
	-insert : save data row 
	-update : modify data values  
	-delete	: remove data  
DCL: data control/decisin control language
	-create user
	-grant access
	-revoke access

TCL : transaction control language 
	-begin transaction 
	-commit
	-rollback 
DQL : data query language 
	-select : view data 
*/
--create database : database is known as schema 
		: collection of data in tabular format and different types of object
			i. table
			ii. view
			iii. function 
			iv. trigger
			v. procedure 
--
create database Sales

--swithc database/change database
use sales 

-- create table table
create table product
(
pid int,
pname varchar(100),
price int,
mfd date
)
--view table data , * : show all columns 
select * from product

select pid,pname from product

--innert data 
insert into product
values(1,'dove',40,'2017-12-01')

insert into product
values
(2,'hp laptop',40000,'2017-12-01'),
(3,'sony phone',20000,'2017-12-01'),
(4,'lux',30,'2015-12-01'),
(5,'pa',50,'2016-12-01'),
(6,'lakme',400,'2018-01-01')


--selection : where : filter : search 
select * from product where price> 100
select * from product where pid =2
select * from product where pname  ='lakme'

--projection : view selected column 
select pid,pname,price  
from product
where price>100

--update
update product
set price= 900
where pname ='lakme'

select * from product

--delete row 
delete from product --remove all rows 
delete from product where pid  =1 --remove selected row 

--alter table and add new column sprice 
select * from product

alter table product
add sprice int 

--alter table , and modify column 
alter table product
alter column sprice float 

--alter table , drop column 
alter table product
drop column sprice 


--drop table 
drop table product 

select * from product

 
 --truncate table 
 truncate table product 

--expression 
select *,price *10 as newprice  from product 

--keword 
select top 2 * from product 
select distinct * from product 

--order by 
select * from product 
order by price asc 

select * from product 
order by price desc

select * from product 
order by pname asc 


--group by 
select mfd, count(*) from product 
group by mfd 

select max(price) from product 

select min(price) from product 

select avg(price) from product 
-----
select * From product 
where pname like '%a%' --contains a 

select * From product 
where pname like 'a%' --start with a

select * From product 
where pname like '%a' --end with a 


select * From product 
where emailid like '%@gmail.com' 

select * From product 
where pname like 'p__'



select * into newtable from product 
order by price --asc


select * from newtable


--function 
select getdate()

select DATEPART(yyyy, getdate())
select DATEPART(MONTH, getdate())
select DATEPART(DAYOFYEAR, getdate())
select DATEPART(DAY, getdate())

select DATEPART(WEEK, getdate())

select DATEPART(QUARTER, getdate())

select DATEPART(WEEKDAY, getdate())

select DATEADD(yyyy,4,getdate())

select DATEPART(weekday, DATEADD(yyyy,4,getdate()))

select DATEDIFF(yyyy,'1995-12-13',getdate())

select DATEDIFF(MONTH,'1995-12-13',getdate())

select DATEDIFF(HOUR,'1995-12-13',getdate())



























