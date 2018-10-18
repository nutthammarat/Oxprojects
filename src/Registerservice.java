
public class Registerservice {
    public static boolean checkFieldnotnull(String username,String password,String nickname,String confirmpassword){
        boolean flag = false;
        if(username.equals("")|| password.equals("")|| nickname.equals("")||confirmpassword.equals("")){
            flag = true;
            return flag;//true
        }
        return flag;//false
    }
    public static boolean checkUserExist(String username){
        return RegisterDB.checkUserExists(username);
    }
    public static void addUsers(String username,String password,String nickname){
         RegisterDB.addUser(username, password, nickname);
    }
    public static boolean checkNickname(String nickname){
        if(nickname.length()<3)
            return true;
        return false;
    }
    public static boolean checkPass(String password,String confirmpassword){
        if(password.equals(confirmpassword)||password.length()<6)
            return true;
        return false;
    }
    public static String getnickname(String nickname){
        String a = nickname;
        return a;
    }
}
