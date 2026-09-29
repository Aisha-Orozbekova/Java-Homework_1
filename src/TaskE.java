import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long v = scanner.nextLong();
        long t = scanner.nextLong();
        long s = v * t;

        long position = ((s % 109) + 109) % 109;

        System.out.println(position);
    }
}
