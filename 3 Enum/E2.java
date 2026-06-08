// second example of enum
enum Laptop{
  Macbook(1000) , Hp(1000) , Dell(1000) , Oneplus(1000);
  private int price;
  // default constructor if we want to give default price
  Laptop(){
    this.price = 500;
  }
  private Laptop(int x){
    this.price = x;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  
} 

public class E2 {
  public static void main(){
    Laptop lap = Laptop.Dell;
    System.out.println(lap + " - " +lap.getPrice());
    System.out.println(" - ");
    
    for(Laptop laptop :Laptop.values()){
      int price = laptop.getPrice();
      Laptop name = laptop;
      System.out.println(name + " - " + price);
    }
  }
}
