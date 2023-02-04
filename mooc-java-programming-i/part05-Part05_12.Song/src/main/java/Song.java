
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object comparedObject){
        if (this == comparedObject){
            return true;
        }

        if (!(comparedObject instanceof Song)){
            return false;
        }

        Song toCompare = (Song) comparedObject;

        if (this.artist.equals(toCompare.artist) && this.name.equals(toCompare.name)
            && this.durationInSeconds == toCompare.durationInSeconds){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
