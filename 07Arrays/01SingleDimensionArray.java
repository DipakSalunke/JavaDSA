class SingleDimensionArray{
    int arr[] = null;
    
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i=0; i<arr.length; i++){
        arr[i] = Integer.MIN_VALUE;
        }
    }
    
    public void insert(int location, int valueToBeInserted){
    try {
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
                }
                else {
                System.out.println("This cell is already occupied");
                }
                
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid index to access array!");
        }
    }
}

class Main{
public static void main(String[] args){
    SingleDimensionArray sda = new SingleDimensionArray(10);
 
    sda.insert(0,0);
    sda.insert(1,10);
    sda.insert(2,20);
    sda.insert(1,30);
    sda.insert(12,120);
}
}
  
                
                

