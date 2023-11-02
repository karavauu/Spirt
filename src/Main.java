import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа выводит максимально возможное число молекул спирта");

        System.out.print("Введите количество атомов углерода : ");
        int AtomCuglerod = scanner.nextInt();

        System.out.print("Введите количество атомов водорода : ");
        int AtomHvodorod = scanner.nextInt();

        System.out.print("Введите количество атомов кислорода : ");
        int AtomOkislorod = scanner.nextInt();

        int resultC = AtomCuglerod / 2;
        int resultH = AtomHvodorod / 6;
        int resultO = AtomOkislorod / 1;

        if (resultC <= resultH && resultC < resultO)
            System.out.println("Максимально возможное число молекул спирта: " + resultC);
        else if (resultH <= resultC && resultH <= resultO)
            System.out.println("Максимально возможное число молекул спирта: " + resultH);
        else
            System.out.println("Максимально возможное число молекул спирта: " + resultO);


    }
}