import java.util.Scanner;

public class TextUI {
    private Scanner reader;
    private SimpleDictionary dictionary;

    public TextUI(Scanner reader, SimpleDictionary dictionary){
        this.reader =reader;
        this.dictionary = dictionary;
    }

    public void start(){
        
        while (true){
            System.out.print("Command: ");
            String input = this.reader.nextLine();
            if (input.equals("end")){
                end();
                break;
            } else if (input.equals("add")) {
                add();
            } else if (input.equals("search")){
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void end(){
        System.out.println("Bye bye!");
    }

    public void add(){
        System.out.print("Word: ");
        String word = this.reader.nextLine();
        System.out.print("Translation:");
        String translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }

    public void search(){
        System.out.print("To be translated: ");
        String word = this.reader.nextLine();
        if(this.dictionary.translate(word) == null){
            System.out.println("Word " + word +" was not found");
        } else {        
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }
}
