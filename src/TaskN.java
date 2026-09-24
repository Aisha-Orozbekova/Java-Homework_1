import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int oneLesson = n * 45;
        int breaks = ((n-1)/2) * 15 +((n-1)-(n -1) / 2) *5;
        int totalMinutes = 540 + oneLesson + breaks;
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        System.out.println(finalHours + " " + finalMinutes);
    }
}
