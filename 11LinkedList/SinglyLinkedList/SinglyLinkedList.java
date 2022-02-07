public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
     
    
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next  = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
    public void insertInLinkedList(int nodeValue, int location){
    System.out.println("## add(val="+nodeValue+",loc="+location+")");
    Node node = new Node();
    node.value = nodeValue;
    
        if(head==null){
            createSinglyLinkedList(nodeValue);
        }
        else if(location == 0){
            node.next = head;
            head = node;
            size++;
            }
        else if(location >= size)
        {
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        } else{
            Node temp = head; 
            int cnt  = 0;
            while (cnt < location-1){
                temp = temp.next;
                cnt++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
      traverseSinglyLinkedList();      
    }
    
    public void traverseSinglyLinkedList(){
    Node headTemp = head;
    if(headTemp==null)
    System.out.println("SLL does not exist!");
        while(headTemp != null){
        System.out.print(headTemp.value+" -> ");
        headTemp = headTemp.next;
        }
        System.out.println("null\n");
    }
    
    public int searchInSinglyLinkedList(int val){
        Node headTemp = head;
        int cnt = 0;
        if(headTemp==null)
        System.out.println("SLL does not exist!");
        
        while(headTemp != null){
            if(val==headTemp.value)
            return cnt;
            headTemp = headTemp.next;
            cnt++;
        }
        return -1;
    }
    
     public void deleteFromLinkedList(int location){
        System.out.println("## delete(loc="+location+")");
        if(head==null){
            System.out.println("SLL does not exist!");
            return;
        }
        else if(location == 0){
            head = head.next;
            size--;
            if(size==0){
            tail=null;
            }
        }
        else if(location >= size)
        {
            Node temp = head; 
            int cnt  = 0;
            while (cnt < location-1){
                temp = temp.next;
                cnt++;
            }
            temp.next = null;
            tail = temp;
            size--;
        } else{
            Node temp = head; 
            int cnt  = 0;
            while (cnt < location-1){
                temp = temp.next;
                cnt++;
            }
            temp.next = temp.next.next;
            size--;
        }
    System.out.println("deleted node at loc: " + location);
    traverseSinglyLinkedList();      
    }
    
    public void deleteSLL(){
        head = null;
        tail = null;
        traverseSinglyLinkedList();
    }
        
    
    
}
