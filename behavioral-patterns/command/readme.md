## Problem
we have a class dependent on another class
(so any change in the second class will affect the first class)
so, we want to decouple them
and make the communication between them using a mediator 

or 

we have a lot of classes do the same operation such as save operation
(class: SaveButton, class: SaveMenuItem, class: SaveShortcut)

## Solution
we can solve the first problem by applying command design pattern
and we make class command works as a mediator between the two classes(loose coupling)

and to solve the second problem , we apply command design pattern so i will have one class which do the operation
and i will use it in all different classes
## Structure
![command](https://github.com/user-attachments/assets/29a31a6d-0653-4497-9339-ed8cb00342a1)