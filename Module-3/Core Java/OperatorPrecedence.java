public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result); // Expected: 20 (multiplication has higher precedence)

        // Explanation:
        // 5 * 2 = 10
        // 10 + 10 = 20
    }
}
