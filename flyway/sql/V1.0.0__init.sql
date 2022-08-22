-- テーブル作成

-- ユーザーデータテーブル
CREATE TABLE users(
    user_id                     int(16) NOT NULL AUTO_INCREMENT,
    login_id                    varchar(32) NOT NULL UNIQUE,
    display_name                varchar(32),
    email                       varchar(64) NOT NULL,
    password                    varchar(42) NOT NULL,
    created_at                  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (user_id)
)ENGINE = InnoDB
   DEFAULT CHARSET = utf8mb4
   COLLATE = utf8mb4_unicode_ci
 ;


-- 投稿データテーブル
CREATE TABLE posts(
    post_id                     int(32) NOT NULL,
    user_id                     int(16) NOT NULL,
    text                        varchar(140) NOT NULL,
    created_at                  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY(user_id) REFERENCES users(user_id),
    PRIMARY KEY(post_id)

)ENGINE = InnoDB
   DEFAULT CHARSET = utf8mb4
   COLLATE = utf8mb4_unicode_ci
 ;


-- いいねデータテーブル
CREATE TABLE likes(
    user_id                     int(16) NOT NULL,
    post_id                     int(32) NOT NULL,
    created_at                  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(post_id) REFERENCES posts(post_id),
    PRIMARY KEY(user_id, post_id)
)ENGINE = InnoDB
   DEFAULT CHARSET = utf8mb4
   COLLATE = utf8mb4_unicode_ci
 ;

insert into users values(1,"taro","", "taro@mail.com", "fh83y4hnuthija89fdsa", "2022-08-19"),
(2,"Jiro","", "Jiro@mail.com", "fjajfieue883884", "2022-08-20");

insert into posts values(1,1,"私は太郎です！", "2022-08-19 13:00"),
(2,2,"私は次郎です！", "2022-08-19 14:00");

insert into likes values(1,2,"2022-08-19 13:00"),
(2,2,"2022-08-19 14:00");