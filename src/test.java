
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nutth
 */
public class test extends JFrame{
    public test() {
        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Confirm Dialog in Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);
    }
    public static void main(String[] args) {
        Object[] options = {"Login"};
        //ImageIcon icon = new ImageIcon(test.class.getResource("/metal-info.png"));
        JFrame frame = new JFrame("src/Image/metal-info.png");
        ImageIcon icon1 = new ImageIcon("D:\\Netbean\\OXProjects\\src\\Image\\metal-info.png");
        ImageIcon icon = new ImageIcon("src/Image/metal-info.png");
        JPanel panel = new JPanel();
        String a = "nut";
        /*int i = JOptionPane.showConfirmDialog(null, 
                "Click ok if you are ok Be ok! " + a,"login" ,JOptionPane.DEFAULT_OPTION);*/
        /*int j = JOptionPane.showOptionDialog(new OptionDialogInFrame(), "Welcome, " + a,"Register Success",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);*/
        int input = JOptionPane.showConfirmDialog(new test(), 
                "I appear as part of the frame!!", "Customized Dialog", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
        
        
    }
    
}
