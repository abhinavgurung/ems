create database spring_example;
create user 'springuser'@'localhost' identified by 'ThePassword'; 
grant all on spring_example.* to 'springuser'@'localhost';