
package ch12interfaceedible;

public class Ch12interfaceEdible {

   
    public static void main(String[] args) {
        System.out.println(new Chicken().howtoeat());
        System.out.println(new Apple().howtoeat());     
    }
    
}
interface Edible{
    String howtoeat();
}
class Chicken implements Edible{
    public String howtoeat(){
        return "مرغ سوخاری";
    }
}
class Apple implements Edible{
    public String howtoeat(){
        return "سیب ";
    }
}