
public class Main {

    public static void main(String[] args) {

        /*
        In the exercise base there is the class Person, which we are already quite familiar with.
        There is also an outline for the class HealthStation.
        Health station objects process people in different ways, they e.g. weigh and feed people.
        In this exercise we will construct a health station.
        The code of the Person class should not be modified in this exercise!

        Part 1: Weighing people
        In the outline of the Health station there is an outline for the method weigh:

        public class HealthStation {

            public int weigh(Person person) {
                // return the weight of the person passed as the parameter
                return -1;
            }
        }
        The method receives a person as a parameter, and it is meant to return to its caller the weight of that person.
        The weight information can be found by calling a suitable method of the person person.
        So your task is to complete the code of the method!

        Here is a main program where a health station weight two people:

        public static void main(String[] args) {
            // example main program for the first section of the exercise

            HealthStation childrensHospital = new HealthStation();

            Person ethan = new Person("Ethan", 1, 110, 7);
            Person peter = new Person("Peter", 33, 176, 85);

            System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
            System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        }
        The output should be the following:

        Sample output
        Ethan's weight: 7 kilos
        Peter's weight: 85 kilos

        Part 2: Feeding
        It is possible to modify the state of the object that is received as a parameter.
        Write a method called public void feed(Person person) for the health station.
        It should increase the weight of the parameter person by one.

        Following is an example where people are weighed first,
        and then ethan is fed three times in the children's hospital.
        After this the people are weighed again:

        public static void main(String[] args) {
            HealthStation childrensHospital = new HealthStation();

            Person ethan = new Person("Ethan", 1, 110, 7);
            Person peter = new Person("Peter", 33, 176, 85);

            System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
            System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

            childrensHospital.feed(ethan);
            childrensHospital.feed(ethan);
            childrensHospital.feed(ethan);

            System.out.println("");

            System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
            System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        }
        The output should reveal that Ethan's weight has increased by three:

        Sample output
        Ethan weight: 7 kilos
        Peter weight: 85 kilos

        Ethan weight: 10 kilos
        Peter weight: 85 kilos

        Part 3: Counting weighings
        Create a new method called public int weighings() for the health station.
        It should tell how many weighings the health station has performed.
        NB! You will need a new object variable for counting the number of weighings!. Test main program:

        public static void main(String[] args) {

            HealthStation childrensHospital = new HealthStation();

            Person ethan = new Person("Ethan", 1, 110, 7);
            Person peter = new Person("Peter", 33, 176, 85);

            System.out.println("weighings performed: " + childrensHospital.weighings());

            childrensHospital.weigh(ethan);
            childrensHospital.weigh(peter);

            System.out.println("weighings performed: " + childrensHospital.weighings());

            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);

            System.out.println("weighings performed: " + childrensHospital.weighings());
        }
        The output is:

        Sample output
        weighings performed: 0
        weighings performed: 2
        weighings performed: 6
        */

        // write experimental code here to check how your program functions

        HealthStation childenHospital = new HealthStation();
        Person victor = new Person("Victor", 37, 165, 68);

        System.out.println(victor.getName()+"'s weight: " + childenHospital.weigh(victor)+" kilos");
        childenHospital.feed(victor);
        childenHospital.feed(victor);
        childenHospital.feed(victor);
        System.out.println(victor.getName()+"'s weight: " + childenHospital.weigh(victor)+" kilos");
        System.out.println("Weighning performed: " + childenHospital.weighings());
        HealthStation station =  new HealthStation();
        Person p1 = new Person("Peter", 33, 175, 78);
        station.weigh(p1);
        System.out.println(station.weighings() );
    }
}
