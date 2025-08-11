// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[][][] arr={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        for(int[][] x:arr){
            for(int[] y:x){
                for(int item:y){
                    System.out.print(item+" ");
                }
                System.out.println();
            }
        }
    }
}
