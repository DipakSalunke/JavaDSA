class Main{
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertNode("N1");
        binaryTree.insertNode("N2");
        binaryTree.insertNode("N3");
        binaryTree.insertNode("N4");
        binaryTree.insertNode("N5");
        binaryTree.insertNode("N6");
        binaryTree.insertNode("N7");
        binaryTree.insertNode("N8");
        binaryTree.insertNode("N9");
        System.out.println("\npreOrder");
        binaryTree.preOrder(1);
        System.out.println("\n\nInOrder");
        binaryTree.InOrder(1);
        System.out.println("\n\nPostOrder");
        binaryTree.PostOrder(1);
        System.out.println("\n\nLevelOrder");
        binaryTree.levelOrder();
        System.out.println("\n\nsearch : "+binaryTree.search("N8"));

        binaryTree.delete("N3");
        System.out.println("\n\nLevelOrder");
        binaryTree.levelOrder();

    }
}