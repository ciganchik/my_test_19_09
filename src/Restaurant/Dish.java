package Restaurant;

public class Dish
{

    private String Name;
    private double price;

    public Dish(String name, int price) {
        this.Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }
}

class Pizza extends Dish{

    public Pizza(String name, int price) {
        super(name, price);
    }
}

class Salad extends Dish{

    public Salad(String name, int price) {
        super(name, price);
    }
}

class Drink extends Dish{

    public Drink(String name, int price) {
        super(name, price);
    }
}

