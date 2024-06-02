create database Lab5
go
drop database Lab5
go
use Lab5
go

drop table Product
go
create table Product(
	id varchar(30) primary key,	
	nameProduct nvarchar(100),
)

drop table Category
go
create table Category(
	id varchar(30) primary key,
	nameCategory nvarchar(100),
	product varchar(30) references Product (id) 
)

insert into Product values('SP01',N'Bia')
insert into Product values('SP02',N'Nước ngọt')
insert into Product values('SP03',N'Thuốc lá')
insert into Product values('SP04',N'Dầu gội')
go
insert into Category values('001',N'Nước giải khát','SP01')
insert into Category values('002',N'Nước giải khát','SP02')
insert into Category values('003',N'Chất kích thích','SP03')
insert into Category values('004',N'Nhu yếu phẩm','SP04')


select * from Product
go

select * from Category
go