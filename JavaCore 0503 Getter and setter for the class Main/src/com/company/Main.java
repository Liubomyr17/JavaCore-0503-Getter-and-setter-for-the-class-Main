package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*

0503 Геттери і сеттери для класа Main

Создать class Main. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Main.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Main должна быть переменная name с типом String.
3. У класса Main должна быть переменная age с типом int.
4. У класса должен сеттер для переменной name.
5. У класса должен геттер для переменной name.
6. У класса должен сеттер для переменной age.
7. У класса должен геттер для переменной age.


*/

public class Main {
   String name;
   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {}
}




