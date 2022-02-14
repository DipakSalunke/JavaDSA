class Main{
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();

       /* BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;*/
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
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\nInOrder");
        binaryTree.InOrder(binaryTree.root);
        System.out.println("\nPostOrder");
        binaryTree.PostOrder(binaryTree.root);

        System.out.println("\ninsertNode(\"N10\") :"+binaryTree.insertNode("N10"));

        System.out.println("\nlevelOrder");
        binaryTree.levelOrder();
        System.out.println();

        System.out.println("\nsearchBTree(\"N55\") :"+binaryTree.searchBTree("N55"));
        System.out.println("\nsearchBTree(\"N5\") :"+binaryTree.searchBTree("N5"));

        binaryTree.deleteNode("N3");

        System.out.println("\nlevelOrder");
        binaryTree.levelOrder();
        System.out.println();

        binaryTree.deleteBT();

        System.out.println("\nlevelOrder");
        binaryTree.levelOrder();
        System.out.println();

    }
}