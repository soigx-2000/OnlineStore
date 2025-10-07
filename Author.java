public class Author
{
    private String name;
    private Date birthDate;//month, day, years, mmddyyyy
    public Author(String name, int mm_dd_yyyy_date){
        this.name = name;
        this.birthDate = new Date(mm_dd_yyyy_date) ;
    }
    public String getName(){
        return name;
    }
    public Date getBirthDate(){
        return birthDate;
    }
}
