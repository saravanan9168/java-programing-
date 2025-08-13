// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       String a="new world";
       String y="hello saran hello";
       String x="hello|world|java";
       
       System.out.println("hello".matches(x));
       System.out.println("world".matches(x));
       System.out.println("javascript".matches(y));
       System.out.println(y.regionMatches(7,a,4,5));
       
       System.out.println(x.replace('w','p'));
       System.out.println(y.replaceAll("hello","hiii"));
       System.out.println(y.replaceAll("hello","hiii"));
       
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the words");
       String x=sc.nextLine();
       
       String y="[,\\ .\\s]";
       System.out.println(x.replace('e','a'));
       System.out.println(x.replaceAll("hi","hello"));
       
       String[] z=x.split(y);
       for(String s:z){
           System.out.println(s);
       }
       
    }
}
