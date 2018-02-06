import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class ButtonTest {
   public static void main(String [] args){
     //Custom button text
      Object[] options = {"+", "-", "*", "/", "%"};
      ImageIcon icon = new ImageIcon("math.jpg");
      int n = JOptionPane.showOptionDialog(null,
         "Which operator? ",
         "Integer Math",
         JOptionPane.DEFAULT_OPTION,
         JOptionPane.PLAIN_MESSAGE,
         icon,
         options,
         options[0]);
    
    
      System.out.println("n is " + n);
   }//end main
} //end class
