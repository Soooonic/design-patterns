## Problem
We want two unrelated interfaces can work together
One of the great real life example of Adapter design pattern is mobile charger. 
Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 220V (Egypt).

## Solution
So the mobile charger works as an adapter between mobile charging socket and the wall socket.
We will try to implement multi-adapter using adapter design pattern.

There are two type of adapter pattern:
* Class Adapter - This form uses inheritance and extends the source interface, in our case Socket class.
* Object Adapter - This form uses Composition and adapter contains the source object.

## Structure
### Class Adapter
![adapter-1](https://github.com/user-attachments/assets/70247c81-1de7-437d-a76b-023312ae5ee3)

### Object Adapter
![adapter-2](https://github.com/user-attachments/assets/e23ebd1a-2ddc-4e31-aca1-5b44210157e5)