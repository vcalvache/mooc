
public class Main {

    public static void main(String[] args) {
        /*
        Create a class named Whistle. Add the variable private String sound to the class.
        After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound.

        Then create the method public void sound() that prints the whistle's sound.

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
        Sample output
        Kvaak
        Peef
        Kvaak
         */

        // This is just an empty main method you can use to test
        // the Whistle class. Try for example:

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
