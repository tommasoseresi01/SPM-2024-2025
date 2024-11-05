package org.example;
import com.google.gson.Gson;

public class Exercise {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Creazione di un oggetto Java
        Person person = new Person("Alice", 30);

        // Conversione dell'oggetto in JSON
        String json = gson.toJson(person);
        System.out.println(json);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter e setter (se necessario)
}