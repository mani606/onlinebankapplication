DROP TABLE IF EXISTS userregistration;
  
CREATE TABLE userregistration (
  id int AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  phonenumber int,
  pannumber int
);

insert into userregistration values('user','name','user@gmail.com',348654,46646);
insert into userregistration values('user','name1','user1@gmail.com',358654,456646);
insert into userregistration values('user','name2','user2@gmail.com',344654,46546);
insert into userregistration values('user','name3','user3@gmail.com',348654,466546);
insert into userregistration values('user','name4','user4@gmail.com',345654,465646);
insert into userregistration values('user','name5','user5@gmail.com',3486541,466462);
insert into userregistration values('user','name6','user6@gmail.com',3486542,466464);
insert into userregistration values('user','name7','user7@gmail.com',348654,466467);
insert into userregistration  values('user','name8','user8@gmail.com',348654,466246);


	CREATE TABLE account (  id int AUTO_INCREMENT  PRIMARY KEY, accountid int NOT NULL,
uid int not null,  createddate Date,  foreign key(uid) references userregistration(uid)
);


