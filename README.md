## Application for Andersen

Это приложение помогает учителю организовать урок.
Создать уроки, создать группы студентов. 
И остальные возможности.

Для запуска приложения нужно:
1. Подключить базу данных PostgreSQL
   Я использую изолированную среду Docker для запуска PostgreSQL
   ![cover_docker](https://user-images.githubusercontent.com/72036166/192875226-153978e2-2dbe-450e-90dd-af663839268f.jpeg)
   Для этого загрузим образ postgres:14-alpine
   <img width="1263" alt="Screenshot 2022-09-28 at 22 55 57" src="https://user-images.githubusercontent.com/72036166/192876766-51a2a9cc-4abf-4053-8605-3aa87aeb2c47.png">
   docker pull postgres:12-alpine
   Далее мы запускаем нашу БД
   <img width="1267" alt="Screenshot 2022-09-28 at 22 59 50" src="https://user-images.githubusercontent.com/72036166/192877424-6b94f78b-9835-4f5e-b3d0-e61de2714bcf.png">
   
   docker run -d -p 5432:5432 --name data-base   \
    -e POSTGRES_USER=vladislav  \
    -e POSTGRES_PASSWORD=test \
    -e POSTGRES_DB=project-base \

    postgres:14-alpine
    
   При данном конфликте нам нужно отключить все процессы на порту 5432
   Для этого проверяем с помощью команды:
   sudo lsof -i :5432 все процессы
   Далее убираем эти процессы с помощью: 
   sudo kill -9 152 
   где "152" индекс нашего процесса.
   
   Снова запускаем и выполняем команду 
   <img width="1262" alt="Screenshot 2022-09-28 at 23 04 53" src="https://user-images.githubusercontent.com/72036166/192878216-7f10638d-2e7d-4fd3-990e-140bca88ee0f.png">
   
   docker exec -ti data-base sh  

   

3. Прописать в файлике application.properties name и password
4. Запустить приложение.
5. Перейти по адресу http://localhost:8080/lessons/main-page
