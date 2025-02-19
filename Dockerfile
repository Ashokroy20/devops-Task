FROM openjdk:17-jdk
COPY target/employee.jar workers.jar
CMD ["java","-jar","workers.jar"]
