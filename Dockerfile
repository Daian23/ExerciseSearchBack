FROM openjdk:11

COPY target/my-project-count-phrase-words.jar my-project-count-phrase-words.jar

ENTRYPOINT ["java", "-jar","my-project-count-phrase-words.jar"]