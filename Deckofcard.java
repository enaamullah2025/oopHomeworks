
package deckofcard;


public class Deckofcard {


    public static void main(String[] args) {
        int[] deck=new int[52];
        String[] suit={"Spades","Heart","Diamonds","clubs"};
        String[] rank={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","king"};
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        for(int i=0;i<deck.length;i++){
            int index=(int)(Math.random()*deck.length);
            int temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        }
        for(int i=0;i<4;i++){
            String S=suit[deck[i]/13];
            String R=rank[deck[i]%13];
            System.out.println("Card number "+deck[i]+":"+R+" of "+S);
        }
    }
    
}
