FROM openjdk:17-jdk-alpine3.14

WORKDIR application

COPY "./target/fantasywarriors-0.0.1-SNAPSHOT.jar" "./"

CMD ["java", "-jar", "fantasywarriors-0.0.1-SNAPSHOT.jar"]