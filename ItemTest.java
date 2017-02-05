import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest{

  Item item;
  Item item2;

  @Before
  public void before(){
    item = new Item(Product.MOUSE);
    item2 = new Item(Product.KEYBOARD);
  }

  @Test
  public void hasId(){
    assertNotNull(item.getId(), item.getId());
  }

  @Test
  public void hasProduct(){
    assertEquals(Product.MOUSE, item.getProduct());
  }

  @Test
  public void canGetPrice(){
    assertEquals(10.00, item.getProduct().getPrice(), 0.01);
  }

  @Test
  public void canGetBogof1(){
    assertEquals(false, item.getProduct().getBogof());
  }

  @Test
  public void canGetBogof2(){
    assertEquals(true, item2.getProduct().getBogof());
  }


}
