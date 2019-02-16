#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ADD tiku-server-1.0.jar app.jar
#ENV PARAMS="--spring.profiles.active=prod"
#ENTRYPOINT ["sh", "-c","java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","$PARAMS"]
#RUN java -Djava.security.egd=file:/dev/./urandom -jar /app.jar ${PARAMS}
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD cicd-demo-0.0.1.jar app.jar
#RUN sh -c 'touch /app.jar'
ENV AC="prod"
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar  --spring.profiles.active=$AC " ]
#
