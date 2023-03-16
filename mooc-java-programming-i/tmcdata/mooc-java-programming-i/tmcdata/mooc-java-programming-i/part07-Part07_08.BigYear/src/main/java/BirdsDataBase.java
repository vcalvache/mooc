import java.util.ArrayList;
import java.util.Scanner;

public class BirdsDataBase {
    private ArrayList<Bird> birdsDataBase;

    public BirdsDataBase(){
        this.birdsDataBase = new ArrayList<>();
    }

    public void addBird (Scanner reader){
        System.out.print("Name: ");
        String birdName = reader.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = reader.nextLine();
        
        birdsDataBase.add(new Bird(birdName, latinName));
    }

    public void addObservation(Scanner reader){
        System.out.print("Bird? ");
        String observedBird = reader.nextLine();
        boolean birdFound = false;
        for (Bird bird: birdsDataBase){
            if (bird.getName().equals(observedBird)){
                bird.addObservation();
                birdFound = true;
            } 
        }
        if (birdFound == false){
            System.out.println("Not a bird!");
        }
    }

    public void printOneBird(Scanner reader){
        System.out.print("Bird? ");
        String birdToFind = reader.nextLine();
        for (Bird bird: birdsDataBase){
            if (bird.getName().equals(birdToFind)){
                System.out.println(bird.toString());
            } else{
                System.out.println("Not a bird!");
            }
        }
    }

    public void printAllBirds(){
        for (Bird bird: birdsDataBase){
            System.out.println(bird.toString());
        }
    }
}