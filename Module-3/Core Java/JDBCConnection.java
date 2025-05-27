import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "root";
        String password = "your_password";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name"));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}
