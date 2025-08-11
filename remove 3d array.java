import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][][] arr = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}} };

        for (int[][] x: arr){
            for(int[] y:x){
                if ( y[1] == 8 && y[2] ==9) {
                    continue;
                }
                 for (int item : y) {
                    System.out.print(item+"  ");
                }
                System.out.println();
            }
        } 
    }
}
