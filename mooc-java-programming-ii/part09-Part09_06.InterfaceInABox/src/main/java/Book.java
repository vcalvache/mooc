public class Book implements Packable {
    private String author;
    private String bookTitle;
    private double weight;

    public Book(String author, String bookTitle, double weight){
        this.author = author;
        this.bookTitle = bookTitle;
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return author +": " + bookTitle;
    }
    
}
