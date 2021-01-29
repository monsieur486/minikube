FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Mr486 <monsieur486@gmail.com>

COPY target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
