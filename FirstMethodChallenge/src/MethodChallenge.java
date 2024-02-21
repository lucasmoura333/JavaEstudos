public class MethodChallenge {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Lucas", highScorePosition);

         highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Lucas 2", highScorePosition);

         highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Lucas 3", highScorePosition);

         highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lucas 4 ", highScorePosition);

         highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Lucas 5 ", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
                            + highScorePosition + " on the highscore list");
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;

        if (playerScore >= 1000){
            position = 1;
        }  else if (playerScore >= 500 ){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }

        return position;
    }
}
