import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID and name (type ID 0 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            if (id == 0) break;
            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to retrieve student name: ");
        int searchId = sc.nextInt();
        String result = studentMap.getOrDefault(searchId, "Student not found");
        System.out.println("Result: " + result);
    }
}
