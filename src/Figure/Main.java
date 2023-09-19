package Figure;

public class Main{
    public static void main(String[] args) {
        figure figure1 = new circle(52.6);
        figure figure2 = new triangle(52, 5);

        figure1.calculation();
        figure2.calculation();
    }
}

abstract class figure{
    abstract void calculation();
}

class circle extends figure{
    public double radius;

    public circle(double radius) {
        this.radius = radius;
    }


    @Override
    void calculation() {
        System.out.println(Math.PI + Math.sqrt(radius) );
    }
}

class triangle extends figure{
    public double length;
    public double height;

    public triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    void calculation() {
        System.out.println((length * height)/2 );
    }
}


/**
 * Класс фигура, рассчет площади, под
 */