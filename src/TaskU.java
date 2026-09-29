import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = (n % m) * (m % n) + 1;

        System.out.println(result);
    }
}