// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data1= new Scanner(System.in);
        int i;
        System.out.println("enter the number ");
        i=data1.nextInt();
        if (i%2==0 && i%i==0){
           System.out.println("it is not a prime number"); 
        }
        else{
            System.out.println("it is a prime number");
        }
    }
}
