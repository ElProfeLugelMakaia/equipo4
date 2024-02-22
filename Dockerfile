FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .
RUN set SPRING_DATASOURCE_URL=jdbc:mysql://mysql-makaia-grupo4-makaia-mysql-grupo4.a.aivencloud.com:11514/DbFinalGrupo4
RUN set DB_USERNAME=avnadmin
RUN set DB_PASSWORD=AVNS_U8zVffrHovaT6VOICki
RUN .\mvnw package -f .\pom.xml

FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
