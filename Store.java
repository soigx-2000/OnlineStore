import java.util.LinkedList;
/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or Arraylist or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
public class Store
{
  private double profit;
  LinkedList<ItemForSale> items;
  public Store(){
      profit = 0.0;
      items = new LinkedList<ItemForSale>();
  }
  public void showItems(){
    System.out.println("Items available for sale include:");
      for(ItemForSale item: items){
        System.out.println(item.getName() + ", created by " +
        item.getCreator() +", has a current price of: $" +
        item.getPrice());
      }
    }
  public void addItem(ItemForSale item){
    items.add(item);
  }
  public void sellItem(String itemName){
    for(int i = 0; i < items.size(); i++){
      if(items.get(i).getName().equals(itemName)){
        profit += items.get(i).getPrice();
        items.remove(i);
        System.out.println(itemName + " is now sold");
        return;
      }
    }
  System.out.println( "Exception: Item not found");
  }
    public String creator(String itemName){
    for(ItemForSale item: items){
      if(item.getName().equals(itemName)){
        return item.getCreator();
      }
    }
  return "Exception: Item not found";
  }
  public double getProfit(){
    return profit;
  }
}
