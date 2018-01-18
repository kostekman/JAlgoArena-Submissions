FROM heroku/jvm

COPY [".", "*.gradle", "gradlew", "*.properties", "/app/user/"]
COPY ["gradle/wrapper/*", "/app/user/gradle/wrapper/"]

#RUN ./run.sh
#
#RUN ./gradlew clean bootRepackage

ENV EUREKA_URL=http://172.18.0.2:5000/eureka/

CMD ["./gradlew", "clean", "bootRun"]