
public class Book extends ItemForSale
{
    private Author author;
    private String publisher;    
    public Book(String name, double price, String creator,
    String mm_dd_yyyy_sell, String publisher, String mm_dd_yyyy_date){
        super(name, price, creator, mm_dd_yyyy_sell);
        this.publisher = publisher;
        this.author = new Author(creator, mm_dd_yyyy_date);
        // assuming creator is the autthor's name
    }
    public String getPublisher(){
        return publisher;
    }   
    public Author getAuthor(){
        return author;
    }
}
