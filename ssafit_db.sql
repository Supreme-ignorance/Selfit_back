drop database if exists ssafit_db;
create database IF NOT EXISTS `ssafit_db`;
use ssafit_db;

DROP table IF EXISTS `user`;
create table IF NOT EXISTS `user` (
 `id` varchar(20) not null,
 `password` varchar(20) not null,
 `username` varchar(20) not null,
 nickname varchar(20) unique not null,
 email varchar(50) not null,
 age int not null,
 gender varchar(12) not null,
 user_level int default 1,
 user_exp int default 0,
 height int default -1,
 weight int default -1,
 info_disclose boolean default true,
 primary key(id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;
insert into `user` (id, `password`, username, nickname, email, age, gender)
values ("ssafy", "ssafy", "김싸피", "킹싸피", "ssafy@ssafy.com", 26, "man"),
("a", "a", "에이", "에이에이", "a@a.com", 28, "woman");



DROP table IF EXISTS `board`;
CREATE TABLE IF NOT EXISTS `board` (
  `board_seq` int auto_increment,
  `board_name` VARCHAR(50) NOT NULL,
  `board_detail` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`board_seq`)
  ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
insert into board(board_name, board_detail)
values ("자유게시판", "자유롭게 소통하세요~"),
("자랑게시판", "적당히 자랑하세요"),
("함께 운동해요", "함께 운동할 사람을 구하는 게시판");



DROP table IF EXISTS `video`;
CREATE TABLE IF NOT EXISTS `video` (
  `video_id` VARCHAR(20) not null,
  `video_title` VARCHAR(300) NOT NULL,
  `channel_name` VARCHAR(45) NOT NULL,
  `video_type` varchar(50) not null,
  `view_cnt` INT DEFAULT 0,
  `like_cnt` INT DEFAULT 0,
  PRIMARY KEY (`video_id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

insert into video(video_id, video_title, video_type, channel_name, view_cnt)
values ("gMaB-fG4u4g", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "홈트", "ThankyouBUBU", 0),
("swRNeYw1JkY", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", "홈트", "ThankyouBUBU", 0),
("54tTYO-vU2E", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", "홈트", "ThankyouBUBU", 0),
("QqqZH3j_vH0", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]", "홈트", "ThankyouBUBU", 0),
("tzN6ypk6Sps", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]", "홈트", "김강민", 0),
("u5OgcZdNbMo", "저는 하체 식주의자 입니다", "홈트", "GYM종국", 0),
("PjGcOP-TQPE", "11자복근 복부 최고의 운동 [복근 핵매운맛]", "홈트", "ThankyouBUBU", 0),
("7TLk7pscICk", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "홈트", "SomiFit", 0);


DROP table IF EXISTS `article`;
CREATE TABLE IF NOT EXISTS `article` (
  `board_seq` int,
  `article_id` int AUTO_INCREMENT,
  `writer` varchar(20) NOT NULL,
  `title` varchar(50) NOT NULL,
  `content` text not null,
  `reg_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `view_cnt` int DEFAULT '0',
  PRIMARY KEY (`article_id`),
  Foreign key (writer) references `user`(id),
  Foreign key (board_seq) references `board`(board_seq)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;
insert into article (board_seq, writer, title, content)
values ("1", "ssafy", "첫번째 게시글", "게시판이 생겼어요!!!!");


DROP table IF EXISTS `comment`;
CREATE TABLE IF NOT EXISTS `comment` (
  `comment_id` int AUTO_INCREMENT,
  `article_id` int not null,
  `writer` varchar(20) NOT NULL,
  `content` varchar(300),
  `left` int not null,
  `right` int not null,
  `reg_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`comment_id`),
  Foreign key (writer) references `user`(id),
  Foreign key (article_id) references article (article_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

insert into `comment` (article_id, writer, content, `left`, `right`)
values ("1", "ssafy", "첫번째 게시글의 첫번째 댓글이에용", 1, 2);


DROP TABLE IF EXISTS `liked_video` ;
CREATE TABLE IF NOT EXISTS `liked_video` (
  `lv_index` INT AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `video_id` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`lv_index`),
  Foreign key (user_id) references `user`(id),
  Foreign key (video_id) references `video`(video_id)
  ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;
insert into `liked_video` (user_id, video_id)
values ("ssafy", "gMaB-fG4u4g");

DROP table IF EXISTS `friend`;
CREATE TABLE IF NOT EXISTS `friend` (
  `follow_index` INT AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `follower_id` varchar(20) NOT NULL,
  PRIMARY KEY (`follow_index`),
  Foreign key (user_id) references `user`(id),
  Foreign key (follower_id) references `user`(id)
  ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;
insert into `friend` (user_id, follower_id)
values ("ssafy", "a"),
("a", "ssafy");

DROP table IF EXISTS `daily`;
CREATE TABLE IF NOT EXISTS `daily` (
  `daily_seq` INT AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `ex_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `ex_time` int not null,
  PRIMARY KEY (`daily_seq`),
  Foreign key (user_id) references `user`(id)
  ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;
  insert into `daily` (user_id, ex_time)
values ("ssafy", "50"),
("ssafy", "30");

-- select * from daily;
