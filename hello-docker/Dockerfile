FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/*.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]