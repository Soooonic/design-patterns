## Problem 
we use decorator pattern when we want to make the user to create entity in the system and able to add some features to this entity as long as he goes

ex:

we create app that makes the user able to customize the car he wants as he first starts with basic car 
and have some options such as makes the car sports car or luxury car or both.

to do that first thing will come to your head is to use inheritance from BasicCar class and add SportsCar and LuxuryCar, 

so we will have to add subclasses to all combinations (SportsCar , LuxuryCar , SportsLuxuryCar , ...)

and if the number of subclasses increased the number of combinations will increase and will become too hard to implement and will be complex to choose the options i want at runtime.

now we have two problems:

    1- large number of subclasses(combinations)
    2- Inheritance is static. You can’t alter the behavior of an existing
    object at runtime. You can only replace the whole object with
    another one that’s created from a different subclass.
see this example if we use Inheritance
``` java 
BasicCar car=new BasicCar();
if(sportsCarEnabled && luxuryCarEnabled)
    //clonning
    //copy constructor to clone the data from car object
    car=new SportsLuxuryCar(car); 
else if(sportsCarEnabled)
    car=new SportsCar(car);
else if(luxuryCarEnabled)
    car=new LuxuryCar(car); 
...
```

## Solution
one of the ways to overcome these problems is by using Composition instead of Inheritance.
see this example if we use Composition
``` java
BasicCar car=new BasicCar();
if(sportsCarEnabled)
    //constructor to set car object inside SporstsCar class
    car=new SportsCar(car);
if(luxuryCarEnabled)
    car=new LuxuryCar(car);
```
The resulting objects will be structured as a stack,
as the last decorator in the stack would be the object that the client actually works with.

Decorator definition:

Decorator is a structural design pattern that lets you attach
new behaviors to objects by placing these objects inside
special wrapper objects that contain the behaviors.

## Structure
![decorator](https://github.com/user-attachments/assets/73be97e4-0aaf-4c8f-98d0-b4aa54faa33e)
