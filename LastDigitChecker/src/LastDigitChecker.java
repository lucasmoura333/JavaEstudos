public class LastDigitChecker {

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;

    }

    public static boolean hasSameLastDigit (int first, int second, int third) {

        if (!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        }

        int firstLast = first % 10;
        int secondLast = second % 10;
        int thirdLast = third % 10;


        return (firstLast == secondLast) || (firstLast == thirdLast) || (secondLast == thirdLast);




    }


}
