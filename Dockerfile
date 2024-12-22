FROM openjdk:17-jdk-slim

# Set working directory inside the container

WORKDIR /app

# Copy only the .java file(s) into the container

COPY ./Hellodocker.java .

# Compile the Java source code

RUN javac Hellodocker.java


# Run the compiled Java program

CMD ["java", "Hellodocker"]

