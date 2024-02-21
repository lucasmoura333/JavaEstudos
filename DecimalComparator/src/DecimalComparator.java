/*
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double parm1, double parm2){

        parm1 = (((long) parm1) * 1000);
        parm2 = (((long) parm2) * 1000);

        if (parm1 == parm2){
           return true;
       } else {
            return false;
        }
    }
}

 */


public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double parm1, double parm2) {

        long longParm1 = (long) (parm1 * 1000);
        long longParm2 = (long) (parm2 * 1000);
        return longParm1 == longParm2;
    }
}