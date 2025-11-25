FROM eclipse-temurin:17
LABEL maintainer="java@10x.dev"
WORKDIR /app
COPY movieflix/target/movieflix-0.0.1-SNAPSHOT.jar /app/docker.jar
ENTRYPOINT ["java", "-jar", "docker.jar"]
