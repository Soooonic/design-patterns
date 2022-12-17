package duck;

import flybehavior.*;
import quackbehavior.*;

public abstract class Duck {
    private FlyBehavior flyBehavior=null;
    private QuackBehavior quackBehavior=null;
    public void display(){
    }
    public void Swim(){
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior=quackBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior=flyBehavior;
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
}
