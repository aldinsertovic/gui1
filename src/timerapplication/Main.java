
package timerapplication;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
NewJFrame frame = new NewJFrame();
int opcije = JOptionPane.showOptionDialog(null, "Choose Option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String [] {"Settings", "Close"}, null);
switch(opcije)
{
    case JOptionPane.YES_OPTION:
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        break;
    case JOptionPane.NO_OPTION:
        System.exit(0);
        break;
}
    
    }
    
}
