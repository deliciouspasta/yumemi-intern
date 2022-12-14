-- テーブル作成

-- ユーザーデータテーブル
CREATE TABLE users(
    user_id                     int(16) NOT NULL AUTO_INCREMENT,
    login_id                    varchar(32) NOT NULL UNIQUE,
    display_name                varchar(32),
    email                       varchar(64) NOT NULL,
    password                    varchar(64) NOT NULL,
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

-- データの挿入
INSERT INTO users
VALUES(
    1,
    "taro",
    "",
    "taro@mail.com",
    "fh83y4hnuthija89fdsa",
    "2022-08-19"
),
(
    2,
    "Jiro",
    "",
    "Jiro@mail.com",
    "fjajfieue883884",
    "2022-08-20"
),
(
    3,
    "Saburo",
    "",
    "Saburo@mail.com",
    "$2a$10$4KEopINMMe3ICEeNbBLvwuIcHBGu2PBEx9teTLhs.Kezx6R7JcEg2",
    "2022-08-21"
)
;
INSERT INTO posts
VALUES(
    1,
    2,
    "私は太郎です！",
    "2022-08-19 13:18"
),
(
    2,
    2,
    "私は次郎です！",
    "2022-08-19 14:34"
),
(
    3,
    1,
    "今日は北海道に行きました！",
    "2022-08-21 13:11"
)
;
INSERT INTO posts
VALUES(
    4,
    2,
    "勉強頑張るぞ！",
    "2022-08-22 14:45"
),
(
    5,
    1,
    "おはようございます",
    "2022-08-23 13:45"
),
(
    6,
    2,
    "今日はラーメンを食べました！",
    "2022-08-24 14:02"
)
;
INSERT INTO posts
VALUES(
    7,
    3,
    "こんにちは!",
    "2022-08-24 17:07"
),
(
    8,
    2,
    "頑張ります！",
    "2022-08-24 20:10"
),
(
    9,
    1,
    "今日のテレビ何見ようかな",
    "2022-08-24 21:20"
)
;
INSERT INTO posts
VALUES(
    10,
    3,
    "明日も頑張ろう！",
    "2022-08-24 22:56"
),
(
    11,
    1,
    "今度理旅行に行こうかなと思ってる",
    "2022-08-24 22:59"
),
(
    12,
    3,
    "駅前のドーナツ屋行ったけど行列がすごかった",
    "2022-08-25 23:20"
)
;
INSERT INTO posts
VALUES(
    13,
    1,
    "スマートフォン買いたいけどiPhoneとAndroidどっちがいいかな",
    "2022-08-25 23:32"
),
(
    14,
    2,
    "全角空白に気づかず２時間溶かした...",
    "2022-08-26 11:24"
),
(
    15,
    3,
    "今日見た映画面白かった",
    "2022-08-26 12:20"
)
;
INSERT INTO posts
VALUES(
    16,
    1,
    "おはようございます",
    "2022-08-27 10:33"
)
;
INSERT INTO likes
VALUES(
    1,
    2,
    "2022-08-19 13:00"
),
(
    2,
    2,
    "2022-08-19 14:00"
)
;
