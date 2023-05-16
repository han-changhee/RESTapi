FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} RESTapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/RESTapi-0.0.1-SNAPSHOT.jar"]