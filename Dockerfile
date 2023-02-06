# Use an official openjdk runtime as the base image
FROM openjdk:17-alpine

# Copy the application files into the container
COPY build/libs/*SNAPSHOT.jar app.jar

# Expose the port on which the application listens
EXPOSE 8081

# Define the startup argument for the application
CMD ["java", "-jar", "app.jar"]
