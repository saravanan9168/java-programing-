// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the name ");
        String name =x.nextLine();
        System.out.println("enter the name 2 ");
        String name1 =x.nextLine();
        
        char str=name.charAt(0);
        System.out.println(str);
        
        int str1=name.codePointAt(0);
        System.out.println(str1);
        
        int str2=name.codePointBefore(1);
        System.out.println(str2);

        int str3=name.codePointCount(0,5);
        System.out.println(str3);
        
        int str4=name.compareTo(name1);
        System.out.println(str4);

        int str5=name.compareToIgnoreCase(name1);
        System.out.println(str5);
        
        String str6=name.concat(name1);
        System.out.println(str6);
        

        
        
    }
}
