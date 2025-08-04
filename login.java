import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        String a;
        System.out.println("enter the username");
        a=data.nextLine();
        Scanner data1= new Scanner(System.in);
        int b;
        System.out.println("enter password ");
        b=data1.nextInt();
        
        if (a=="admin" &&  b ==123){
            System.out.println("login successfull ");
        }
        else {
            System.out.println("Invalid password or username!");
        }
       
       
    }
}
