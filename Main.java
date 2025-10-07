
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        // testing code goes here:
         Book a = new Book("The Great Gatsby", 14.99, "F. Scott Fitzgerald", 10191925, "Scribner", 92418996);
         Movie b = new Movie("Inception", 4.99, "Christopher Nolan", 07072010, 148);
         s.addItem(a);
         s.addItem(b);
     }
}
