package src;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(9);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(11);
        tree.insert(21);

        // System.out.println(tree);
        System.out.println(tree.bfs());
        System.out.println(tree.print());
        System.out.println(tree.inOrder(tree.getRoot()));
        System.out.println(tree.preOrder(tree.getRoot()));
        System.out.println(tree.posOrder(tree.getRoot()));
        // tree.bfs();
    }
}