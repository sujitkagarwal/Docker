FROM openjdk:8-jdk-alpine
#RUN apk add --no-cache bash
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#This Dockerfile is very simple, but that’s all you need to run a Spring Boot app with no frills: just Java and a JAR file. The project JAR file is ADDed to the container as "app.jar" and then executed in the ENTRYPOINT.

# We added a VOLUME pointing to "/tmp" because that is where a Spring Boot application creates working directories for Tomcat by default. The effect is to create a temporary file on your host under "/var/lib/docker" and link it to the container under "/tmp". This step is optional for the simple app that we wrote here, but can be necessary for other Spring Boot applications if they need to actually write in the filesystem.

#To reduce Tomcat startup time we added a system property pointing to "/dev/urandom" as a source of entropy. This is not necessary with more recent versions of Spring Boot, if you use the "standard" version of Tomcat (or any other web server).