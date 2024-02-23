FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install maven -y
COPY . .
RUN set SPRING_DATASOURCE_URL=jdbc:mysql://mysql-makaia-grupo4-makaia-mysql-grupo4.a.aivencloud.com:11514/DbFinalGrupo4
RUN set DB_USERNAME=avnadmin
RUN set DB_PASSWORD=AVNS_U8zVffrHovaT6VOICki
RUN mvn package -f pom.xml

FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
