FROM openjdk:16
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# RUN mkdir /app
# WORKDIR /app

# COPY "target/classes/demo-0.0.1-SNAPSHOT.jar" app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]

# # 起動コマンドをシェル環境で実行
# # ENTRYPOINT ["sh","-c","java -jar -Dspring.profiles.active=docker-compose ./build/libs/${JAR_TARGET}"]