# springboot-mysql-docker

これはSpring Boot(Maven), Mysql, Dockerを使用したテンプレートです。グループIDやアーティファクトIDはすでにこちらで決定しているため用途は限られますが、簡単なデモアプリを作りたい場合やSpring BootとMysql環境をDockerで作ってみたい場合にご使用ください。

## 構成
- Java: 16.0.2
- Maven: 3.8.2
- Mysql: 8.0

## 使い方
1. JDKをローカル環境にインストール
2. Use this templateを選択
3. 説明に従いtemplateを使用する
4. mkdir target
5. mvnw package && java -jar target/***.jar(***の部分は作成されたjarファイルに合わせて適時変更)
6. docker-compose up --build -d
7. localhost:8080/index/emp
8. 従業員リストが表示されれば成功
