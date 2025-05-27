import java.sql.*;

public class StudentDAO {
    public static void insertStudent(String name, int age) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "root", "your_password")) {
            String sql = "INSERT INTO students(name, age) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.executeUpdate();
            System.out.println("Student inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(int id, String newName) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "root", "your_password")) {
            String sql = "UPDATE students SET name=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, newName);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Student updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
