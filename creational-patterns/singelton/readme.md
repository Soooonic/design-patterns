## Problem
we want to create only single instance of some class,

so we have two problems:
    
    1- Ensure that a class has just a single instance. Why would anyone
    want to control how many instances a class has? The most
    common reason for this is to control access to some shared
    resource—for example, a database or a file.

    2- Provide a global access point to that instance. Remember those
    global variables that you (all right, me) used to store some
    essential objects? While they’re very handy, they’re also very
    unsafe since any code can potentially overwrite the contents
    of those variables and crash the app.

## Solution
All implementations of the Singleton have these two steps in
common:
* Make the default constructor private, to prevent other objects
from using the new operator with the Singleton class.
* Create a static creation method(getInstance) that acts as a constructor.
Under the hood, this method calls the private constructor to
create an object and saves it in a static field. All following calls
to this method return the cached object.

    There’s another side to this problem: you don’t want the code
    that solves problem #1 to be scattered all over your program.
    It’s much better to have it within one class, especially if the
    rest of your code already depends on it.

## Structure
![singleton](https://github.com/user-attachments/assets/821f54e9-91e3-44f1-a910-4a329da6315c)