# Usa una imagen base de OpenJDK
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado por Spring Boot
COPY target/my-app.jar /app/my-app.jar

# Expone el puerto donde la aplicación de Spring Boot escucha
EXPOSE 8080

# Comando para ejecutar el JAR
CMD ["java", "-jar", "my-app.jar"]
