FROM openjdk:18-jdk-alpine
COPY target/TH4-0.0.1-SNAPSHOT.jar TH4-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/TH4-0.0.1-SNAPSHOT.jar"]