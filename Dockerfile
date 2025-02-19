FROM openjdk:17-jdk
COPY target/employee.jer employee.jar
CMD ["java","-jar","employee.jar"]