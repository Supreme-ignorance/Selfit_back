create database IF NOT EXISTS ssafy_health;
use ssafy_health;

DROP table IF EXISTS user;
create table user (
                      id varchar(20) not null unique,
                      password varchar(20) not null,
                      username varchar(20) not null,
                      nickname varchar(20) not null,
                      email varchar(50) not null,
                      age int not null default 0,
                      gender varchar(12) not null,
                      primary key(id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

DROP table IF EXISTS video;
CREATE TABLE IF NOT EXISTS video (
    video_id VARCHAR(20),
    video_title VARCHAR(20) NOT NULL,
    channel_name VARCHAR(45) NOT NULL,
    workout_part varchar(20) not null,
    view_cnt INT DEFAULT 0,
    like_cnt INT DEFAULT 0,
    PRIMARY KEY (video_id)
    )
    ENGINE = InnoDB;

DROP table IF EXISTS review;
CREATE TABLE review (
                        review_id int NOT NULL AUTO_INCREMENT,
                        video_iduser varchar(20) not null,
                        writer varchar(20) NOT NULL,
                        title varchar(50) NOT NULL,
                        content text,
                        reg_date timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                        view_cnt int DEFAULT '0',
                        PRIMARY KEY (review_id),
                        Foreign key (writer) references user(id),
                        Foreign key (video_id) references video(video_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

DROP table IF EXISTS comment;
CREATE TABLE comment (
                         comment_id int NOT NULL AUTO_INCREMENT,
                         review_id int not null,
                         writer varchar(20) NOT NULL,
                         content varchar(300),
                         reg_date timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                         PRIMARY KEY (comment_id),
                         Foreign key (writer) references user(id),
                         Foreign key (review_id) references review (review_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS liked_video ;
CREATE TABLE IF NOT EXISTS liked_video (
                                           lv_index INT NOT NULL AUTO_INCREMENT,
                                           user_id VARCHAR(20) NOT NULL,
    likedvideo_id VARCHAR(20) NOT NULL,
    PRIMARY KEY (lv_index),
    Foreign key (user_id) references user(id),
    Foreign key (likedvideo_id) references video(video_id)
    )
    ENGINE = InnoDB;

DROP table IF EXISTS friend;
CREATE TABLE IF NOT EXISTS friend (
                                      follow_index INT NOT NULL AUTO_INCREMENT,
                                      user_id varchar(20) NOT NULL,
    follower_id varchar(20) NOT NULL,
    PRIMARY KEY (follow_index),
    Foreign key (user_id) references user(id),
    Foreign key (follower_id) references user(id)
    )
    ENGINE = InnoDB;


INSERT INTO video
VALUES ("ssafy", "나만 아는 비디오", "ssafy", "허리", 0, 0);

select *
From liked_video;create database IF NOT EXISTS ssafy_health;
use ssafy_health;

DROP table IF EXISTS user;
create table user (
                      id varchar(20) not null unique,
                      password varchar(20) not null,
                      username varchar(20) not null,
                      nickname varchar(20) not null,
                      email varchar(50) not null,
                      age int not null default 0,
                      gender varchar(12) not null,
                      primary key(id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

DROP table IF EXISTS video;
CREATE TABLE IF NOT EXISTS video (
    video_id VARCHAR(20),
    video_title VARCHAR(20) NOT NULL,
    channel_name VARCHAR(45) NOT NULL,
    workout_part varchar(20) not null,
    view_cnt INT DEFAULT 0,
    like_cnt INT DEFAULT 0,
    PRIMARY KEY (video_id)
    )
    ENGINE = InnoDB;

DROP table IF EXISTS review;
CREATE TABLE review (
                        review_id int NOT NULL AUTO_INCREMENT,
                        video_iduser varchar(20) not null,
                        writer varchar(20) NOT NULL,
                        title varchar(50) NOT NULL,
                        content text,
                        reg_date timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                        view_cnt int DEFAULT '0',
                        PRIMARY KEY (review_id),
                        Foreign key (writer) references user(id),
                        Foreign key (video_id) references video(video_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

DROP table IF EXISTS comment;
CREATE TABLE comment (
                         comment_id int NOT NULL AUTO_INCREMENT,
                         review_id int not null,
                         writer varchar(20) NOT NULL,
                         content varchar(300),
                         reg_date timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                         PRIMARY KEY (comment_id),
                         Foreign key (writer) references user(id),
                         Foreign key (review_id) references review (review_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS liked_video ;
CREATE TABLE IF NOT EXISTS liked_video (
                                           lv_index INT NOT NULL AUTO_INCREMENT,
                                           user_id VARCHAR(20) NOT NULL,
    likedvideo_id VARCHAR(20) NOT NULL,
    PRIMARY KEY (lv_index),
    Foreign key (user_id) references user(id),
    Foreign key (likedvideo_id) references video(video_id)
    )
    ENGINE = InnoDB;

DROP table IF EXISTS friend;
CREATE TABLE IF NOT EXISTS friend (
                                      follow_index INT NOT NULL AUTO_INCREMENT,
                                      user_id varchar(20) NOT NULL,
    follower_id varchar(20) NOT NULL,
    PRIMARY KEY (follow_index),
    Foreign key (user_id) references user(id),
    Foreign key (follower_id) references user(id)
    )
    ENGINE = InnoDB;


INSERT INTO video
VALUES ("ssafy", "나만 아는 비디오", "ssafy", "허리", 0, 0);

select *
From liked_video;