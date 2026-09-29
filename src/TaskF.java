import java.util.Scanner;


public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = Math.abs(number % 10);
        System.out.println(lastDigit);
    }
}
