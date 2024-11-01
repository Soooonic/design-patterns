## Problem
we use adapter pattern when we are forced on specific input and specific output

ex:

we want to create app that takes data as xml files and display it as charts and diagrams, and suddenly we decided to integrate with analytics library that takes data as json file

here's the problem that we take data as xml and want to pass it as json

now we are forced on specific input(xml) and specific output(json)

some solutions that will come to your head:

-change the input data(xml) to (json)

-change the library data(json) to (xml)

let's discuss these solutions:

sol 1 - change the input data(xml) to (json):

    we have two problems in this solution:
    1- there is no json data for the subject we want
    2- changing data from xml to json will affect in another large parts of our code

sol 2 - change the library data(json) to (xml):

    we have two problems in this solution:
    1- we can't modify library code
    2- changing data from json to xml will affect in another large parts of our code depends on this library

and as we are programmers we must always think about worst-case scenario
(there is no json data for the subject we want, and we can't modify library code)

so there is no solution except: converting xml data to json data

I can't change one of them, but I can put an adapter to convert xml to json

[another example: 
One of the great real life example of Adapter design pattern is mobile charger. 
Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 220V (Egypt).
So the mobile charger works as an adapter between mobile charging socket and the wall socket]

## Solution
You can create an adapter. This is a special object that converts the interface of one object so that another object can understand it.

There are two type of adapter pattern:
* Class Adapter - This form uses inheritance and extends the source interface, in our case Socket class.
* Object Adapter - This form uses Composition and adapter contains the source object.

## Structure
### Class Adapter
![adapter-1](https://github.com/user-attachments/assets/70247c81-1de7-437d-a76b-023312ae5ee3)

### Object Adapter
![adapter-2](https://github.com/user-attachments/assets/e23ebd1a-2ddc-4e31-aca1-5b44210157e5)