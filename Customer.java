import java.util.*;

public class Customer{
  private String name;
  private Basket basket;

  private Boolean hasLoyalty;

  public Customer(String name, Boolean hasLoyalty){
    this.name = name;
    // this.basket = new Basket(this);

    this.hasLoyalty = hasLoyalty;
  }

  public Boolean getLoyalty(){
    return hasLoyalty;
  }

}

