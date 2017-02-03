import org.java.util.*;



public class Basket{
  private HashMap<String, Item> basketHash
  private String customerName;
  private int customerId;
  private int basketId;

  public Basket(customerId, basketId){
    this.basketHash = new HashMap<String, Item>();
    this.name = Customer.getName(customerId);
  }

  private void addItem(product){
    Item item = new Item(Item.generateId, product);
    basketHash.put(item.getId(), item);
  }

  private void removeItem(id){
    basketHash.remove(id);
  }



}



