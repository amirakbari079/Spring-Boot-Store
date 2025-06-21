create table users
(
    id       bigint auto_increment
        primary key,
    name     varchar(255) charset utf8mb3 not null,
    email    varchar(255) charset utf8mb3 not null,
    password varchar(255) charset utf8mb3 null
);

create table address
(
    id      bigint auto_increment
        primary key,
    street  varchar(255) charset utf8mb3 not null,
    city    varchar(255) charset utf8mb3 not null,
    zip     varchar(255) charset utf8mb3 not null,
    user_id bigint                       not null,
    constraint address_users_id_fk
        foreign key (user_id) references users (id)
);

