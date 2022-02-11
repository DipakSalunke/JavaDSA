class Main {
    public static void main(String[] args){
        Stack newStack = new Stack(4);
        System.out.println("newStack.isEmpty() :"+newStack.isEmpty());
        System.out.println("newStack.isFull() :"+newStack.isFull());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println("newStack.pop() :"+newStack.pop());
        System.out.println("newStack.pop() :"+newStack.pop());
        System.out.println("newStack.peek() :"+newStack.peek());
        System.out.println("newStack.peek() :"+newStack.peek());
        System.out.println("newStack.pop() :"+newStack.pop());
        System.out.println("newStack.pop() :"+newStack.pop());
        System.out.println("newStack.pop() :"+newStack.pop());
        System.out.println("////////////////////");
         LinkedStack LStack = new LinkedStack();
        System.out.println("newStack.isEmpty() :"+newStack.isEmpty());
        LStack.push(1);
        LStack.push(2);
        LStack.push(3);
        LStack.push(4);

        System.out.println("newStack.pop() :"+LStack.pop());
        System.out.println("newStack.pop() :"+LStack.pop());
        System.out.println("newStack.peek() :"+LStack.peek());
        System.out.println("newStack.peek() :"+LStack.peek());
        System.out.println("newStack.pop() :"+LStack.pop());
        System.out.println("newStack.pop() :"+LStack.pop());
        System.out.println("newStack.pop() :"+LStack.pop());
    }
    
    }
