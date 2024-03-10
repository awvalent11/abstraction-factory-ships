FROM openjdk:18
COPY ./build/libs/abstraction-factory-ships-1.0-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "/tmp/abstraction-factory-ships-1.0-SNAPSHOT.jar"]