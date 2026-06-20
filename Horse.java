
package Animal;

public class Horse extends Animal{
    @Override
    void eat(){
        System.out.println("hte horse is eating");
    }
    @Override
    void drink(){
        System.out.println("the horse is drinking");
    }
    @Override
    void breath(){
        System.out.println("the horse is breating ");
    }
    @Override
    void run(){
        System.out.println("the horse is runing");
    }
   void ride(){
       System.out.println("the man is riding the Horse");
   } 
}
