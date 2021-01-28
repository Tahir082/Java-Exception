
package lab_practice_c;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;



public class MultipleCatchBlock1 {
    public static void main(String[] args) {
   
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        /*try{
            String s=null;
            System.out.println(s.length()); 
        }*/
        /*try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }*/
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
        catch(NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | IOException e){
            System.err.println(e);
        }

    }
}
