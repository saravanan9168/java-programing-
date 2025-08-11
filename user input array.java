// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter");
        int row=x.nextInt();
        int col=x.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=x.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
