package jopa;

public class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
        this.value = value;
        left = null;
        right = null;
        }
        }
// Class for Binary Search Tree
class BST{
    Node node;
    BST(int value){
        node = new Node(value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        // Move to left for value less than parent node
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        // Move to right for value greater than parent node
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    // For traversing in order
    public void inOrder(Node node){
        if(node != null){
            // recursively traverse left subtree
            inOrder(node.left);
            System.out.print(node.value + " ");
            // recursively traverse right subtree
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        int[] i = {1,2,5,12,5,1,256,2312,522};
        BST b = new BST(i[0]);
        for(int num : i){
            b.insert(b.node, num);
            System.out.println(num);
        }

    }
}
