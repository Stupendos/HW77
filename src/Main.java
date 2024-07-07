import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int z = 1;
        while (total <= 2_459_000) {
            total = total + salary;
            System.out.println("Месяц " + (z++) + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int q = 1;
        while (q <= 10) {
            System.out.print(q++ + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
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
        int v = 15000;
        int percent = 7;
        int mounth = 1;
        for (; v <= 12_000_000; mounth++) {
            v = (int) (v + (v * 0.07));
            if (mounth % 6 == 0)
                System.out.println("Месяц " + mounth++ + ", сумма накоплений равна " + v);
        }
        System.out.println("Задача 6");
        int accumulation = 15000;
        int percent2 = 7;
        int mounth2 = 1;
        for (; mounth2 <= 9 * 12; mounth2++) {
            accumulation = (accumulation + (accumulation * percent2) / 100);
            if (mounth2 % 6 == 0) {
                System.out.println("Месяц " + mounth2++ + ", сумма накоплений равна " + accumulation);
            }
        }
        System.out.println("Задача 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число первой пятницы: ");
        int firstFriday = sc.nextInt();
        int friday = 0;
        if(firstFriday > 7) {
            System.out.println("Число не может быть больше семи");
            return;
        }
        System.out.println("Введите количество дней в месяце: ");
        int daysPerMounth = sc.nextInt();
        if (daysPerMounth<27 && daysPerMounth > 31){
            System.out.println("Количество месяцев не может быть меньше 28 и больше 31");
            return;
        }
        for (friday = firstFriday; friday <=daysPerMounth; friday+=7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year1 = sc.nextInt();
        int lastYear = year1 - 200;
        int nextYear = year1 + 100;
        int year2 = 0;
        for(year2 = lastYear; year2 <=nextYear; year2++){
            if(year2 % 79 ==0)
                System.out.format("Год %d: пролетит комета. %n",year2);
        }
    }
}