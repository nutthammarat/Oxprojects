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
public class registerTest {
    
    public registerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void checkpwdandcfpwd(){
        Register regis = new Register();
        regis.pwdfield.setText("123456");
        regis.cfpwdfield.setText("123456");
        if(regis.checkpwdandcfpwd()==true)
            System.out.println("Password correct");
        else
            System.out.println("Password isn't valid");
    }
    @Test
    public void getnickname(){
        Register regis = new Register();
        regis.nicknamefield.setText("Nutty");
        System.out.println(regis.getnickname());
    }

    
}
