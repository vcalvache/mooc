import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;
    
    public Room (){
        this.room = new ArrayList<>();
    }

    public void add(Person person){
        room.add(person);
    }

    public boolean isEmpty(){
        if (this.room.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        ArrayList<Person> personsInTheRoom = new ArrayList<>();

        for (Person person: room){
            personsInTheRoom.add(person);
        }
        return personsInTheRoom;
    }

    public Person shortest(){
        if (this.room.isEmpty()){
            return null;
        }

        Person smallestPerson = new Person(room.get(0).getName(), room.get(0).getHeight());

        for (Person person: room){
            if (person.getHeight() < smallestPerson.getHeight()){
                smallestPerson = person;
            }
        }
        return smallestPerson;
    }
    
    public Person take(){
        
        if (this.room.isEmpty()){
            return null;
        }
        
        Person smallestPerson = shortest();

        if (this.room.contains(smallestPerson)){
            this.room.remove(smallestPerson);
        }

        return smallestPerson;

    }
}
