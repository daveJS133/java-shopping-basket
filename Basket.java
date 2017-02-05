import java.util.*;


public class Basket{

  private HashMap<String, Item> basketHash;
  private double grossPrice;

  public Basket(){ 
    this.grossPrice = 0.00;
    this.basketHash = new HashMap<String, Item>();
  }

  public void addItem(Item item){
    basketHash.put(item.getId(), item);
  }

  public HashMap<String, Item> getBasket(){
    return basketHash;
  }

  public int getSize(){
    return this.getBasket().size();
  }

  public void removeItem(String id){
    basketHash.remove(id);
  }  

  public void removeAll(){
    basketHash.clear();
  }

  public double findGrossPrice(){
    for (Item item : basketHash.values()) {
      double price = item.getProduct().getPrice();
        grossPrice += price;
    }
    return grossPrice;
  }

}