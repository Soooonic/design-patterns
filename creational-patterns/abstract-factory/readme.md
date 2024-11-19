## Problem
we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class also like factory pattern but factory pattern doesn't follow open-closed principle(with alot of if-else inside factory method) as if we have added a new subcalss , we have to modify factory class instead of extends it.

## Solution
abstract factory design pattern get rid of if-else block and have a factory class for each sub-class.

## Structure
![abstract factory](https://github.com/user-attachments/assets/603282f8-4042-45b1-a298-be00c1c6be32)
