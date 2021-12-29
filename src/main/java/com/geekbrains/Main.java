package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Nik", "left", "ray", "6765", 30000, 29);
        staff.printStatus();

        Staff[] staffArr = new Staff[5];
        staffArr[0] = new Staff("Антон", "Монтажник", "ant@gmail.com", "+79256411478", 40000, 25);
        staffArr[1] = new Staff("Иван", "Монтажник", "iva@gmail.com", "+79424353131", 40000, 25);
        staffArr[2] = new Staff("Яков", "Монтажник", "yak@gmail.com", "+79232411478", 40000, 27);
        staffArr[3] = new Staff("Илья", "Мастер", "ilya@gmail.com", "+79256234478", 50000, 42);
        staffArr[4] = new Staff("Павел", "Прораб", "pav@gmail.com", "+79241541478", 60000, 47);

        for (int i = 0; i < staffArr.length; i++) {
            if (staffArr[i].age > 40) {
                staffArr[i].printStatus();
            }
        }
    }
}
