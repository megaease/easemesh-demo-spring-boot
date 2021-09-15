FROM adoptopenjdk/openjdk8:jdk8u302-b08-slim

WORKDIR /poc
RUN mkdir -p /poc

COPY front-service/target/front-service-0.0.1-SNAPSHOT.jar \
     backend-service/target/backend-service-0.0.1-SNAPSHOT.jar \
     backend-canary-service/target/backend-canary-service-0.0.1-SNAPSHOT.jar \
     middle-service/target/middle-service-0.0.1-SNAPSHOT.jar  \
     /poc/




