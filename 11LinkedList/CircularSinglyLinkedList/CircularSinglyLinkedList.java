 public class CircularSinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createCSLL(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.value = nodeValue;
    node.next = node;
    head = node;
    tail = node;
    size = 1;
    return head;
  }
  
  public void insertInCircularSinglyLinkedList(int nodeValue, int location){
    System.out.println("## add(val="+nodeValue+",loc="+location+")");
    Node node = new Node();
    node.value = nodeValue;
    
        if(head==null){
            createCSLL(nodeValue);
        }
        else if(location == 0){
            node.next = head;
            head = node;
            tail.next=node;
            size++;
            }
        else if(location >= size)
        {
            node.next = head;
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
      
    }
      public void traverseCircularSinglyLinkedList(){
    Node headTemp = head;
    if(headTemp==null)
    System.out.println("SLL does not exist!");
    int cnt = 0;
        while(cnt<size){
        System.out.print(headTemp.value+"->");
        
        headTemp = headTemp.next;
        cnt++;
        }
    }
    
    
    public int searchInCircularSinglyLinkedList(int val){
        Node headTemp = head;
        int cnt = 0;
        if(headTemp==null)
        System.out.println("SLL does not exist!");
        while(cnt<size){
            if(val==headTemp.value)
            return cnt;
            headTemp = headTemp.next;
            cnt++;
        }
        return -1;
    }
    
     public void deleteFromCircularLinkedList(int location){
        System.out.println("## delete(loc="+location+")");
        if(head==null){
            System.out.println("SLL does not exist!");
            return;
        }
        
        else if(location == 0){
            head = head.next;
            tail.next=head;
            size--;
            if(size == 0){
            tail = null;
            head.next = null;
            head = null;
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
            if(temp == head){
            head.next = null;
            tail = head = null;
            size--; return ;
        
            }
            temp.next = head;
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
    traverseCircularSinglyLinkedList();      
    }
    
  }
