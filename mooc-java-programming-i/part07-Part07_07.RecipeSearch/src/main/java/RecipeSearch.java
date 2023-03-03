
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();


        System.out.print("File to read: ");
        String fileToFind = scanner.nextLine();
        System.out.println();

        while(true){
            System.out.println("Commands:");
            System.out.println("list - list the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println();
            System.out.print("Enter command: ");
            String command =  scanner.nextLine();

            if (command.equals("list")){
                System.out.println();
                manager.readRecipes(fileToFind);
                manager.listRecipes();
                System.out.println();
            } else if (command.equals("find name")){
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println();
                manager.readRecipes(fileToFind);
                manager.findRecipeByWord(word);
            } else if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println();
                manager.readRecipes(fileToFind);
                manager.findByMaxCookingTime(maxCookingTime);
            }else if (command.equals("find ingredient")){    
                System.out.print("Ingredient: ");
                String ingredientToFind = scanner.nextLine();
                System.out.println();
                manager.readRecipes(fileToFind);
                manager.findByIngredient(ingredientToFind);
            }else if (command.equals("stop")){
                break;
            }
        }   
    }
}