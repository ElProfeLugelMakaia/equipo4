# Primera etapa: construir la aplicación
FROM maven:3.8.4-openjdk-21 AS build

WORKDIR /app

COPY . .

RUN mvn package -f pom.xml

# Segunda etapa: ejecutar la aplicación
FROM openjdk:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080