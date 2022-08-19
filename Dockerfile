FROM openjdk:17-jdk-slim
RUN ln -snf /usr/share/zoneinfo/Asia/Tokyo /etc/localtime
RUN cp /etc/localtime /etc/timezone
ADD ./ /tmp/
WORKDIR /tmp
RUN ./gradlew clean build -p module-api -x test
RUN cp -p module-api/api-app/build/libs/*.jar app-api.jar
ENTRYPOINT ["java", "-Xms2048m", "-Xmx2048m", "-Dspring.profiles.active=stg", "-jar", "app-api.jar"]