FROM openjdk:8
EXPOSE 8080
ADD target/demo.jar spring-jenkins-demo.jar
ENTRYPOINT ["java","-jar","/spring-jenkins-demo.jar"]