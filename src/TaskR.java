import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt(); //кол-во школьников
        int k = scanner.nextInt(); //кол-во яблок
        int result = (n - (k % n)) %n;

        System.out.println(result);


    }
}
