package main.java.ru.jcf.test;

public class DemoArray {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 30;
        month_days[8] = 31;
        month_days[9] = 30;
        month_days[10] = 31;
        month_days[11] = 30;
        System.out.println("В апреле " + month_days[3] + " дней.");
        int month_days_2[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        System.out.println("В июне " + month_days_2[5] + " дней.");
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i = 0;
        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Среднее значение равно " + result / 5);
    }
}
