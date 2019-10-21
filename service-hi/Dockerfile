FROM openjdk:8-jre

MAINTAINER liss liuxinliss@163.com

EXPOSE 8763

COPY target/service-hi-1.0-SNAPSHOT.jar /service-hi-1.0-SNAPSHOT.jar

ENTRYPOINT ["java" , "-jar" , "/service-hi-1.0-SNAPSHOT.jar"]