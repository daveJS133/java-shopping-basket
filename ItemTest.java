import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest{


  Item item;

  @Before
  public void before(){
    item = new Item("Bread");
  }

  @Test
  public void hasId(){
    assertNotNull(item.getId(), item.getId());
  }


  @Test
  public void hasProduct(){
    assertEquals("Bread", item.getProduct());
  }






}
