FROM sgrio/java
#docker build -t jgivenspring:latest .
MAINTAINER Blaise
RUN apk update
RUN apk add maven
COPY pom.xml /usr/local/inttests/pom.xml
COPY src /usr/local/inttests/src
WORKDIR /usr/local/inttests
RUN mvn package
CMD ["mvn", "test"]
