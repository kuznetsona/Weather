![Build Status](https://github.com/kuznetsona/Weather/actions/workflows/main.yml/badge.svg?branch=dev) (dev)
![Build Status](https://github.com/kuznetsona/Weather/actions/workflows/main.yml/badge.svg?branch=main) (main)
# Weather
Описание

Сервис по запросу пользователя, считывает погоду переводит ее в грудусы Фаренгейта или Цельсия.

Запуск Docker

docker pull kudavDaria/weather docker container run -it kudavDaria/weather

Пример использования

После запуска программы в консоль выводится сообщение: "Convert to Fahrenheit(F) or Celsius(C) ?" 
Необходимо в строке записать F, если вводим температуру в градусах Фаренгейта или C, если вводим в градусах Цельсия, например F 
Далее необходимо в строке записать число, например, 451
После на экране видим результат "232.777"
