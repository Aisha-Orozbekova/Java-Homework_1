import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int secondDigit = Math.abs((number / 10) % 10);
        System.out.println(secondDigit);
    }
}
