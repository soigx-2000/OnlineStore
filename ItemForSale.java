public class ItemForSale
{
    protected String name;
    protected double price;
    protected String creator;
    protected Date BeginingSaleDate;//month, day, year (mmddyyyy)
    public ItemForSale(){}//default constructor
    public ItemForSale(String name, double price, String creator,
    int mm_dd_yyyy){
        this.name = name;
        this.price = price;
        this.creator = creator;
        this.BeginingSaleDate = new Date(mm_dd_yyyy);
    }
    // here are the getters
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getCreator(){
        return creator;
    }
    public Date getBeginingSaleDate(){
        return BeginingSaleDate;
    }
}
