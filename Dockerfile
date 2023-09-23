FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8082
COPY ./target/bms-docker.jar bms-app.jar
ENTRYPOINT ["java","-jar","/bms-app.jar"]

