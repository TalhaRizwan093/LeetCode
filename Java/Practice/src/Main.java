import TreePractice.BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MinHeapInternal minHeap = new MinHeapInternal();
        minHeap.minHeapPracticeTopKElements(List.of(1,7,5,4,9,2), 3);

        System.out.println("Binary Search Tree Testing");
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(40);
        binaryTree.insert(30);
        binaryTree.insert(50);
        binaryTree.insert(25);
        binaryTree.insert(35);
        binaryTree.insert(15);
        binaryTree.insert(28);
        binaryTree.insert(45);
        binaryTree.insert(60);
        binaryTree.insert(55);
        binaryTree.insert(70);

        binaryTree.inorder();
        System.out.println();
        binaryTree.preorder();
        System.out.println();
        binaryTree.postorder();
    }
}