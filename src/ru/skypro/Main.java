package ru.skypro;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача №1");

        String firstName= "Фёдоров";
        String middleName ="Иван";
        String lastName = "Фёдорович";
        String fullName = firstName+" " + middleName + " " + lastName;
        System.out.println("Фамилия Имя Отчество сотрудника: " + fullName);


        System.out.println();
        System.out.println("Задача №2");
        System.out.println("Фамилия Имя Отчество сотрудника: " + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задача №3");

        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё','е' );
        }
        System.out.println("Фамилия Имя Отчество сотрудника: " + fullName);


    }
}
