// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data1= new Scanner(System.in);
        short i;
        System.out.println("enter the number year");
        i=data1.nextShort();
        if((i%4==0 && i%100==0)||(i%400==0)){
            System.out.println("it is a leap year ");
        }
        else{
            System.out.println("it is not a leap year");
        }
        
       
    }
}
