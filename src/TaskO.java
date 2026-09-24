import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int totalPriceKopeyika = (a * 100 +b) * n;
        int finalRubles = totalPriceKopeyika / 100;
        int finalKopeyika = totalPriceKopeyika % 100;
        System.out.println(finalRubles + " " + finalKopeyika);
    }
}
