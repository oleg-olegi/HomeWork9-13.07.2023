import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int payouts = 0;
        for (int element : arr) {
            payouts += element;
        }
        System.out.println("Сумма трат за месяц составила " + payouts + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составилa " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int medianPayOuts = 0;
        for (int element : arr) {
            medianPayOuts += element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + medianPayOuts / arr.length + " рублей");

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = generateRandomArray();
    }
}