class Main{
    public static void main(String[] args){
            SinglyLinkedList sLL = new SinglyLinkedList();
            
            //sLL.createSinglyLinkedList(5);
            
            sLL.insertInCircularSinglyLinkedList(1,0);            
            sLL.insertInCircularSinglyLinkedList(4,0);
            sLL.insertInCircularSinglyLinkedList(2,1);
            sLL.insertInCircularSinglyLinkedList(3,2);
            sLL.insertInCircularSinglyLinkedList(10,2);
            sLL.insertInCircularSinglyLinkedList(4,3);
            
            sLL.traverseSinglyLinkedList();
            
            System.out.println(sLL.searchInSinglyLinkedList(10));
            
            sLL.deleteFromLinkedList(2);
            
            sLL.deleteSLL();
            }
            
        }
