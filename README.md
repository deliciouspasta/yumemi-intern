# ゆめみインターン ～TwitterライクなWebサービスの設計・実装～
<img width="1219" alt="186794962-a5bc080f-926f-4aed-a344-fa7386237732" src="https://user-images.githubusercontent.com/48623999/199964604-23c22d6b-d3e9-454b-8a49-6e0f93aa6b5a.png">
<img width="1217" alt="186794987-4ccda993-77e7-466c-a2d4-d749cd4f06bd" src="https://user-images.githubusercontent.com/48623999/199964617-ec11d8af-338c-444d-8779-2560afeda023.png">

### DB起動
docker-compose up -d database

### マイグレーション
docker-compose run --rm  flyway-migrate

### マイグレーション履歴取得
docker-compose run --rm flyway-info

### 初期化(きれいさっぱり全部消す)
docker-compose run --rm flyway-clean

### service起動(javaビルド後)
docker-compose up -d app
