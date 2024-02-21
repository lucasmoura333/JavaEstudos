public class Main {
    public static void main(String[] args) {

        Account lucasAccount = new Account();

        lucasAccount.setNumber("12345");
        lucasAccount.setBalance(9999999);
        lucasAccount.setCustumerName("Lucas Moura");
        lucasAccount.setCostumerEmail("emailteste.@gmail.com");
        lucasAccount.setCostumerPhone("65 993131236");

        lucasAccount.depositFunds(250);
        lucasAccount.withdrawFunds(100.0);
    }
}