
package lab_prob2;

import java.util.Scanner;

class MyException extends Exception{

    MyException(String str){
        super(str);
    }
    
}

class Product{
    int weight;

    Product(int weight) {
        this.weight = weight;
    }
    
    public void productCheck(int weight){
        try{
            if(weight<100){
                MyException me= new MyException("Invalid Product!!!");
                throw me;
            }
            else{
                System.out.println("Good Input!! Product weight= "+ weight);
            }
        }
        catch(MyException e){
            System.out.println(e);
            System.out.println("Cause: Weight Should be more than 100");
        }
    }
}
public class Lab_prob2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while(true){
            System.out.println("Enter weight of a product: ");
            int weight= in.nextInt();
            Product ob= new Product(weight);
            ob.productCheck(weight);
        }
    }
    
}
