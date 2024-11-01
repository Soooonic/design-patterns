import template.GlassHouse;
import template.HouseTemplate;
import template.WoodenHouse;

public class Main {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
