// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number = 4;
        int endNumber = 20;

        int countOdds = 0;
        int countEvens = 0;

        while ( number <= endNumber) {
            number++;

            if (!isEvenNumber(number)){
                countOdds++;
                continue;
            }
            countEvens++;
            System.out.println("Even number " +number);

            if (countEvens >= 5) {
                break;
            }

        }

        System.out.println("The total of numbers are: " + countOdds);
        System.out.println("The total of numbers Evens: " + countEvens);
    }

    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}