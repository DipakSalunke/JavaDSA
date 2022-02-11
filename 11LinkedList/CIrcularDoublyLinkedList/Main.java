public class Main{
    public static void main(String[] args){
        DoublyLinkedList DLL = new DoublyLinkedList();
        
        DLL.insertInDLL(3,0);
        DLL.insertInDLL(2,3);
        DLL.insertInDLL(1,1);  
        DLL.insertInDLL(5,1);
        DLL.insertInDLL(4,3);
        //DLL.insertInDLL(10,0);
        DLL.RTraverseDLL();
        
        DLL.searchInDLL(2);
        
        DLL.deleteInDLL(2);
        DLL.deleteInDLL(0);
        DLL.deleteInDLL(6);
        DLL.deleteInDLL(6);
        DLL.deleteAllDLL();
     
    }
}
