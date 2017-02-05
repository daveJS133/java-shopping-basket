public enum Product{   
  MOUSE(10.00, false), KEYBOARD(15.00, true), MONITOR(29.99, false);   

  private double price;  
  private Boolean bogof;

  private Product(double price, Boolean bogof){  
    this.price = price;  
    this.bogof = bogof;
  }  

  public double getPrice(){
    return this.price;
  }

  public Boolean getBogof(){
    return this.bogof;
  }

}  