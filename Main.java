import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        printTheeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSum(10, 5));
        oneDigit(7);
        System.out.println(oneDigitTrueOrFalse(5));
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
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {

        System.out.println("Задание 3");
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
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
    private static boolean checkSum(int a, int b) {

        System.out.println("Задание 5");
        return a + b >= 10 && a + b <= 20;
    }

    private static void oneDigit(int a) {

        System.out.println("Задание 6");
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    private static boolean oneDigitTrueOrFalse(int a) {

        System.out.println("Задание 7");
        return a <= 0;
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
            System.out.print(arr[i]);
        }
    }

}
