class Main {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    //csll.createCSLL(5);
    csll.insertInCircularSinglyLinkedList(1,0);            
    /*csll.insertInCircularSinglyLinkedList(4,0);
    csll.insertInCircularSinglyLinkedList(2,1);
    csll.insertInCircularSinglyLinkedList(3,2);
    csll.insertInCircularSinglyLinkedList(10,2);*/
    csll.insertInCircularSinglyLinkedList(4,3);
    csll.traverseCircularSinglyLinkedList();
    System.out.println(csll.searchInCircularSinglyLinkedList(4));
    csll.deleteFromCircularLinkedList(0);
    csll.deleteFromCircularLinkedList(5);
    csll.deleteFromCircularLinkedList(2);
    
    }
}
