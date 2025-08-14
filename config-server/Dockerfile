FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/config-server-0.0.1.jar
COPY ${JAR_FILE} app_configserver.jar
ENTRYPOINT ["java","-jar","app_configserver.jar"]