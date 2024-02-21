public class Pedidos {
    private Burger burger;
    private Item drink;
    private Item acompanhamento;

    public Pedidos(){
        this("regular", "coca", "batata frita");
    }

    public Pedidos(String burgerType, String drinkType, String acompanhamentoType){
        
        if (burgerType.equalsIgnoreCase("premium")){
            this.burger = new BurgerPremium( burgerType, 8.5);
        }else {
            this.burger = new Burger(burgerType, 4);
        }

        this.drink = new Item("drink", drinkType, 1);
        this.acompanhamento = new Item("acompanhamento", acompanhamentoType, 1.5);
    }

    public double getPrecoTotal(){

        if (burger instanceof BurgerPremium){
            return burger.getPrecoAjustado();
        }
        return acompanhamento.getPrecoAjustado() + drink.getPrecoAjustado() +
                burger.getPrecoAjustado();
    }

    public void printItemzedList(){
        burger.printItem();

        if (burger instanceof BurgerPremium){
            Item.printItem(drink.getLanche(), 0);
            Item.printItem(acompanhamento.getLanche(), 0);
        } else {
            drink.printItem();
            acompanhamento.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getPrecoTotal());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof BurgerPremium bp){
            bp.addToppings(extra1,extra2,extra3,extra4,extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String sizeDrink) {
        drink.setTamanho(sizeDrink);
    }
}
