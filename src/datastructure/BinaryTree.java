package datastructure;

/**
 * Created by murumkah on 6/8/2017.
 */
public class BinaryTree {

    private static Node root = null;
    public static void main(String[] args) {
        //int[] arr = {9, 6, 4, 3, 11, 15, 10};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        BinaryTree tree = new BinaryTree();

        for(int num : arr)
        {
           tree.insert(num, root);
        }

        System.out.print("IN-ORDER ");
        tree.inorder(root);
        /*System.out.println();
        System.out.print("PRE-ORDER ");
        tree.preorder(root);
        System.out.println();
        System.out.print("POST-ORDER ");
        tree.postorder(root);*/
    }

    private void insert(int data, Node node)
    {
        if(root == null) {
            root = new Node(data);
            return;
        }
        else
        {
            if(data < node.data)
            {
                if(node.leftPointer != null)
                    insert(data, node.leftPointer);
                else
                    node.leftPointer = new Node(data);
            }
            else
            {
                if(node.rightPointer != null)
                    insert(data, node.rightPointer);
                else
                    node.rightPointer = new Node(data);
            }

        }
    }

    private void preorder(Node node)
    {
        if(node == null)
            return;
        else
        {
            System.out.print(node.data + " ");
            preorder(node.leftPointer);
            preorder(node.rightPointer);
        }
    }

    private void postorder(Node node)
    {
        if(node == null)
            return;
        else
        {
            postorder(node.leftPointer);
            postorder(node.rightPointer);
            System.out.print(node.data + " ");
        }
    }

    private void inorder(Node node)
    {
        if(node == null)
            return;
        else{
            inorder(node.leftPointer);
            System.out.print(node.data + " ");
            inorder(node.rightPointer);
        }
    }

    private class Node
    {
        private Node leftPointer;
        private Node rightPointer;
        private int data;

        public Node(int d)
        {
            this.data = d;
            leftPointer = null;
            rightPointer = null;
        }
    }
}
