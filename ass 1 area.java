
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        int c;
        System.out.println("enter 1 for circle ");
        System.out.println("enter 2 for square  ");
        System.out.println("enter 3 for rectangle ");
        System.out.println("enter 4 for triangle ");
        System.out.println("enter the shape  number");
        c=data.nextInt();
        
        switch(c)
        {
            case 1:
                Scanner data1= new Scanner(System.in);
                int r;
                System.out.println("enter radius of the circle  ");
                r=data1.nextInt();
                double area1=Math.PI * Math.pow(r, 2);
                System.out.println("area of the circle :"+area1);
                break;
            case 2:
                Scanner data2= new Scanner(System.in);
                int s;
                System.out.println("enter sides of the square  :");
                s=data2.nextInt();
                double area2=s*s;
                System.out.println("area of the square :"+area2);
                break;
            case 3:
                Scanner data3= new Scanner(System.in);
                double l;
                double b; 
                System.out.println("enter the length :");
                l=data3.nextInt();
                System.out.println("enter the breadth :");
                b=data3.nextInt();
                double area3=l*b;
                System.out.println("area of the rectangle :"+area3);
                break;
            case 4:
               Scanner data4= new Scanner(System.in);
                int ba;
                int h;
                System.out.println("enter tha base : ");
                ba=data4.nextInt();
                System.out.println("enter tha height : ");
                h=data4.nextInt();
                double area4=0.5*ba*h;
                System.out.println("area of the triangle :"+area4);
                break;
            default:
            System.out.println("invalid data");
            
        
            
            
            
        }
       
    }
}

