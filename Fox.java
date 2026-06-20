
package Animal;

public class Fox extends Animal implements Hunter{

    @Override
    void eat() {
        System.out.println("the fox is eating");
    }

    @Override
    void drink() {
    System.out.println("the fox is drinking");
    }

    @Override
    void run() {
    System.out.println("the fox is runing");
    }

    @Override
    void breath() {
    System.out.println("the fox is breathing");
    }

    @Override
    public void Hunt() {
        System.out.println("the fox is hunting");
    }
   
    
}
