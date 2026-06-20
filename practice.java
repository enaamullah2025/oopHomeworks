
package Animal;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class practice {
  public static void main(String[] args){
     Frame f=new Frame("my Aplication");
     f.setVisible(true);
     f.setSize(400,300);
     f.setLocation(300, 200);
     Button b=new Button("close");
     f.add(b);
     FlowLayout f1=new FlowLayout();
     f.setLayout(f1);
     
  }  
}
