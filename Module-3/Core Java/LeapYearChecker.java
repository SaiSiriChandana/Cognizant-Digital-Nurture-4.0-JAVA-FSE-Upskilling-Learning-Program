import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0)
                leap = true;
        }

        if (leap)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}
