create table document(
Id integer primary  key auto_increment,
Title varchar(64) not null,
Content TEXT NOT NULL,
lastupdate timestamp  not null
);
create table menum(
id integer  primary   key auto_increment,
MenumName varchar(64) not null,
paretmenum integer  not null,
createdate timestamp  default CURRENT_TIMESTAMP,
documentid integer  default -1
);