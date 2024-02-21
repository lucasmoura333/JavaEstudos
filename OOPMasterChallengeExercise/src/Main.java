public class Main {
    public static void main(String[] args) {


/*
        Pedidos regularPedido = new Pedidos();
        regularPedido.addBurgerToppings("BACON", "Cheese", "MAYO");
        regularPedido.setDrinkSize("GRANDE");
        regularPedido.printItemzedList();


        Pedidos secondMeal = new Pedidos("turkey", "7-up",
                "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("GRANDE");
        secondMeal.printItemzedList();

 */
        Pedidos premiumPedido = new Pedidos( "premium", "7-up",
                "chili");

        premiumPedido.addBurgerToppings("AVOCADO", "BACON", "TRECO1", "Treco 2","MAIONESE");
        premiumPedido.setDrinkSize("GRANDE");
        premiumPedido.printItemzedList();

    }
}