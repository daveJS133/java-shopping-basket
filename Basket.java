import java.util.*;


public class Basket{

  private HashMap<String, Item> basketHash;

  public Basket(){ 

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

}