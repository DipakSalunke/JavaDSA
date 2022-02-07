class Main{
    public static void main(String[] args){
        Main main = new Main();
        int arr [] = {1,2,3,4,5 ,7,8,9};
        System.out.println(main.missingNumber(arr, arr.length+1));
    }
    
    public int missingNumber(int [] intArray, int n){
        int sum1 = 0;
        int sum2 = 0;
        
        for(int num : intArray){
        sum1+=num;
        }
        
        sum2 = n*(n+1)/2;
        
        return sum2-sum1;
        
    }
}
        
        
