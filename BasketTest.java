import org.junit.*;
import static org.junit.Assert.*;

public class BasketTest{

  Item item;
  Item item2;
  Basket basket;

  @Before
  public void before(){
    item = new Item("Bread");
    item2 = new Item("Milk");
    basket = new Basket();
  }

  @Test
  public void canCountItems(){
    assertEquals(0, basket.getBasket().size());
  }

  @Test
  public void canAddItem(){
    basket.addItem(item);
    assertEquals(1, basket.getBasket().size());
  }

  @Test
  public void canRemoveItem(){
    basket.addItem(item);
    basket.removeItem(item.getId());
    assertEquals(0, basket.getBasket().size());
  }

  @Test
  public void canRemoveAll(){
    basket.addItem(item);
    basket.addItem(item2);
    basket.removeAll();
    assertEquals(0, basket.getSize());
  }


}