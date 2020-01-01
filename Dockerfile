
FROM maven:3.6-jdk-13

LABEL "Name"="Deyve Vieira"

LABEL "email"="deyvedvm@yahoo.com.br"

COPY . /usr/src/myapp

WORKDIR /usr/src/myapp

RUN mvn clean package

ENTRYPOINT ["java", "-jar", "target/algorithms-java-1.0.jar"]
