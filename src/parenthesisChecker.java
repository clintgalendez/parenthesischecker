import java.util.Scanner;

public class parenthesisChecker {
    public static void main(String[] args) {
        int TEST_CASE_NUM;
        Scanner SCANNER_INPUT = new Scanner(System.in);

        while (true) {
            try {
                TEST_CASE_NUM = Integer.parseInt(SCANNER_INPUT.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
                System.out.print("Please try again:");
            }
        }

        String[] TEST_CASES = new String[TEST_CASE_NUM];
        for (int i = 0; i < TEST_CASE_NUM; i++) {
            TEST_CASES[i] = SCANNER_INPUT.nextLine();
        }

        for (int i = 0; i < TEST_CASE_NUM; i++) {
            if (!checkBalance(TEST_CASES[i])) {
                System.out.println("Case #" + (i + 1) + ": not properly matched");
            } else {
                System.out.println("Case #" + (i + 1) + ": properly matched");
            }
        }
    }

    public static boolean checkBalance(String TEST_CASE) {
        stack PARENTHESIS_STACK = new stack(TEST_CASE.length());

        for (int i = 0; i < TEST_CASE.length(); i++) {
            char CURRENT_CHAR = TEST_CASE.charAt(i);

            if (CURRENT_CHAR == '(') {
                PARENTHESIS_STACK.push(CURRENT_CHAR);
            }

            else if (CURRENT_CHAR == ')') {
                if (PARENTHESIS_STACK.isEmpty()) {
                    return false;
                } else {
                    PARENTHESIS_STACK.pop();
                }
            }
        }

        return PARENTHESIS_STACK.isEmpty();
    }
}