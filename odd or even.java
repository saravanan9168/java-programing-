import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=data.nextInt();
        if (num%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
