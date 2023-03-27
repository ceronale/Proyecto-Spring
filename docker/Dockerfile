# Usa una imagen de Java 11 como imagen base
FROM adoptopenjdk/openjdk17:alpine-jre

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo .jar de la aplicación desde el host al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080 en el contenedor
EXPOSE 8080

# Establece el comando por defecto para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
