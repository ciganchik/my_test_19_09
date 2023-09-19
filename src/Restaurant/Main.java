package Restaurant;

public class Main {
    public static void main(String[] args) {
        Dish pizza = new Pizza("Margaritta", 324);
        Dish salad = new Salad("Cezar", 34);
        Dish drink = new Drink("Tea", 2);

        Order order = new Order();
        order.addDish(pizza);
        order.addDish(salad);
        order.addDish(drink);

        order.Show();
    }


}
