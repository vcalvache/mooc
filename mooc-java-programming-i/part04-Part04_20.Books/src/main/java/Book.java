public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String bookTitle, int totalPages, int yearPublished){
        this.title = bookTitle;
        this.pages = totalPages;
        this.year = yearPublished;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public int getYear(){
        return this.year;
    }
    @Override
    public String toString(){
        return this.title+", " + this.pages+ " pages, " + this.year;
    }
    
}
