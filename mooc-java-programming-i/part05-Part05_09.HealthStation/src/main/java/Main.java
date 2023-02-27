
public class Main {

    public static void main(String[] args) {

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