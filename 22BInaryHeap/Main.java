public class Main {
public static void main(String[]args){
    BinaryHeap1 bh = new BinaryHeap1(10);
    System.out.println(bh.peek());
    bh.levelOrder();
    }
}