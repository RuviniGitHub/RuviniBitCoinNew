FROM openjdk:8
ADD target/Ruvini_BitCoin_New.jar Ruvini_BitCoin_New.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "Ruvini_BitCoin_New.jar"]