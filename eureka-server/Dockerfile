FROM openjdk:8-jre

MAINTAINER liss liuxinliss@163.com

EXPOSE 8761

COPY target/eureka-server-1.0-SNAPSHOT.jar /eureka-server-1.0-SNAPSHOT.jar

ENTRYPOINT ["java" , "-jar" , "/eureka-server-1.0-SNAPSHOT.jar"]


#docker run -it -d -p 8761:8761 --name eureka-server 41997de8006f

#docker 启动
#常规启动三个镜像，容器是不能联通的，必须手动为三个容器创建一个共同的网络，容器间才可以保持通讯。
#首先创建一个名为cloud的桥接网络
#docker network create -d bridge cloud
#依次启动三个镜像，并且连接到创建的cloud网络上
#docker run -d --name eureka-server -p 8761:8761 --network cloud eureka-server
#docker run -d --name service-hi -p 8763:8763 --network cloud service-hi
#docker run -d --name service-client -p 8764:8764 --network cloud service-client
