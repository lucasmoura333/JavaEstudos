public class Main {
    public static void main(String[] args) {
    }


    public static int sumDigits(int number){

        if (number < 0){
            return -1;
        }

        sum = 0;

        while (number > 9){
            sum += (number % 10);
            number = (number/10 );
        }

        sum += number;

        return  sum;
    }

