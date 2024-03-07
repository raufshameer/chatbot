FROM maven:3.9-eclipse-temurin-21 AS chatbot-builder
WORKDIR /opt
COPY . .
RUN mvn clean package -DskipTests

# Runner Image
FROM azul/zulu-openjdk-alpine:21
ENV PORT 8080
WORKDIR /opt
COPY --from=chatbot-builder /opt/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]