### DB起動
docker-compose -up d db

### マイグレーション
docker-compose run --rm  flyway-migrate

### マイグレーション履歴取得
docker-compose run --rm flyway-info

### 初期化(きれいさっぱり全部消す)
docker-compose run --rm flyway-clean

### service起動(javaビルド後)
docker-compose -up d app