# SpringBootLoginMySQL

The application demonstrates simple login page, which compares the given username and password to the ones in MySQL database 'loginmysql'. 

## Create the database:

```mysql
create database loginmysql;
use loginmysql;
create table users
(
'id' SMALLINT(4) NOT NULL primary key auto_increment,
'username' VARCHAR(100) NOT NULL UNIQUE, 
'password' VARCHAR(100) NOT NULL, 
'role' SMALLINT(4) NOT NULL
);
insert into users values (1, 'admin', '$2a$10$wQS235XeYYePrtCTRE6XEeo.FZVX3oje08I.DnHOsBQGogMohnwua', 1);
insert into users values (2, 'user', '$2a$10$jNHBAp2FYcTECGmSkXVvnOQMqM7n35YwHpWTcHud3ibD6bQyI36pe', 2);
```

The passwords have been created by using the QuickPasswordEncodingGenerator, which is included with the project.
