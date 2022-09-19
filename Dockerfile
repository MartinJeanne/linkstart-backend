FROM openjdk:18
COPY target/linkStartBackend-0.0.1-SNAPSHOT.jar linkStartBackend-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "linkStartBackend-0.0.1-SNAPSHOT.jar"]