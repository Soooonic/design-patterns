package template;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }
    //required methods
    public abstract void buildWalls();
    public abstract void buildPillars();
    //optional methods
    public void buildWindows(){
        System.out.println("Building Glass Windows");
    }
    public void buildFoundation(){
        System.out.println("Building foundation with cement,iron rods and sand");
    }

}
