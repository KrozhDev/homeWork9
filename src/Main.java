public class Main {
    public static void main(String[] args) {
        
        task1();
        task2();
        task3();
        task4();



        



    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

    private static void task3() {
        int[] monthOutcomeReport = generateRandomArray();
        int totalOutcome = 0;
        double meanOutcome;
        for (int note: monthOutcomeReport) {
            totalOutcome += note;
        }
        meanOutcome = (double) totalOutcome/monthOutcomeReport.length;
        System.out.println("Средняя сумма трат за месяц равна: " + meanOutcome + " рублей");
    }

    private static void task2() {
        int[] monthOutcomeReport = generateRandomArray();
        int minOutcome = Integer.MAX_VALUE;
        int maxOutcome = 0;
        for (int note: monthOutcomeReport) {
            if (minOutcome > note) minOutcome = note;
            if (maxOutcome < note) maxOutcome = note;
        }
        System.out.println("Минимальная сумма трат за день составила: " + minOutcome + " рублей");
        System.out.println("Максимальная сумма трат за день составила: " + maxOutcome + " рублей");

    }

    private static void task1() {
        int[] monthOutcomeReport = generateRandomArray();
        int totalOutcome = 0;
        for (int note: monthOutcomeReport) {
            totalOutcome += note;
        }
        System.out.println("Сумма выплат за месяц равна: " + totalOutcome + " рублей");
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}