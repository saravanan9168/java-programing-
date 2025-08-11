import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ar={6,7,8,9};
        int[] sub=new int[arr.length+ar.length];
        for(int i=0;i<arr.length;i++){
            sub[i]=arr[i];
        }
        for(int j=0;j<ar.length;j++){
            sub[arr.length+j]=ar[j];
        }
        for(int x:sub){
                System.out.println(x);
            }
    }
}
