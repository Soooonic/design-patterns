## Problem
suppose we want to provide an algorithm to build a house. 
The steps need to be performed to build a house are - building foundation, building pillars, building walls and windows. 
The important point is that we can’t change the order of execution because we can’t build windows before building the foundation.

, so now we have two problems:
- run each operation in its order
- remove duplicated code in the same operations of subclasses

to understand the second problem: 


```java
//before template method:
class GlassHouse{
    void buildHouse(){
        System.out.println("Building foundation with cement,iron rods and sand");
        System.out.println("Building Pillars with glass coating");
        System.out.println("Building Glass Walls");
        System.out.println("Building Glass Windows");
    }
}

class WoodenHouse{
    void buildHouse(){
        System.out.println("Building foundation with cement,iron rods and sand");
        System.out.println("Building Pillars with Wood coating");
        System.out.println("Building Wooden Walls");
        System.out.println("Building Glass Windows");
    }
}

//after template method:
//see code
```

## Solution
So in this case we can create a template method that will use different methods to build the house. Now building the foundation for a house is same for all type of houses, whether its a wooden house or a glass house.
So we can provide base implementation for this, if subclasses want to override this method, they can but mostly it’s common for all the types of houses. To make sure that subclasses don’t override the template method, we should make it final.

## Structure
![template-method](https://github.com/user-attachments/assets/9b2dc70b-d7e1-42d2-8fb3-9a25ff3d0941)
