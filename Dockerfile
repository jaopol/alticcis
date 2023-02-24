FROM openjdk:17-alpine
VOLUME /tmp
ADD /target/alticci-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN apk update && apk add bash && bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]