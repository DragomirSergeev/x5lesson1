drop table if exists accounts;
create table if not exists accounts(
id int(20) not null,
holder varchar (30) not null,
amount int(20) not null
);