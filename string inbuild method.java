// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the name ");
        String name =x.nextLine();
        
        char str=name.charAt(0);
        System.out.println(str);
        
        int str1=name.codePointAt(0);
        System.out.println(str1);
        
        int str2=name.codePointBefore(1);
        System.out.println(str2);
        
        
    }
}
