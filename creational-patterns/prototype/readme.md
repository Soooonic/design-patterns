## Problem
we have an Object that loads data from database. Now we need to modify this data in our program multiple times, so it's not a good idea to create the Object using new keyword and load all the data again from database.

## Solution
The better approach would be to clone the existing object into a new object and then do the data manipulation so Prototype design pattern uses java cloning to copy the object.

## Structure
![prototype](https://github.com/user-attachments/assets/c607f77c-d62b-41be-93d7-8f1089235efe)