## Problem
We have a class doing some operation using a lot of behaviours

the simplest way to do that is passing the behaviour 
as an argument in the method that do the operation and based on the behaviour , part of code is running

this way will do some problems:
- code in this method will be too huge ,and it may cause bugs and adding new behaviours will be too complex and cause a lot of problems.
- this way violates open-closed principle.

## Solution
use strategy to separate each behaviour in separate class and each class implements the same interface
and the client sends the desired behaviour to context class(class that do the operation).

## Structure
![Strayegy](https://github.com/user-attachments/assets/38e2cdff-e753-4d1d-8ab6-0ee6e3935823)