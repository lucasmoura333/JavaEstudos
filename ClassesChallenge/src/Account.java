public class Account {

    private String number;
    private double balance;
    private String custumerName;
    private String costumerEmail;
    private String costumerPhone;


    public void depositFunds (double depositAmount){

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $"
        + balance);
    }

    public void withdrawFunds (double withdrawlAmount) {
        if (balance - withdrawlAmount < 0){
            System.out.println("Insifficiente Funds! you only have $"
            +balance + " in your account.");
        } else{
            balance -= withdrawlAmount;
            System.out.println("Withdrawl of $" + withdrawlAmount +
                    " processed, remaining balance of = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustumerName() {
        return custumerName;
    }

    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }

    public String getCostumerEmail() {
        return costumerEmail;
    }

    public void setCostumerEmail(String costumerEmail) {
        this.costumerEmail = costumerEmail;
    }

    public String getCostumerPhone() {
        return costumerPhone;
    }

    public void setCostumerPhone(String costumerPhone) {
        this.costumerPhone = costumerPhone;
    }
}
