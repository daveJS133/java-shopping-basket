import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest{


  Item item;

  @Before
  public void before(){
    item = new Item(Product.MOUSE);
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
    assertEquals(10.00, item.getProduct().getPrice());
  }
}
