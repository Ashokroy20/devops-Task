FROM openjdk:17-jdk
COPY target/employee.jar employee.jar
CMD ["java","-jar","employee.jar"]
