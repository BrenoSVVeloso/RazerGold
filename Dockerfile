# Etapa de build
FROM eclipse-temurin:21-jdk AS builder
WORKDIR /app

# Copia tudo e compila o projeto
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Etapa de execução
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copia o .jar gerado na etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]