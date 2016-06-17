Create database loginmysql;
USE loginmysql;
Create table `users`(
    `id` int(3) NOT NULL AUTO_INCREMENT, 
    `username` VARCHAR(100) NOT NULL, 
    `password` VARCHAR(100) NOT NULL, 
    `role` TINYINT(4) NOT NULL,
    primary key (`id`)
);

INSERT INTO users (id, username, password, role)
VALUES
("1", "user", "password", "1");

