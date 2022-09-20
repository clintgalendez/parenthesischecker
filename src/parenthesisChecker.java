import java.util.Scanner;

public class parenthesisChecker {
    public static void main(String[] args) {
        int TEST_CASE_NUM;
        Scanner SCANNER_INPUT = new Scanner(System.in);

        //loops on checking if the user inputs an integer
        while (true) {
            try {
                System.out.print("Enter the number of test cases: ");
                TEST_CASE_NUM = Integer.parseInt(SCANNER_INPUT.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
                System.out.println("Please try again.");
            }
        }


        String[] TEST_CASES = new String[TEST_CASE_NUM];
        for (int i = 0; i < TEST_CASE_NUM; i++) {
            System.out.print("Enter Test case #" + (i + 1) + ": ");
            TEST_CASES[i] = SCANNER_INPUT.nextLine();
        }

        for (int i = 0; i < TEST_CASE_NUM; i++) {
            if (!checkBalance(TEST_CASES[i])) {
                System.out.println("Case #" + (i + 1) + ": " + TEST_CASES[i] + " - not properly matched");
            } else {
                System.out.println("Case #" + (i + 1) + ": " + TEST_CASES[i] + " - properly matched");
            }
        }
    }

    public static boolean checkBalance(String str) {
        stack s = new stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                if (s.isEmpty()) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
}
