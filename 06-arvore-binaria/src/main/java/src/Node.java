package src;

public class Node {

    private int value;
    private Node left;
    private Node right;

    Node(int _value) {
        this.value = _value;
    }

    Node(int _value, Node _left, Node _right) {
        this.value = _value;
        this.left = _left;
        this.right = _right;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * @return the left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * 
     * @return right reference
     */
    public Node getRight() {
        return right;
    }


    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

}