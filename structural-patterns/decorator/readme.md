## Problem 
Suppose we want to implement different kinds of cars
if i want to create a new car object that have the features of two kinds of cars that can be done by inheritance or composition
but if i have ten kinds of cars and i wand to add features from this classes at runtime that will be complex.
suppose this scenario:

class BasicCar

class SportsCar extends BasicCar

class LuxuryCar extends BasicCar

// and i want to make create object that will be a sports car and luxury car

//at compile time:

we can create a new class: 
SportsLuxuryCar extends SportsCar,LuxuryCar
and for language that doesn't support multiple inheritance we can that like this:

class SportsCar extends BasicCar

class SportsLuxuryCar extends SportsCar

class Luxury extends BasicCar

however these two ways will be too complex if the number kinds increased as i will have to make all the combinations to satisfy the user input

//at runtime:
will be impossible
## Solution
Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior.

## Structure
![decorator](https://github.com/user-attachments/assets/73be97e4-0aaf-4c8f-98d0-b4aa54faa33e)
