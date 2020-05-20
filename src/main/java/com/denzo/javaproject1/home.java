
package com.denzo.javaproject1;
/**
 *
 * @author admin
 */
import java.util.Date;  
import java.text.SimpleDateFormat;  


public class home{

    
    public static void main(String[] args){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        System.out.println(formatter.format(date));
            user userObject = new user();
            userObject.addition();

    }
}
