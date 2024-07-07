import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double salary = 15000;
        double total = 0;
        int numbersOfMonth = 1;
        double percentageOfDeposit = 0.12;
        while (total <= 2_459_000) {
            numbersOfMonth++;
            total += salary + (total * percentageOfDeposit / 12);
            String deposit = String.format("%.2f", total);
            System.out.println("Месяц " + numbersOfMonth + ", сумма накоплений равна " + deposit + " рублей");// В задаче ничего не было сказано про процент по вкладу
        }
        System.out.println("Чтобы накопить 2.459.000 рублей, понадобится " + numbersOfMonth + " месяцев.");

        System.out.println("Задача 2");
        int numbersFromOneToTen = 1;
        while (numbersFromOneToTen <= 10) {
            System.out.print(numbersFromOneToTen++ + " ");
        }
        System.out.println();
        for (int numbersFromTenToOne = 10; numbersFromTenToOne > 0; numbersFromTenToOne--) {
            System.out.print(numbersFromTenToOne + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = population * 17 / 1000;
        int deathRate = population * 8 / 1000;
        int year = 1;
        while (year <= 10) {
            population = population + fertility - deathRate;
            System.out.println("Год " + year++ + " численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int depositOfVasya = 15000;
        int percent = 7;
        int month = 1;
        for (; depositOfVasya <= 12_000_000; month++) {
            depositOfVasya = (int) (depositOfVasya + (depositOfVasya * 0.07));
            System.out.println("Месяц " + month + ", сумма накполений равна " + depositOfVasya);
        }
        System.out.println("Задача 5");
        int depositOfVasya2 = 15000;
        int month2 = 1;
        for (; depositOfVasya2 <= 12_000_000; month2++) {
            depositOfVasya2 = (int) (depositOfVasya2 + (depositOfVasya2 * 0.07));
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + depositOfVasya2);
            }
        }
        System.out.println("Задача 6");
        int accumulation = 15000;
        int numbersOfMonth2 = 12;
        int mounth2 = 1;
        for (; mounth2 <= 9 * numbersOfMonth2; mounth2++) {
            accumulation = (accumulation + (accumulation * percent) / 100);
            if (mounth2 % 6 == 0) {
                System.out.println("Месяц " + mounth2++ + ", сумма накоплений равна " + accumulation);
            }
        }
        System.out.println("Задача 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число первой пятницы: ");
        int firstFriday = sc.nextInt();
        int friday = 0;
        if (firstFriday > 7) {
            System.out.println("Число не может быть больше семи");
            return;
        }
        System.out.println("Введите количество дней в месяце: ");
        int daysPerMounth = sc.nextInt();
        if (daysPerMounth < 27 && daysPerMounth > 31) {
            System.out.println("Количество месяцев не может быть меньше 28 и больше 31");
            return;
        }
        for (friday = firstFriday; friday <= daysPerMounth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int beforeYear = 200;
        int afterYear = 100;
        int cometPeriodicity = 79;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year1 = sc.nextInt();
        int lastYear = year1 - beforeYear;
        int nextYear = year1 + afterYear;
        int year2 = 0;
        for (year2 = lastYear; year2 <= nextYear; year2++) {
            if (year2 % cometPeriodicity == 0)
                System.out.format("Год %d: пролетит комета. %n", year2);
        }
    }
}
