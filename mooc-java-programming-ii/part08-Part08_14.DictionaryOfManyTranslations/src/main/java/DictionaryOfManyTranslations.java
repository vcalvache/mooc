import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }

    public void getDictionary(String word){
        System.out.println(this.dictionary.get(word));
    }

    public void add(String word, String translation){

        if (!(this.dictionary.containsKey(word))){
            ArrayList<String> translationList = new ArrayList<>();
            translationList.add(translation);
            this.dictionary.put(word, translationList);
        } else if(this.dictionary.containsKey(word)){
            dictionary.get(word).add(translation);
        }

    }

    public ArrayList<String> translate(String word){
        if (this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }

        return new ArrayList<String>();
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }
}
    
