FROM openjdk:11
COPY ./spring-cloud-config-app/target/spring-cloud-config-app-0.0.1.jar spring-cloud-config-app-0.0.1.jar
CMD ["java","-jar","spring-cloud-config-app-0.0.1.jar"]