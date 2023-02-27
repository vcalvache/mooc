import javax.xml.transform.Source;

public class Main {

    public static void main(String[] args) {
        // test your program here!

        SimpleDate firstDate = new SimpleDate(29, 11, 2000);

        System.out.println(firstDate);
        firstDate.advance();
        firstDate.advance();
        System.out.println(firstDate);
        for (int i = 0; i < 31;i++){
            firstDate.advance();
        }
        
        
        System.out.println(firstDate);
        firstDate.advance(365);
        System.out.println(firstDate);
    }
}