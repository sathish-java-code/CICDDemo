FROM openjdk:17
LABEL authors="Sathish Kumar"

ADD target/cicd-docker-demo-0.0.1-SNAPSHOT.jar cicd-docker-demo.jar

ENTRYPOINT ["java", "jar","/cicd-docker-demo,jar"]