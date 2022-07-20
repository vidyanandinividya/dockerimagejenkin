FROM openjdk:8
EXPOSE 8081
ADD target/dockerimagejenkin.jar dockerimagejenkin.jar
ENTRYPOINT ["java", "-jar","dockerimagejenkin.jar"]