create table users (
       id integer not null auto_increment,
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        role varchar(255),
        username varchar(255),
        primary key (id)
    ) engine=InnoDB