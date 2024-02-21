public class TeenNumberChecker {

    public static boolean hasTeen (int var1, int var2, int var3){
        return isTeen(var1) || isTeen(var2) || isTeen(var3);
    }

    public static boolean isTeen(int varCheck){

        if (varCheck > 12  &&  varCheck <20){
            return true;
        }else{
            return false;
        }

    }

}
