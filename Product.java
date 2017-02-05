public enum Product{   
  MOUSE(10.00), KEYBOARD(15.00), MONITOR(29.99);   

  private double price;  

  private Product(double price){  
    this.price = price;  
  }  

  public double getPrice(){
    return this.price;
  }
}  