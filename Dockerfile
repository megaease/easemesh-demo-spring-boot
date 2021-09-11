FROM openjdk:18-slim-buster

WORKDIR /poc
RUN mkdir -p /poc
RUN apt-get update -y && apt-get install -y net-tools curl iputils-ping

COPY front-service/target/front-service-0.0.1-SNAPSHOT.jar \
     backend-service/target/backend-service-0.0.1-SNAPSHOT.jar \
     middle-service/target/middle-service-0.0.1-SNAPSHOT.jar  \
     /poc/




