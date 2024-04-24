import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        printTheeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSum(5, 10);
        oneDigit(7);
        oneDigitTrueOrFalse(5);
        stringAndDigit("Hello", 3);
        oneHundred(100);
        massChange();
        lenInitialValue(4, 6);

    }


    private static void oneHundred() {
    }


    private static void printTheeWords() {

        System.out.println("Задание 1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        }

    private static void checkSumSign() {

        System.out.println("Задание 2");
        int a = 5;
        int b = 7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {

        System.out.println("Задание 3");
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {

        System.out.println("Задание 4");
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    static void checkSum(int x, int y) {

        System.out.println("Задание 5");
        boolean result = (x + y >= 10 && x + y <= 20);
        System.out.println(result);
    }

    private static void oneDigit(int a) {

        System.out.println("Задание 6");
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    private static void oneDigitTrueOrFalse(int a) {

        System.out.println("Задание 7");
        boolean result = (a <= 0);
        System.out.println(result);
    }

    private static void stringAndDigit(String line, int n) {

        System.out.println("Задание 8");
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }


    private static void oneHundred(int size) {

        System.out.println("Задание 11");
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
    private static void massChange() {

        System.out.println("\nЗадание 12");
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
        }
    }

    private static void lenInitialValue(int len, int initialValue) {

        System.out.println("\nЗадание 14");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}
