FROM openjdk:17-jdk-alpine3.14

COPY "./target/fantasywarriors.jar" "/application/fantasywarriors.jar"

CMD ["java", "-jar", "/application/fantasywarriors.jar"]