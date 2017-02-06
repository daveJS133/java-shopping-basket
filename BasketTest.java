import org.junit.*;
import static org.junit.Assert.*;

public class BasketTest{

Customer customer;
Basket basket;
  Item item;
  Item item2;

  @Before
  public void before(){
    customer = new Customer("Dave", false);
    basket = new Basket(customer);
    item = new Item(Product.MOUSE);
    item2 = new Item(Product.KEYBOARD);
  }

  @Test
  public void canCountItems(){
    assertEquals(0, basket.getBasket().size());
  }

  @Test
  public void canAddItem(){
    basket.addItem(item, customer);
    assertEquals(1, basket.getBasket().size());
  }

  @Test
  public void canRemoveItem(){
    basket.addItem(item, customer);
    basket.removeItem(item.getId(), customer);
    assertEquals(0, basket.getBasket().size());
  }

  @Test
  public void canRemoveAll(){
    basket.addItem(item, customer);
    basket.addItem(item2, customer);
    basket.removeAll();
    assertEquals(0, basket.getSize());
  }

  // @Test
  // public void canFindGrossPrice(){
  //   basket.addItem(item, customer);
  //   basket.addItem(item2, customer);
  //   assertEquals(25.00, basket.findGrossPrice(), 0.01);
  // }

  @Test
  public void canBogof(){
    basket.addItem(item2, customer);
    assertEquals(2, basket.getSize());
    assertEquals(15.00, basket.findNetPrice(customer), 0.01);
  }

  @Test
  public void testNoBogof(){
    basket.addItem(item, customer);
    assertEquals(1, basket.getSize());
    assertEquals(10.00, basket.findNetPrice(customer), 0.01);
  }



}