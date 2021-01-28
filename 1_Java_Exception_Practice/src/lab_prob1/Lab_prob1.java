
package lab_prob1;

import java.lang.NumberFormatException;
import java.util.Scanner;

class Calculator{
    int a;
    int b;

    public Calculator(int a, int b) {
        
            this.a = a;
            this.b = b;
       
    }
    
    public void add(){
        int ans;
        try{
            if(this.a<0 || this.b < 0){
                throw new ArithmeticException();
            }
            else{
                ans= this.a+this.b;
                System.out.println("Addition Result: "+ ans); 
            }
            
        }
        catch(ArithmeticException e){
            System.out.println ("You have typed a negative integer. Not Accepted!! Try Again.");
        }
    }
    
    public void subtract(){
        int ans;
        try{
            if(this.a<0 || this.b < 0){
                throw new ArithmeticException();
            }
            else{
                ans= this.a-this.b;
                System.out.println("Subtraction Result: "+ ans); 
            }
            
        }
        catch(ArithmeticException e){
            System.out.println ("You have typed a negative integer. Not Accepted!! Try Again.");
        }
    }
    
    public void multiply(){
        int ans;
        try{
            if(this.a==0 || this.b==0){
                throw new ArithmeticException();
            }
            else
            {
                ans= this.a*this.b;
                System.out.println("Multiplication Result: "+ ans);
            }
        }
        catch(ArithmeticException e){
            System.out.println ("You are trying to multiply a number by zero. Not acceptable Try Again.");
        }
        
    }
    
    public void division(){
        double ans;
        try{
            ans= this.a/this.b;
            System.out.println("Division Result: "+ ans);
        }
        catch(ArithmeticException e){
            System.out.println ("You are trying to divide a number by zero. Math Error!! Try Again.");
        }
    }
}
public class Lab_prob1 {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Press `Enter` to start");
        
        while(true){
            int a = 0, b= 0;
            boolean cont=true;
            do{
                try{   
                    in.nextLine();
                    System.out.println("Type a number: ");
                    a= Integer.parseInt(in.nextLine());
                    System.out.println("Type another number: ");
                    b= Integer.parseInt(in.nextLine()); 
                    cont=false;
                }
                catch(NumberFormatException e){
                    System.out.println("Wrong Input!!! Type Integer Values Only...");
                }
            }
            while(cont);
            
            System.out.println("Press 1: Addition");
            System.out.println("Press 2: Subtraction");
            System.out.println("Press 3: Multiplication");
            System.out.println("Press 4: Division");
            System.out.println("Enter Choice: ");
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    Calculator ob1= new Calculator(a,b);
                    ob1.add();
                    break;
                case 2:
                    Calculator ob2= new Calculator(a,b);
                    ob2.subtract();
                    break;
                case 3:
                    Calculator ob3= new Calculator(a,b);
                    ob3.multiply();
                    break;
                case 4:
                    Calculator ob4= new Calculator(a,b);
                    ob4.division();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong Input!!! Try Again!!");
            } 
            
        }
        
    }
    
}
