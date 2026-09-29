import java.util.Scanner;
public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Кол-во школьников
        int k = scanner.nextInt(); // Кол-во яблок

        int applesPerStudent = k / n;

        System.out.println(applesPerStudent);

    }
}
