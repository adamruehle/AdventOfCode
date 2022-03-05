public class Day10 {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;

        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < columns + 1; j++) {
                if (j == 0 && i != rows) {
                    System.out.print(" " + i + " |");
                }
                else if (j > 0 && i != rows) {
                    System.out.print("   |");
                }
                else if (j == 0 && i == rows) {
                    System.out.print("    ");
                }
                else if (j > 0 && i == rows) {
                    System.out.print(" " + (j - 1) + "  ");
                }
                if (j == columns) {
                    System.out.println();
                }
            }
        }
    }
}