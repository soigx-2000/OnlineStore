public class Movie extends ItemForSale
{
    private int duration;//in minutes
    public Movie(String name, double price, String creator,
    int mm_dd_yyyy_sell, int duration){
        super(name, price, creator, mm_dd_yyyy_sell);
        this.duration = duration;
    } 
    public int getDuration(){
        return duration;
    }
}
