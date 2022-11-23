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
("7TLk7pscICk", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "홈트", "소미핏 SomiFit", 0);

insert into video(video_id, video_title, video_type, channel_name, view_cnt)
values ("rIegQPbe6vE", "5 분만 있으면 이 코어 운동 루틴 해보세요!", "홈트", "줄리엔강 Julien Kang",  0),
        ("hJuO1AUqLUc", "ENG) 10MIN CORE WORKOUT I 하루10분 코어운동", "홈트", "힙으뜸",  0),
        ("Th2u76bWHnI", "🏅요일별운동🏅 월요일 속근육을 탄탄하게! 복근&코어 운동 루틴", "홈트", "힙으뜸",  0),
        ("C7gPeAgeBAk", "매일 해야하는 20분 기초 코어운동 - 속근육 강화, 균형감각 향상, 허리통증 완화 (Core workout)", "홈트", "빵느",  0),
        ("zcQ16cfJN9Q", "9분! 초간단 누워서하는 11자 복근운동", "홈트", "Thankyou BUBU",  0),
        ("QSZ0mUGO_CA", "(층간소음X, 설명O) 🔥짧고 굵게🔥 복근만들기 2주 챌린지", "홈트", "힙으뜸",  0),
        ("kETh8T3it4k", "(층간소음X, 설명O) 복근운동과 유산소를 한번에❗️서서하는 복근운동 1탄🔥", "홈트", "힙으뜸",  0),
        ("p623pewgTc0", "[10분] 성공적인 바프 (식스팩) 원한다면 이거하세요! 빠른결과 보장👍", "홈트", "소미핏 SomiFit", 0),
        ("jj6ze_eqmYI", "Lv.3 완벽한 복근을 만들기 위한 8분 루틴! 따라만하세요! (누구나 집에서도 가능) [8mins intense Abs Workout]", "홈트", "권혁TV", 0),
        ("sVQqBDBZhmI", "복부운동 짧고 굵게! 운동효율 갑! [6 MINS ABS WORKOUT]", "홈트", "소미핏 SomiFit", 0);
        
insert into video(video_id, video_title, video_type, channel_name, view_cnt)
values ("jabkT8Wtbsk", "헬스장 가서 뭘해야될지 모를때, 헬스장운동방법 이 영상 따라하기!! (하체운동, 상체운동 다 배워보자!)", "피트니스", "셀프미", 0),
("AtvBXGKCqCM", "헬스장이 처음인 헬린이들을 위한 한시간 루틴 추천👀‼(헬스장 이용 꿀팁 있음)", "피트니스", "빙그레핏", 0),
("tSFr-MZIB7s", "헬스초보, 눈치 보지말고 따라하세요!! 헬스기구 사용법+ 운동루틴 [체스트 프레스/랫풀다운/레그 익스텐션]", "피트니스", "핏블리 FITVELY", 0);


insert into video(video_id, video_title, video_type, channel_name, view_cnt)
values ("ZVKVZqafX1E", "올인원 운동 - 부담없는 30분 전신 근력운동 루틴 (NO 층간소음 요가 워크아웃)", "요가", "에일린 mind yoga", 0),
("1W9gMxLoW6Q", "[서리요가#20] 기초요가 필수동작(구ver) / 요가 입문을 위한 25분 요가플로우 / 스트레칭, 전굴, 측굴, 역자세 /새로운 버전은 링크에 !", "요가", "서리요가seoriyoga", 0);



insert into video(video_id, video_title, video_type, channel_name, view_cnt)
values ("sb51gF18cYo", "필라테스 개인레슨 받고 가세요💛 전신 구석구석 자극을 느낄 수 있어요 (Whole body workout)", "필라테스", "빵느", 0),
("tyb35HA55vE", "필라테스 개인레슨 받고 가세요💜 코어 바로잡기 (Whole body workout)", "필라테스", "빵느", 0),
("pc_hXPTLirA", "하루 두 번🧘‍♀️ 꼭 해야하는 20분 전신 스트레칭 - 전신붓기 제거, 피로회복, 독소제거, 혈액순환 효과 (Whole body stretch)", "필라테스", "빵느", 0),
("g6enC_9eO24", "※50분 올인원 운동※ 체중감량에 최적화된 루틴 (No 층간소음)", "필라테스", "빵느", 0);




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
values ("1", "ssafy", "첫번째 게시글", "게시판이 생겼어요!!!!"),
("2", "a", "두번째 게시글", "두번쨰 게시판이 생겼어요!!!!");
select * from article;

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
values ("1", "ssafy", "첫번째 게시글의 첫번째 댓글이에용", 1, 2),
("2", "a", "두번째 게시글의 첫번째 댓글이에용", 3, 4);


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
  `ex_type` varchar(20) NOT NULL,
  PRIMARY KEY (`daily_seq`),
  Foreign key (user_id) references `user`(id)
  ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4;

-- select * from daily;
