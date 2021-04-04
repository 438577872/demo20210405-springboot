
create database demo1;
use demo1;
drop table if exists user;
CREATE TABLE user
(
    id    BIGINT(20) auto_increment COMMENT '主键ID',
    name  VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age   INT(11)     NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

INSERT INTO user (name, age, email)
VALUES ('Jone', 18, 'Jone@baomidou.com'),
       ('Jack', 20, 'Jack@baomidou.com'),
       ('Johny', 20, 'Johny@baomidou.com'),
       ('Tom', 28, 'Tom@baomidou.com'),
       ('Alger', 21, 'Alger@baomidou.com'),
       ('Annie', 21, 'Annie@baomidou.com'),
       ('Sandy', 17, 'Sandy@baomidou.com'),
       ('Billie', 24, 'test5@baomidou.com'),
       ('Acker', 24, 'Acker@baomidou.com'),
       ('Andrew', 24, 'Andrew@baomidou.com'),
       ('Alice', 16, 'Alice@baomidou.com')
;