# FROM openjdk:8-jdk-alpine
# COPY target/consumer_1-0.0.1-SNAPSHOT.jar /usr/app/
# WORKDIR /usr/app
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "consumer_1-0.0.1-SNAPSHOT.jar"]

FROM maven:3.6.1-jdk-8-alpine
COPY pom.xml /usr/
COPY src /usr/src/
WORKDIR /usr/
RUN mvn clean package -Dmaven.test.skip=true
WORKDIR /usr/target
EXPOSE 8080
# <artifactId>-<version>.jar
ENTRYPOINT ["java", "-jar", "consumer_1-0.0.1-SNAPSHOT.jar"]
