import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTime ){
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getRecipeName(){
        return recipeName;
    }

    public int getCookingTime(){
        return cookingTime;
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString(){
        return recipeName +", cooking time: " + cookingTime;
    } 
}