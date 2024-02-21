public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature){
        boolean teste;

        if (summer) {
            if (temperature >= 25 && temperature <= 45){
                teste = true;
            } else{
                teste = false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35){
                teste = true;
            } else{
                teste = false ;
            }

        }

        return teste;
    }
}


/*

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}

 */
