package binarytree;

public class BinaryTree {
    
    Node root;
    
    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            
            while(true) {
                parent = focusNode;   
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    
    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    
    
    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    
    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            
            System.out.println(focusNode);
        }
    }
}
