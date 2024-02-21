public class BurgerPremium extends Burger{

    Item premium1;
    Item premium2;

    public BurgerPremium(String name, double price) {
        super(name, price);
    }


    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        premium1 = new Item ("Topping", extra4, 0);
        premium2 = new Item ("Topping", extra5, 0);

    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();

        if (premium1 !=null){
            premium1.printItem();;
        }

        if (premium2 !=null){
            premium2.printItem();;
        }

    }

    @Override
    public double getExtraPreco(String toppingName) {
        return super.getExtraPreco(toppingName);
    }
}
