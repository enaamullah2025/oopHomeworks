
package classandobject;


public class Classandobject {

    
    public static void main(String[] args) {
       Mobile.showinformatiin();
       Mobile m1 =new Mobile();
       m1.setPrice(15000);
        System.out.println(m1.getprice(68.20));
    }
    
}
class Mobile{
    String colore;
    String model;
    static String compony;
    int maxspeed;
    int tire;
    private int price;
    class so{
          String version;
          String name;
          void copy(){
              
          }
    }
     public double getPrice(double rate){
          return price/rate;
      }
     public int getprice(){
         return price;
     }
     public void setPrice(int price){
         
          if(price<=100000 && price>=10000){
               this.price=price;
          }
          else{
              System.out.println("invalide price");
          }
      }
    void on(){
        System.out.println("the motarstcle started:");
    }
    void off(){
        System.out.println("the motarsycle had been turned off");
    }
    static void showinformatiin(){
        System.out.println("some information about mobile");
    }
}