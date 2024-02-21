public class PerfectNumber {


    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 1; // Start with 1 since all numbers are divisible by 1.
        int sqrt = (int) Math.sqrt(number);



        for (int i = 2; i <= sqrt; i++) {

            if (number % i == 0) {
                sum += i;
                int otherDivisor = number / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }
        return sum == number;

    }

}