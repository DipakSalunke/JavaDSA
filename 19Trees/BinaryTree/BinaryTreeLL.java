import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void InOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.value + " ");
        InOrder(node.right);
    }

    void PostOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder(){
        if (root == null) {
            System.out.println("BT is not present!");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    boolean searchBTree(String val){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(val==presentNode.value)
                return true;
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return false;
    }

    boolean insertNode(String val){
        BinaryNode BN = new BinaryNode();
        BN.value = val;
        if(root == null){
            root = BN;
            System.out.println("Inserted new node at root");
            return true;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(val==presentNode.value)
                return true;
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }else{
                presentNode.left = BN;
                System.out.println("Successfully inserted");
                return true;
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }else{
            presentNode.right = BN;
                System.out.println("Successfully inserted");
            return true;
            }
        }
        return false;
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode=null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();

            if(presentNode.left ==null){
                previousNode.right = null;
                return;
            }
            else if(presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }


    }

    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
            presentNode.value = getDeepestNode().value;
            deleteDeepestNode();
            System.out.println("The Node is deleted!");
            return ;
            }
            else{
                if(presentNode.left != null) queue.add(presentNode.left);
                if(presentNode.right != null)queue.add(presentNode.right);
            }
        }
        System.out.println("The Node does not exist in this BT!");
    }

    void deleteBT(){
        root = null;
        System.out.println("BT has been successfully deleted!");
    }
}
