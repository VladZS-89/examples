package main.java.ru.jcf.test;

import java.util.Scanner;

public class JavaRushExample1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String result = a.equals(b) ? "Одинаковые" : "Разные";
        System.out.println(result);
    }
}
