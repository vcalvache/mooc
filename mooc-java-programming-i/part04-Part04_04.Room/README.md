Create a class named Room. Add the variables private String code and private int seats to the class. Then create a constructor public Room(String classCode, int numberOfSeats) through which values are assigned to the instance variables.
```
classDiagram
 class Room {
        - code: String
        - numberOfSeatns: int
        + Room(String, int)
    }
```
This class doesn't do much either. However, in the following exercise the object instantiated from our class is already capable of printing text.