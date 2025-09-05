# Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Optional: label author
LABEL authors="bcpl"

# Set build argument for your JAR file
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

# Expose the application port
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
