public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int finish = 2459000;
        int start = 0;
        int pay = 15000;
        int countMonth = 0;
        while (start <= finish) {
            start += pay;
            countMonth++;
            System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + start + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }

        System.out.println();

        for (int i = count - 1; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12_000_000;
        int fertility = people / 1000 * 17;
        int mortality = people / 1000 * 8;
        int year = 2023;
        while (year < 2033) {
            people = people + fertility - mortality;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double start = 15000;
        int finish = 12_000_000;
        int count = 1;
        while (start < finish) {
            start = start + start * 0.07;
            System.out.printf("Месяц " + count + " накоплено" + " %.2f", start);
            System.out.println();
            count++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double start = 15000;
        int finish = 12_000_000;
        int count = 1;
        while (start < finish) {
            start = start + start * 0.07;
            if (count % 6 == 0) {
                System.out.printf("Месяц " + count + " накоплено" + " %.2f", start);
                System.out.println();
            }
            count++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double start = 15000;
        int year = 9;
        int totalMonth = year * 12;
        int countMonth = 1;
        while (countMonth <= totalMonth) {
            start = start + start * 0.07;
            if (countMonth % 6 == 0) {
                System.out.printf("Месяц " + countMonth + " накоплено" + " %.2f", start);
                System.out.println();
            }
            countMonth++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int day = 1;
        while (day <= 31) {
            if (day % friday == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
            day++;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometYear = 79;
        int countYearComet = 0;

        int before = 2023 - 200;
        int after = 2023 + 100;

        while (countYearComet < after) {
            if (countYearComet > before) {
                System.out.println(countYearComet);
            }
            countYearComet += cometYear;
        }
    }
}


