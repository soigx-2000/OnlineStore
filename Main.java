
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();// chat GPT wrote these tests
        s.addItem(new Book("The Great Gatsby", 10.99, "F. Scott Fitzgerald", "01/01/2020", "Scribner", "09/24/1896"));
        s.addItem(new Movie("Inception", 14.99, "Christopher Nolan", "02/15/2020", 148));
        s.showItems();
        System.out.println("Creator of The Great Gatsby: " + s.creator("The Great Gatsby"));
        System.out.println("Creator of Inception: " + s.creator("Inception"));
        s.sellItem("The Great Gatsby");
        System.out.println("Total profit: $" + s.getProfit());
     }
}
