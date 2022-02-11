public class LinkedStack{
  private Node head;
    private int size;

    public LinkedStack (){
        this.head = null;
        this.size = 0;
        System.out.println("The stack is created !");
    }
    
    public boolean isEmpty(){
        if(size == 0){
        return true;
        }else {
        return false;
        }
    }
    
    public void push(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
        size ++;
        System.out.println("the value is successfully inserted!");        
    }  
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty!");
            return -1;
        }else{
            int val = head.value;
            head = head.next;
            size --;
            return val;
        }
    }    
    
      public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is Empty!");
            return -1;
        }else{
            return head.value;
        }
    }    
    
}



