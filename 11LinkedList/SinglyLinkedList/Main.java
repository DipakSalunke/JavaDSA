class Main{
    public static void main(String[] args){
            SinglyLinkedList sLL = new SinglyLinkedList();
            
            //sLL.createSinglyLinkedList(5);
            
            sLL.insertInLinkedList(1,0);            
            sLL.insertInLinkedList(4,0);
            sLL.insertInLinkedList(2,1);
            sLL.insertInLinkedList(3,2);
            sLL.insertInLinkedList(10,2);
            sLL.insertInLinkedList(4,3);
            
            sLL.traverseSinglyLinkedList();
            
            System.out.println(sLL.searchInSinglyLinkedList(10));
            
            sLL.deleteFromLinkedList(2);
            
            sLL.deleteSLL();
            }
            
        }
