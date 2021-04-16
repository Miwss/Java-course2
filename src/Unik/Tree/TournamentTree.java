package Unik.Tree;
class Node {
    Integer value;
    Node left, right;
}

//If the tree has no 2nd min value, return -1
public class TournamentTree {
    int secondMinValue(Node root) {
        if(root == null || root.left == null) {
            return -1;
        }
        if(root.left.value == root.value) {  //if root.left is winner
            int leftSecondMin = secondMinValue(root.left);   //search for 2nd min at winner side
            if(leftSecondMin == -1 || leftSecondMin > root.right.value) {
                return root.right.value;
            } else return leftSecondMin;
        } else {   //if root.right is winner
            int rightSecondMin = secondMinValue(root.right);
            if(rightSecondMin == -1 || rightSecondMin > root.left.value) {
                return root.left.value;
            } else return rightSecondMin;
        }
    }
}