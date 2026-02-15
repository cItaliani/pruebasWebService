FROM amazoncorretto:23-alpine-jdk

COPY target/api.jar /api-v1.jar

ENTRYPOINT ["java", "-jar", "/api-v1.jar"]