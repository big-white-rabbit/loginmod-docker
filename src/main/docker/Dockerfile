FROM openjdk:8
VOLUME /tmp
ADD loginmod-0.0.1-SNAPSHOT.jar loginmod.jar
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/loginmod.jar" ]