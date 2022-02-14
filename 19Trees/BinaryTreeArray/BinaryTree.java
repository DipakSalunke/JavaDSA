public class BinaryTree {
    String [] arr;
    int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of Size "+size+" has been created");
    }

    boolean isFull(){
        if(arr.length-1==lastUsedIndex){
            return true;
        }
        else{
            return false;
        }
    }

    void insertNode(String value){
        if(!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted");
        }else {
            System.out.println("The BT is full");
        }
    }

    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    public void InOrder(int index){
        if(index > lastUsedIndex){
            return;
        }

        InOrder(index * 2);
        System.out.print(arr[index] + " ");
        InOrder(index * 2 + 1);
    }

    public void PostOrder(int index){
        if(index > lastUsedIndex){
            return;
        }

        PostOrder(index * 2);
        PostOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder(){
        for (int i = 1; i <= lastUsedIndex ;i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public int search(String val){
        for (int i = 1; i <= lastUsedIndex ;i++) {
            if(arr[i]==val) {
                System.out.println("\n"+val + " value exists at loc " + i);
                return i;
            }
        }
        System.out.println("NOT FOUND"+val);
        return -1;
    }

    public void delete(String val){
        for (int i = 1; i <= lastUsedIndex ;i++) {
            if(arr[i]==val) {
                arr[i]=arr[lastUsedIndex];
                arr[lastUsedIndex]=null;
                lastUsedIndex--;
                System.out.println("NODE DELETED :"+val);
                return;
            }
        }
        System.out.println("NODE NOT FOUND :"+val);
    }
}