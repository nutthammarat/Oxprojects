/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nutth
 */
public class LoginTest {
    
    @Test
    public void checkUserExisthTrue(){
            Login login = new Login();
            login.usernamefield.setText("Nutty123");
            login.passwordfield.setText("123456");
            assertTrue(login.logindb.checkUserExisth(login.usernamefield.getText()));
            
    }
    public void checkUserExisthFalse(){
            Login login = new Login();
            login.usernamefield.setText("Nutty1234");
            login.passwordfield.setText("123456");
            assertFalse(login.logindb.checkUserExisth(login.usernamefield.getText()));
            
    }
    
    
    
}
