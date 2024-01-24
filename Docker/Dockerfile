FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvnw/ .mvnw
COPY mvnw pom.xml ./
RUN ./mvnw clean install

COPY ./target/Demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]