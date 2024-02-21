public class Costumer {

    private String name;
    private double creditLimit;
    private String email;

    public Costumer(){
        this("Nobody", "nobody@email.com");
    }

    public Costumer (String name, String email){
        this(name, 1000, email);
    }

    public Costumer(String name, double creditLimit, String email){
        this.name        = name;
        this.creditLimit = creditLimit;
        this.email       = email;
    }

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }
}
