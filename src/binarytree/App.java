package binarytree;

public class App {

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode(50,  "Boss");
        theTree.addNode(25,  "Vice President");
        theTree.addNode(15,  "Office Manager");
        theTree.addNode(30,  "Secretary");
        theTree.addNode(75,  "Sales Manager");
        theTree.addNode(85,  "Sales Representative");
        
        theTree.preOrderTraverseTree(theTree.root);
//        theTree.inOrderTraverseTree(theTree.root);
//        theTree.postOrderTraverseTree(theTree.root);

    
    }
}
