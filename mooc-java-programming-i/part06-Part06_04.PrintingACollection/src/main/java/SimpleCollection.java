
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString(){

    if (this.elements.isEmpty()){
        return "The collection " + this.name +" is empty.";
    }

    String singleElement = "";

    if (this.elements.size()==1){
        for (String element: elements){
            singleElement = element;
        }
        return "The collection " +this.name + " has " + this.elements.size() + " element:\n" + singleElement;
    } else {
        for (String element: elements){
            singleElement = singleElement + element +"\n";
        }
        return "The collection " +this.name + " has " + this.elements.size() + " elements:\n" + singleElement;
    }
    }
}
