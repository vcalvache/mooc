import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipesBook;

    public Manager(){
        this.ingredients = new ArrayList<>();
        this.recipesBook = new ArrayList<>();
    }

    public void readRecipes(String fileToFind){

        try (Scanner file = new Scanner(Paths.get(fileToFind))){
            while (file.hasNextLine()){
                String recipeName = file.nextLine();
                int cookingTime = Integer.valueOf(file.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipesBook.add(recipe);

                while(file.hasNextLine()){
                    String ingredient = file.nextLine();
                    if (ingredient.isEmpty()){
                        break;
                    } else {
                    recipe.addIngredients(ingredient);
                    }
                }
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listRecipes(){
        System.out.println("Recipes:");
        for (Recipe recipe: recipesBook){
            System.out.println(recipe);
        }
    }

    public void findRecipeByWord(String word){
        System.out.println("Recipes:");
        for (Recipe recipe: recipesBook){
            if (recipe.getRecipeName().contains(word)){
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void findByMaxCookingTime(int maxCookingTime){
        System.out.println("Recipes:");
        for (Recipe recipe: recipesBook){
            if (recipe.getCookingTime() <= maxCookingTime){
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void findByIngredient(String ingredientToFind){
        System.out.println("Recipes:");
        for (Recipe recipe: recipesBook){
            if (recipe.getIngredients().contains(ingredientToFind)){
                System.out.println(recipe);
            }
        }
        System.out.println();
    }
}