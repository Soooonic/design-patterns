import car.BasicCar;
import car.Car;
import cardecorator.LuxuryCar;
import cardecorator.SportsCar;

public class Main {
    public static void main(String[] args) {
        Car sportsCar=new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n---------------");
        Car sportsLuxuryCar=new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
