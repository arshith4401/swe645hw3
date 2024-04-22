FROM openjdk:17
COPY ./target/SWE645-Survey.jar .
ENTRYPOINT ["java", "-jar", "SWE645-Survey.jar"]
EXPOSE 8182
