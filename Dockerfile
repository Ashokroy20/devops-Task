FROM eclipse-temurin:17
COPY target/employee.jar workers.jar
CMD ["java","-jar","workers.jar"]
