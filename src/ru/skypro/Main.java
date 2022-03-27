package ru.skypro;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//
//        System.out.println();
//        System.out.println("Задача №1");
//
//        String firstName= "Фёдоров";
//        String middleName ="Иван";
//        String lastName = "Фёдорович";
//        String fullName = firstName+" " + middleName + " " + lastName;
//        System.out.println("Фамилия Имя Отчество сотрудника: " + fullName);
//
//
//        System.out.println();
//        System.out.println("Задача №2");
//        System.out.println("Фамилия Имя Отчество сотрудника: " + fullName.toUpperCase());
//
//        System.out.println();
//        System.out.println("Задача №3");
//
//        if (fullName.contains("ё")) {
//            fullName = fullName.replace('ё','е' );
//        }
//        System.out.println("Фамилия Имя Отчество сотрудника: " + fullName);
//
        System.out.println();
        System.out.println("Задача №5 с написанным методом");
        System.out.println();

        stringsSepar("Иванова Наталья Михайловна");

        System.out.println();
        System.out.println("Задача №6 с написанным методом");
        System.out.println();
        stringsSeparAndUpperCase("государева татьяна васильевна");

        System.out.println();
        System.out.println("Задача №7 с написанным методом");
        System.out.println();
        stringByStrinBuilder("246", "357");

        System.out.println();
        System.out.println("Задача №8 с написанным методом");
        System.out.println();
        findDoubles("aabccddefgghiijjkk");


    }

    //ЗАДАНИЕ №5 - метод
    public static void stringsSepar(String fullName) {
        String name = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' '));
        String middleName = fullName.substring(fullName.lastIndexOf(' '));
        String lastName = fullName.substring(0, fullName.indexOf(' '));


        System.out.println("Фамилия сотрудника: " + lastName);
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Отчество сотрудника: " + middleName);
    }

    //ЗАДАНИЕ №6 - метод
    public static void stringsSeparAndUpperCase(String fullName) {
        String UpperCharName = "";
        Scanner lineScan = new Scanner(fullName);
        while (lineScan.hasNext()) {
            String upCword = lineScan.next();
            UpperCharName += Character.toUpperCase(upCword.charAt(0)) + upCword.substring(1) + " ";
        }
        System.out.println("Верное написание Ф.И.О. сотрудника с заглавных букв: " + UpperCharName);
    }

    // ЗАДАНИЕ №7
    public static void stringByStrinBuilder(String numbers, String numbers2) {
        String f1 = "";
        StringBuilder strB = new StringBuilder(numbers.length() + numbers2.length());
        for (int i = 0; i < numbers.length(); i++) {
            strB.append(numbers.charAt(i));
            strB.append(numbers2.charAt(i));
        }
        System.out.println(strB);

    }

    //ЗАДАНИЕ №8
    public static void findDoubles(String inputString) {
        char[] arr = inputString.toCharArray();
        Arrays.sort(arr);
        boolean st = true;
        if (st) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && st) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

}






