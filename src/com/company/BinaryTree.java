package com.company;
import java.

public class BinaryTree {
//preorder traversal
    static void preOrder(BinNode rt) {
        if(rt==null) return; //empty the subtree - does nothing
        visit(rt);  //process root node
        preOrder(rt.left());    //process all nodes in right
        preOrder(rt.right()); //process all nodes in right

    }
//PostOrder traversal
    static void postOrder(BinNode rt) {
        if(rt==null) return; //empty the subtree - does nothing
        postOrder(rt.left());    //process all nodes in left
        postOrder(rt.right()); //process all nodes in right
        visit(rt);  //process root node

    }
//InOrder traversal
    static void inOrder(BinNode rt) {
        if(rt==null) return; //empty the subtree - does nothing
        inOrder(rt.left());    //process all nodes in left
        visit(rt);  //process root node
        inOrder(rt.right()); //process all nodes in right

    }

}
