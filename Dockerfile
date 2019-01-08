FROM openjdk:8-jdk-alpine
EXPOSE 8020
VOLUME /tmp
ARG JAR_FILE
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]