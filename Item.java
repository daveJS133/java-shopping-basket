import java.util.*;


public class Item{

  private String id;
  private String product;

  public Item(String product){
    this.id = UUID.randomUUID().toString();
    this.product = product;
    
  }

  public String getProduct(){
    return product;
  }

  public String getId(){
    return id;
  }
}