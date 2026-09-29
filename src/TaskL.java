import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hours = (n % 86400) / 3600;
        int minutes = (n /60) % 60;
        int seconds = n % 60;
        System.out.printf("%d:%02d:%02d\n", hours, minutes,seconds);
    }
}
