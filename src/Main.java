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
        char c = '\u2692';
        System.out.println("Учитель, я учел все нюансы в Задаче 2 " + c);
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Минимальная сумма трат за день составилa " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float medianPayOuts = 0f;
        for (int element : arr) {
            medianPayOuts += element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + medianPayOuts / arr.length + " рублей");

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] arr = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        /*char tmp1;//временная
        char tmp2;//временная
        int count = 1;//счетчик
        for (int i = 0; i < arr.length / 2; i++) {
            tmp1 = arr[i];
            tmp2 = arr[arr.length - count];
            arr[i] = tmp2;
            arr[arr.length - count] = tmp1;
            count++;

        }*/
    }
}
