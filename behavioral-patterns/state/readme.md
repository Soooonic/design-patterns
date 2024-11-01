## Problem
Suppose we want to implement a TV Remote with a simple button to perform action. If the State is ON, it will turn on the TV and if state is OFF, it will turn off the TV. We can implement it using if-else condition like below
```java
if(state.equalsIgnoreCase("ON")){
    System.out.println("TV is turned ON");
}
else if(state.equalsIgnoreCase("OFF")){
    System.out.println("TV is turned OFF");
}

```
Notice that client code should know the specific values to use for setting the state of remote. Further more if number of states increase then the tight coupling between implementation and the client code will be very hard to maintain and extend.


(To understand the problem better ,read this [blog](https://marcusleeeugene.medium.com/state-design-pattern-6beeb851bbe3) )
## Solution
Now we will use State pattern to implement above TV Remote example.


## Structure
![state](https://github.com/user-attachments/assets/28fb5f8c-cce3-4850-aafc-5d783a64ea48)