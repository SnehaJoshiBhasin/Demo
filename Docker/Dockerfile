FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvnw/ .mvnw
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]