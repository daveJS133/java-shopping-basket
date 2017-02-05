import java.util.*;


public class Basket{

  private HashMap<String, Item> basketHash;
  private double grossPrice;
  private double finalPrice;

  public Basket(Customer customer){ 
    this.grossPrice = 0.00;
    this.finalPrice = 0.00;
    this.basketHash = new HashMap<String, Item>();
  }

  public void addItem(Item item, Customer customer){
    basketHash.put(item.getId(), item);
    findGrossPrice(item, customer);
    if (item.getProduct().getBogof()){
      addFreeItem(item);
    }
  }

  public void addFreeItem(Item item){
    Item freeItem = new Item(item.getProduct());
    basketHash.put(freeItem.getId(), freeItem);
  }

  public HashMap<String, Item> getBasket(){
    return basketHash;
  }

  public int getSize(){
    return this.getBasket().size();
  }

  public void removeItem(String id, Customer customer){
    Item item = basketHash.get(id);
    grossPrice -= item.getProduct().getPrice();
    basketHash.remove(id);
    findNetPrice(customer);
  }  

  public void removeAll(){
    basketHash.clear();
    grossPrice = 0.00;
    finalPrice = 0.00;
  }

  public double findGrossPrice(Item item, Customer customer){
    double price = item.getProduct().getPrice();
      grossPrice += price;
      findNetPrice(customer);
    return grossPrice;
  }

  public double findNetPrice(Customer customer){
    finalPrice = grossPrice;
    if (finalPrice > 20.00){
      finalPrice -= (finalPrice * (15/100));
    }
    if (customer.getLoyalty()){
      finalPrice -= (finalPrice * (2/100));
    }
    return finalPrice;
  }
}