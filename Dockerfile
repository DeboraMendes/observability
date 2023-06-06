FROM openjdk:17-jdk-slim

ENV APP_NAME observability
ENV JAR_NAME ${APP_NAME}-0.0.1-SNAPSHOT.jar
ENV BASE_JAR_PATH ./target
ENV PROPERTY_PATH application.yml

COPY ${BASE_JAR_PATH}/${JAR_NAME} /app/
COPY ${PROPERTY_PATH} /app/

WORKDIR /app

CMD java -jar -Dspring.config.additional-location="/app/${PROPERTY_PATH}" /app/${JAR_NAME}

EXPOSE 8080
