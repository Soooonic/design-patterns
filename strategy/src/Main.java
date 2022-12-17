import duck.*;
import flybehavior.*;
import quackbehavior.*;
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        Duck rubberduck=new RubberDuck();
        rubberduck.setQuackBehavior(new Squeak());
        rubberduck.setFlyBehavior(new FlyNoWay());
        rubberduck.display();
        rubberduck.performQuack();
        rubberduck.performFly();

    }
}
