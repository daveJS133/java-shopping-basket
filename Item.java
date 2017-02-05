import java.util.*;


public class Item{

  private String id;
  private Product product;

  public Item(Product product){
    this.id = UUID.randomUUID().toString();
    this.product = product;
    
  }

  public Product getProduct(){
    return product;
  }

  public String getId(){
    return id;
  }
}