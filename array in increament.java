// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main { 
    public static void main(String[] args) {
        int x=3;
        int y=3;
        int[][] arr=new int[x][y];
        int num=1;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=num;
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
