import org.junit.*;
import static org.junit.Assert.*;

public class BasketTest{

  Item item;
  Basket basket;

  @Before
  public void before(){
    item = new Item("Bread");
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
}