package com.geekbrains;

public class Staff {
    public String name;
    public String post;
    public String email;
    public String telNumbers;
    public int salary;
    public int age;

    public Staff(String name, String post, String email, String telNumbers, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telNumbers = telNumbers;
        this.salary = salary;
        this.age = age;
    }

    public void printStatus() {
        System.out.println("Имя сотрудника: " + name + "  Должность: " + post + "  Email: " + email + "  Номер телефона: " +
            telNumbers + "  Зарплата: " + salary + "  Возраст: " + age);
    }


}
