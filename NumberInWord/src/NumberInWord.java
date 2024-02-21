public class NumberInWord {
    public static void printNumberInWord(int number){
        String numeroRetorno ;
        switch (number) {
            case 0 -> numeroRetorno = "ZERO";
            case 1 -> numeroRetorno = "ONE";
            case 2 -> numeroRetorno = "TWO";
            case 3 -> numeroRetorno = "THREE";
            case 4 -> numeroRetorno = "FOUR";
            case 5 -> numeroRetorno = "FIVE";
            case 6 -> numeroRetorno = "SIX";
            case 7 -> numeroRetorno = "SEVEN";
            case 8 -> numeroRetorno = "EIGHT";
            case 9 -> numeroRetorno = "NINE";
            default -> numeroRetorno = "OTHER";
        };
        System.out.println(numeroRetorno);

    }
}
