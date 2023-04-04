public class CD implements Packable{
    private String artist;
    private String albumTitle;
    private int publicationYear;
    private double weight = 0.1;

    public CD(String artist, String albumTitle, int publicationYear){
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.publicationYear = publicationYear;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return artist +": " + albumTitle +" (" + publicationYear + ")";
    }
    
}
