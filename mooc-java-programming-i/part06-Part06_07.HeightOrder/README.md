A Person class is included in the exercise template. A person has a name and a height. In this exercise, we'll implement a Room class, which can be used to add people and order them according to their height — taking a person out of the room always returns the shortest person.

The class should eventually work in the following way.

Part 1: Room
Create Room class. The class should contain a list of persons as an instance variable, and it should have a parameterless constructor. In addition, add the following methods to the class:

    * public void add(Person person) - add the person passed as a paramter to the list.
    * public boolean isEmpty() - returns a boolean-type value true or false, that tells whether the room is empty or not.
    * public ArrayList<Person> getPersons() - returns a list of the persons in the room.

    Room room = new Room();
    System.out.println("Empty room? " + room.isEmpty());
    room.add(new Person("Lea", 183));
    room.add(new Person("Kenya", 182));
    room.add(new Person("Auli", 186));
    room.add(new Person("Nina", 172));
    room.add(new Person("Terhi", 185));
    System.out.println("Empty room? " + room.isEmpty());

    System.out.println("");
    for (Person person : room.getPersons()) {
        System.out.println(person);
    }

    Sample output
        Empty room? true
        Empty room? false

        Lea (183 cm)
        Kenya (182 cm)
        Auli (186 cm)
        Nina (172 cm)
        Terhi (185 cm)

Part 2: Shortest person
Add a public Person shortest() method to the Room class, which returns the shortest person added to the room. If the room is empty, a null reference is returned. The method should not remove a person from the room.

    Room room = new Room();
    System.out.println("Shortest: " + room.shortest());
    System.out.println("Empty room? " + room.isEmpty());
    room.add(new Person("Lea", 183));
    room.add(new Person("Kenya", 182));
    room.add(new Person("Auli", 186));
    room.add(new Person("Nina", 172));
    room.add(new Person("Terhi", 185));
    System.out.println("Empty room? " + room.isEmpty());

    System.out.println("");
    for (Person person : room.getPersons()) {
        System.out.println(person);
    }

    System.out.println();
    System.out.println("Shortest: " + room.shortest());
    System.out.println("");
    for (Person person : room.getPersons()) {
        System.out.println(person);
    }

    Sample output
        Shortest: null
        Empty room? true
        Empty room? false

        Lea (183 cm)
        Kenya (182 cm)
        Auli (186 cm)
        Nina (172 cm)
        Terhi (185 cm)

        Shortest: Nina (172 cm)

        Lea (183 cm)
        Kenya (182 cm)
        Auli (186 cm)
        Nina (172 cm)
        Terhi (185 cm)

Part 3: Taking from a room
Add a public Person take() method to the Room class, which takes the shortest person in the room. When a room is empty, it returns a null reference.

    Room room = new Room();
    room.add(new Person("Lea", 183));
    room.add(new Person("Kenya", 182));
    room.add(new Person("Auli", 186));
    room.add(new Person("Nina", 172));
    room.add(new Person("Terhi", 185));

    System.out.println("");
    for (Person person : room.getPersons()) {
        System.out.println(person);
    }

    System.out.println();
    System.out.println("Shortest: " + room.take());
    System.out.println("");
    for (Person person : room.getPersons()) {
        System.out.println(person);
    }

    Sample output
        Lea (183 cm)
        Kenya (182 cm)
        Auli (186 cm)
        Nina (172 cm)
        Terhi (185 cm)

        Shortest: Nina (172 cm)

        Lea (183 cm)
        Kenya (182 cm)
        Auli (186 cm)
        Terhi (185 cm)

It's now possible to print the persons in height order.

    Room room = new Room();
    room.add(new Person("Lea", 183));
    room.add(new Person("Kenya", 182));
    room.add(new Person("Auli", 186));
    room.add(new Person("Nina", 172));
    room.add(new Person("Terhi", 185));

    while (!room.isEmpty()) {
        System.out.println(room.take());
    }

    Sample output
        Nina (172 cm)
        Kenya (182 cm)
        Lea (183 cm)
        Terhi (185 cm)
        Auli (186 cm)