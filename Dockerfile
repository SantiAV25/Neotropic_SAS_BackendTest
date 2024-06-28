FROM openjdk:17

# Set the working directory to /app
WORKDIR /app

# Copy the Gradle build files to the working directory
COPY build.gradle /app/
COPY settings.gradle /app/
COPY gradle/. /app/

# Copy the application code to the working directory
COPY src/main/ /app/

# Build the application using Gradle
RUN gradle build --no-daemon

# Create a new Docker image layer for the application
FROM openjdk:17

# Set the working directory to /app
WORKDIR /app

# Copy the built application code to the working directory
COPY build/libs/*.jar app.jar

# Expose the port for the Spring Boot application
EXPOSE 8080

# Run the Spring Boot application when the Docker container starts
CMD ["java", "-jar", "app.jar"]