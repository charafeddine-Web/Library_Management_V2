public class Book {

    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title,String author,int year,String isbn,boolean isBorrowed){
        this.title=title;
        this.author=author;
        this.year=year;
        this.isbn=isbn;
        this.isBorrowed=isBorrowed;
    }

    public String getTitle(){
        return this.title;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public Boolean isBorrowed(){
        return this.isBorrowed;
    }
    public boolean setBorrowed(boolean isBorrowed){
        return this.isBorrowed=isBorrowed;
    }
    public String getAuteur(){
        return this.author;
    }

}
