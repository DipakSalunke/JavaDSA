public class DoublyLinkedList{
    DoublyNode head;
    DoublyNode tail;
    int size;
    
    public DoublyNode createDLL (int nodeValue){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.prev = node;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
    public void insertInDLL(int nodeValue,int location){
    traverseDLL();
    System.out.println(" insertInDLL>nodeValue>"+nodeValue+">location>"+location);
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodeValue;
        if(head == null){
        createDLL(nodeValue);
        return;
        }
        else if(location == 0) {
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head;
            
        } else if(location >=size ){
            newNode.next=head;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            head.prev = tail;
          
        } else{
            DoublyNode currNode = head;
            for(int i=0; i<location-1; i++){
               currNode = currNode.next;
            }
            newNode.next = currNode.next;
            newNode.prev = currNode;
            newNode.next.prev = newNode;
            currNode.next = newNode;
           
        }
        size++;
        
        traverseDLL();
    }
    
    public void traverseDLL(){
  
    if(head == null){
        System.out.println("DLL is not present !!");
        return;
        }
        DoublyNode currNode = head;
       
        for(int i=0; i<size+2; i++){
           System.out.print(currNode.value+"-");
           if(i>=size)
           System.out.print("-");
           currNode = currNode.next;
        }
        System.out.println("|");
    }
    
    public void RTraverseDLL(){
   System.out.println("RTraverseDLL");
    if(head == null){
        System.out.println("DLL is not present !!");
        return;
        }
        DoublyNode currNode = tail;
        
        for(int i=0; i<size*2; i++){
           System.out.print(currNode.value+"-");
           if(i>=size)
           System.out.print("-");
           currNode = currNode.prev;
        }
        System.out.println("|");
    }
    
    
     public int deleteInDLL(int location){
     traverseDLL();
     System.out.println("deleteInDLL>location>"+location);
        if(head == null){
        System.out.println("DLL is not present !!");
        return -1;
        }
        if(size == 1){
        head.prev = head.next = null;
        head = null;
        tail = null;
        size--;
        return -1;
        }
        else if(location == 0 ) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
        } else if(location >=size){
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        } else{
            DoublyNode currNode = head;
            for(int i=0; i<location-1; i++){
               currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
            currNode.next.prev = currNode;
            size--;
        }
       traverseDLL();
        return 1;
    }
  public void deleteAllDLL(){
  System.out.println("deleteAllDLL");
    if(head == null){
        System.out.println("DLL is not present !!");
        return;
        }
        DoublyNode currNode = head;
            
        for(int i=0; i<size; i++){
            currNode.prev = null;
           currNode = currNode.next;
        }
        currNode.next = null;
        head = null;
        tail = null;
        System.out.println("DLL Deleted !!");
    }
    
     public int searchInDLL(int value){
     traverseDLL();
     System.out.println("searchInDLL>"+value);
     if(head == null){
        System.out.println("DLL is not present !!");
        return -1;
        }
        DoublyNode currNode = head;
        for(int i=0; i<size; i++){
           if(currNode.value==value){
            System.out.println("Found at :" +i);
            return -1;
            }
           currNode = currNode.next;
        }
        
        System.out.println("value not present in DLL !");
        return -1;
    }
    
}
            
            
            
        
    
    
    
    
