FROM openjdk:8-jre

MAINTAINER liss liuxinliss@163.com

EXPOSE 8764

COPY target/service-client-0.0.1-SNAPSHOT.jar /service-client-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java" , "-jar" , "/service-client-0.0.1-SNAPSHOT.jar"]