package ru.maxima.maven.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    /**     *
     * mvn clean — очистка временных файлов и папок.
     * mvn compile — компиляция проекта.
     * mvn test — запуск тестов.
     * mvn package — упаковка в JAR.
     * mvn install — установка сборки в локальный репозиторий.
     * mvn dependency:tree — просмотр зависимостей.
     */

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src\\main\\resources\\Person.json");

        Person person = objectMapper.readValue(jsonFile, Person.class);

        System.out.println(person);
    }
}