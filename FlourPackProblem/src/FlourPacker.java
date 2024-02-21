public class FlourPacker {

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack (int bigCount, int smallCount, int goal){

        if (bigCount < 0 ||smallCount < 0 ||goal < 0) {
           return false;
        }

        boolean resultado = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;

        if (totalBigWeight >= goal) {

            int restante = goal % BIG_WEIGHT;

            if (smallCount >= restante){
                resultado = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                resultado = true;
            }
        }

        return resultado;
    }
}
