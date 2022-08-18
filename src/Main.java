public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Task1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        //Task2
        int maxWeight = 99_999;
        int minWeight = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxWeight) {
                maxWeight = arr[i];
            }
            if (arr[i] < minWeight) {
                minWeight = arr[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + minWeight + " рублей. Максимальная сумма " +
                    "трат за день составила " + maxWeight + " рублей");


        //Task3

        double sumForMean = (double) sum;
        int days =  30;
        double mean = sumForMean / days;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        //Task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}