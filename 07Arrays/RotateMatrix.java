import java.util.*;

class Main {
    public static void main(String[] args){
        int [][] q = new int [][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][] mat = rotateMatrix(q,q.length);
        for(int [] i : mat){
            System.out.println(Arrays.toString(i));
        }
    }
    
    public static int[][] rotateMatrix(int[][] arr,int n){
        int [][] q = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                q[j][n-1-i]=arr[i][j];
            }
        }
     return q;
     }
     
     
}
     
    
