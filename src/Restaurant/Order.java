package Restaurant;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Dish> dishes;

    public Order() {
            dishes = new ArrayList();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void removeDish(Dish dish){
        dishes.remove(dish);
    }

    public double calculate(){
        double total = 0;
        for (Dish dish:dishes) {
            total+= dish.getPrice();
        }
        return total;
    }

    public void Show(){

        for (Dish dish:dishes) {
            System.out.println("Название позиции: " + dish.getName() + "\nЦена: " + dish.getPrice() + "PLN");
        }
        System.out.println("Общая стоимость: " + calculate() + "PLN");

    }
}
