
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object toCompare){

        if (this == toCompare){
            return true;
        }

        if (!(toCompare instanceof Book)){
            return false;
        }

        Book bookToCompare = (Book) toCompare;

        if (this.name.equals(bookToCompare.name)
            && this.publicationYear == bookToCompare.publicationYear){
            return true;
        }

        return false;
    }

}
