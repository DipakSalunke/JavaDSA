class Main{
    public static void main(String[] args){
        System.out.println(permutation(new int [] {2,7,11,15},new int [] {11,2,15}));
        System.out.println(permutation(new int [] {2,7,11,15},new int [] {11,7,2,15}));
    }
    
    public static boolean permutation(int[] arr1, int [] arr2){
    if(arr1.length!=arr2.length)
    return false;
    
        int sum1 = 0;
        int mult1 = 1;

        int sum2 = 0;
        int mult2 = 1;

        for(int i : arr1){
            sum1+=i;
            mult1*=i;
        }

        for(int i : arr2){
            sum2+=i;
            mult2*=i;
        }

        return sum1==sum2 && mult1==mult2;
    
    }
    
}
    
