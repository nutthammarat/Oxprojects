import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Register extends javax.swing.JFrame {
    
    /**
     * Creates new form Register
     */
    Object[] options = {"Login"};
    JFrame frames = new JFrame("src/Image/metal-info.png");
    
    public Register() {
        initComponents();
        usernamefield.setText("");
        pwdfield.setText("");
        cfpwdfield.setText("");
        nicknamefield.setText("");
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernamefield = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nicknamefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwdfield = new javax.swing.JPasswordField();
        backbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        registerbtn = new javax.swing.JButton();
        cfpwdfield = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                                                                      Oxgame");
        setMinimumSize(new java.awt.Dimension(605, 428));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 190, 30));

        clearbtn.setBackground(new java.awt.Color(204, 204, 204));
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 80, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ConfirmPassword :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Nickname :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("R E G I S T E R");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        nicknamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(nicknamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 190, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Username   : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));
        getContentPane().add(pwdfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 190, 30));

        backbtn.setBackground(new java.awt.Color(0, 0, 0));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Password    : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        registerbtn.setBackground(new java.awt.Color(204, 204, 204));
        registerbtn.setText("Register");
        registerbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registerbtnMouseMoved(evt);
            }
        });
        registerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerbtnMousePressed(evt);
            }
        });
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 90, 30));
        getContentPane().add(cfpwdfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 190, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Netbean\\OXProjects\\src\\Image\\bg.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        usernamefield.setText("");
        pwdfield.setText("");
        cfpwdfield.setText("");
        nicknamefield.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void nicknamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknamefieldActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();

    }//GEN-LAST:event_backbtnActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        RegisterDB regis = new RegisterDB();
        if(checkFieldnotnull() == false){
            if(regis.checkUserExists(usernamefield.getText())){
                JOptionPane.showMessageDialog(null, "Username is exists please fill again","Register Error",JOptionPane.ERROR_MESSAGE);
                usernamefield.setText("");
            }
            if(nicknamefield.getText().length()<3||checkpwdandcfpwd()==false){
                JOptionPane.showMessageDialog(null, "Please set Nickname morethan 3 charactor "
                        + "and check Password is correct andd fill morethan 6 number!","Register Error",JOptionPane.ERROR_MESSAGE);
                nicknamefield.setText("");
                cfpwdfield.setText("");
            }
            else if(!regis.checkUserExists(usernamefield.getText())){
                regis.addUser(usernamefield.getText(), pwdfield.getText(), nicknamefield.getText());
                int input = JOptionPane.showOptionDialog(frames, "Welcome, " + getnickname(),"Register Success",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if(input == 0){
                    Login log = new Login();
                    visible();
                    log.setVisible(true);
                }

            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please fill all of information");
        }

    }//GEN-LAST:event_registerbtnActionPerformed

    private void registerbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtnMouseMoved
        
    }//GEN-LAST:event_registerbtnMouseMoved

    private void registerbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtnMousePressed
        
    }//GEN-LAST:event_registerbtnMousePressed
    boolean checkFieldnotnull(){
        boolean flag = false;
        if(usernamefield.getText().equals("")|| pwdfield.getPassword().equals("")
           || nicknamefield.getText().equals("")||cfpwdfield.getPassword().equals("")){
            flag = true;
            return flag;
        } else
        return flag;
    }
    
    boolean checkpwdandcfpwd(){
        if(pwdfield.getText().equals(cfpwdfield.getText())&&pwdfield.getText().length()>=6)
            return true;
        
        return false;
    }
    public String tostring(){
        return pwdfield.getText();
    } 
    String getnickname(){
        String a = nicknamefield.getText();
        return a;
    }
    void visible(){
        dispose();
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    public javax.swing.JPasswordField cfpwdfield;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField nicknamefield;
    public javax.swing.JPasswordField pwdfield;
    private javax.swing.JButton registerbtn;
    public javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
