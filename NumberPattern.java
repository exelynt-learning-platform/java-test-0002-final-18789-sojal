
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            for (int num = i - 1; num >= 1; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}