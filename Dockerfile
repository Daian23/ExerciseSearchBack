FROM openjdk:11
ADD target/my-project-search.jar my-project-search.jar
ENTRYPOINT ["java", "-jar","my-project-search.jar"]

