Application for Andersen

Java 11
Maven 
Spring Boot
Hibernate
Liquibase

Для запуска приложения нужно:
1. Подключить базу данных PostgreSQL
   Я использую изолированную среду Docker для запуска PostgreSQL

   Для этого установим образ postgres:14-alpine
   

3. Прописать в файлике application.properties name и password
4. Запустить приложение.
5. Перейти по адресу http://localhost:8080/lessons/main-page
