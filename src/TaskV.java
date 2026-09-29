import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int left = a * (a/b);
        int right = b * (b/a);
        int sum = (a / b) + (b /a);
        int max = (left + right) / sum;

        System.out.println(max);
    }
}