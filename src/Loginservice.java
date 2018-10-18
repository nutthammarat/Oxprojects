
import javax.swing.JOptionPane;


public class Loginservice {
    public static boolean checkUserandPasslegnth(String username,String password){
        if(username.length()>3&&password.length()>3)
            return true;
        return false;
    }
   public static boolean checkUserexists(String username){
       if(LoginDB.checkUserExisth(username))
           return true;
       return false;
   }
   public static boolean checkPasscorrect(String username,String password){
        if(LoginDB.checkPassCorrect(username, password))
            return true;
        return false;
    }
   public static void gotoLobby(String username){
       String nickname = LoginDB.getNickname(username);
       JOptionPane.showMessageDialog(null, "Welcome " + nickname);
       Lobby lobby = new Lobby();
       lobby.setVisible(true);
       
   }
   
    
}
