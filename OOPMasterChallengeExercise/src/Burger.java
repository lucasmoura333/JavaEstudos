public class Burger extends Item{

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getLanche() {
        return super.getLanche()+ " Burger";
    }

    @Override
    public double getPrecoAjustado() {
        return getPrecoBase() +
                ((extra1 == null) ? 0 : extra1.getPrecoAjustado()) +
                ((extra2 == null) ? 0 : extra2.getPrecoAjustado()) +
                ((extra3 == null) ? 0 : extra3.getPrecoAjustado());

    }

    public double getExtraPreco(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "milho", "queijo" -> 1.5;
            case "BACON", "presunto", "salame" -> 3.0;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){

        this.extra1 = new Item("TOPPING", extra1, getExtraPreco(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPreco(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPreco(extra3));
    }

    public void printItemizedList() {

        printItem("BASE BURGER", getPrecoBase());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
