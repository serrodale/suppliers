FROM openjdk:8-jdk-alpine
WORKDIR /var/www/api
COPY . .
ADD ${JAR_FILE} app.jar
RUN ./mvnw package -f pom.xml
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./target/api-0.0.1-SNAPSHOT.jar"]