FROM openjdk
WORKDIR /app
COPY src/ ./src
RUN javac -d out src/*.java
WORKDIR /app/out
CMD ["java", "LibraryManagementSystem"]