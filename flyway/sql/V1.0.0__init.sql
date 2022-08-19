-- テーブル作成
-- ユーザマスタ
CREATE TABLE m_user
(
    id                        int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
    created_at                datetime            DEFAULT CURRENT_TIMESTAMP COMMENT '登録日時',
    updated_at                datetime            DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新日時',
    deleted_at                datetime            DEFAULT NULL COMMENT '削除日時',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci comment ='ユーザマスタ'
;