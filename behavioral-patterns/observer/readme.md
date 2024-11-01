## Problem
we want to create a news app and the app have topics to classify the news
and have users who interested in some topics so instead of letting user go and check all of topics that he interested in,
we want to notify him with the news of these topics.

## Solution
apply observer pattern to make users as observers(implement observer interface) and make topic as subject(implement subject interface (as subject class is the class that user interested in) )

## Structure
![observer](https://github.com/user-attachments/assets/50737504-b90d-4169-959e-3246d502022f)