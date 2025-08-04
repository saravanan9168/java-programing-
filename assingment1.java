import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data3= new Scanner(System.in);
        String c;
        System.out.println("enter the name");
        c=data3.nextLine();
        
        Scanner data4= new Scanner(System.in);
        String d;
        System.out.println("enter the father name ");
        d=data4.nextLine();
        
        Scanner data5= new Scanner(System.in);
        int e;
        System.out.println("enter the your age ");
        e=data5.nextInt();
        
        Scanner data6= new Scanner(System.in);
        double f;
        System.out.println("enter the weight");
        f=data6.nextDouble();
        
        Scanner data1= new Scanner(System.in);
        boolean b;
        System.out.println("if you are male");
        b=data1.nextBoolean();
        
        Scanner data2= new Scanner(System.in);
        String op;
        System.out.println("enter the education");
        op=data2.nextLine();
        
        Scanner data7= new Scanner(System.in);
        Short g;
        System.out.println("enter the spr number");
        g=data7.nextShort();
        
        Scanner data8= new Scanner(System.in);
        String s;
        System.out.println("enter the gmail");
        s=data8.nextLine();
        Scanner data9= new Scanner(System.in);
        int p;
        System.out.println("create a password ");
        p=data9.nextInt();
        
        if (s.equals("admin@gmail.com") &&  p ==123){
            System.out.println("login successfull ");
        }
        else {
            System.out.println("please enter password or username!");
        }
       
    }
}




