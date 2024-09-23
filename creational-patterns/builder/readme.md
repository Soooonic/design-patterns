## Problem
we want to create object with large number of optional parameters and the object is immutable and the parameters of the object are of two types (requied , optional) so when i know the info of required parameters when i instantiate the object but i will the info of the optional parameters in later stage
so we now have two problems:
* create object with large number of optional parameters
     that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument
* object will be in inconistent state
    if the object is immutable and doesn't have setters
    so if there some attributes i will know it in later stage in the code, then i will never set them to the object
    example:
```java
Computer coumputer = new Computer("1TB", "16GB", "2.4GHz","Intel i7",null,null,null);

//do some operatios


//get the optional parameters

String opticalDrive=scanner.next();
//i can't set this value to the object cause i don't have setCoolingSystem() method
//this line will get an error
computer.setOpticalDrive(opticalDrive);

boolean graphicsCardInput=scanner.next();
if(graphicsCardInput){
   //i can't set this value to the object cause i don't have setGraphicsCard() method
   //this line will get an error
   computer.setGraphicsCardEnabled();
}
```


## Solution
Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
the solution for above example:
```java
Computer.ComputerBuilder computerBuilder=new Computer.ComputerBuilder("1TB", "16GB", "2.4GHz","Intel i7");

//do some operations


//get the optional parameters

String opticalDrive=scanner.next();
computerBuilder.setOpticalDrive(opticalDrive);

boolean graphicsCardInput=scanner.nextBoolean();
if(graphicsCardInput){
  computerBuilder.setGraphicsCardEnabled();
}

Computer computer=computerBuilder.getResult();
```



## Structure
![builder](https://github.com/user-attachments/assets/17631074-9ba8-42ee-a891-82731b42a4cf)
