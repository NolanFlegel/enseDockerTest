# Dockerfile 
# FROM openjdk:7
# COPY . /usr/src/myapp
# WORKDIR /usr/src/myapp
# RUN javac Main.java
# CMD ["java", "Main"]

#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/RiskMeter/src
COPY pom.xml /home/RiskMeter
RUN mvn -f /home/RiskMeter/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/RiskMeter/target/RiskMeter-0.0.1-SNAPSHOT.jar /usr/local/lib/RiskMeter.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/RiskMeter.jar"]