public class DesafioSecao5 {
    public static void main(String[] args) {
        //Passo 1
        double primeiraVariavel = 20.00d;
        //Passo 2
        double segundaVariavel = 80.00d;
        //Passo 3
        double somaDasVariaveis = (primeiraVariavel + segundaVariavel) * 100.00d;

        System.out.println("Valor total = "+ somaDasVariaveis);

        double restoDaSoma = somaDasVariaveis % 40.00D;
        System.out.println("O resto da soma: " +restoDaSoma);

        //Passo 6
        boolean naoPossuiResto = (restoDaSoma == 0) ? true: false;
        System.out.println("Possui resto na soma? " +naoPossuiResto);

        //Passo 7&&

        if (!naoPossuiResto) {
            System.out.println("Tem um restinho");
        }




    }


}
