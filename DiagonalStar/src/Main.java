// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        printSquareStar(8);

    }


        private static final String STAR = "*";
        private static final String SPACE = " ";

        public static void printSquareStar (int number) {

            if (number < 5) {
                System.out.println("Invalid Value");
                return;
            }

            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++){

                    boolean isFirstRowOrColumn = row == 1  || column == 1;
                    boolean isLastRowOrColumn = row == number  || column == number;
                    boolean isDiagonal = (row == column) || (column == (number - row + 1));

                    if (isFirstRowOrColumn  || isLastRowOrColumn  || isDiagonal) {
                        System.out.print(STAR);
                    } else {
                        System.out.print(SPACE);
                    }
                }

                System.out.println();
            }
        }


}