
FROM amazoncorretto:11-alpine-jdk
MAINTAINER marianoherrlein 
COPY target/BackEnd-0.0.1-SNAPSHOT.jar prueba.jar 
ENTRYPOINT ["java","-jar","/prueba.jar"]

