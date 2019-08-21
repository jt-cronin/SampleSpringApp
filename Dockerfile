FROM repo.mutualofomaha.com:5003/com.mutualofomaha.img/openjdk:10.0-jre.0
WORKDIR /app
EXPOSE 8080
HEALTHCHECK CMD curl -v --fail http://localhost:8080/actuator/health || exit 1
COPY ./build/libs/springboot-sample-app-1.0-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "springboot-sample-app-1.0-SNAPSHOT.jar"]

