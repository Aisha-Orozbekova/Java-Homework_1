import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hours = (n % 1440) / 60;
        int minutes = n % 60;
        System.out.println(hours + " " + minutes);

    }
}
