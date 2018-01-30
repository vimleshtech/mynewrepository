
--create database
create database db_test
--
use db_test 


--create table 
create table emp
(
eid int,
name varchar(100),
sal  int 
)

--view table data , * : show all columns 
select * from emp 

--insert data 
insert into emp(eid,name,sal)
values(3,'chahat',40000)

insert into emp(eid,name,sal)
values(2,'jatin',30000)


--insert multiple rows
insert into emp(eid,name,sal)
values
(2,'rahul',40000),
(3,'rohit',30000),
(100,'divya',45000),
(30,'jatin',20000)





--update 
update emp 
set name ='raman sinha'
where eid = 1

--delete row 
delete from emp   -- delete all rows 
delete from emp where eid  =1

--alter tabel and add new column
alter table emp 
add gender varchar(10)

select * from emp 

--alter table drop columm
alter table emp 
drop column gender 

--truncate table : remove all rows , structure will remain same
truncate table emp 

--view data 
select * from emp 

--where  : filter rows
select * from emp 
where eid > 2

select * from emp 
where sal>40000

select * from emp 
where name  ='kshitiz'

--order by : to arrange data in asceding and descending order
select * from emp 
order by name asc 

select * from emp 
order by sal desc 

--group by  : to summrize data 
select name,count(*)
from emp 
group by name 


