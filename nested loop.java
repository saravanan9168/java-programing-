// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data1= new Scanner(System.in);
        int i;
        System.out.println("enter the number i");
        i=data1.nextInt();
        Scanner data2= new Scanner(System.in);
        int c;
        System.out.println("enter the number j");
        c=data2.nextInt();
        
        for( i=1;i<=2;i++){
            System.out.println("outerloop :"+i);
            for( c=1;c<=3;c++){
                System.out.println("innerloop :"+ i*c);
            }
            System.out.println("innerloop :"+ i*c);
        }
    }
}
