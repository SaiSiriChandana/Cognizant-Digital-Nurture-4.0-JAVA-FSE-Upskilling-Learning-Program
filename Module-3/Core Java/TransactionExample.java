import java.sql.*;

public class TransactionExample {
    public static void transferMoney(int fromId, int toId, int amount) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "root", "your_password")) {
            conn.setAutoCommit(false);

            PreparedStatement withdraw = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            withdraw.setInt(1, amount);
            withdraw.setInt(2, fromId);
            withdraw.executeUpdate();

            PreparedStatement deposit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            deposit.setInt(1, amount);
            deposit.setInt(2, toId);
            deposit.executeUpdate();

            conn.commit();
            System.out.println("Transfer completed.");
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                System.out.println("Transaction failed. Rolling back...");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "root", "your_password");
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
