package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {




    @Test
    public void insertOneElement(){
        BinaryTree tree = new BinaryTree();
        tree.insert(9);

        assertEquals(1, tree.getHeight());
        assertEquals(9, tree.getRoot().getValue());
    }

    @Test
    public void insertSecondElementLessThanRoot(){
        BinaryTree tree = new BinaryTree();

        assertEquals(2, tree.getHeight());
        assertEquals(9, tree.getRoot().getValue());
        assertEquals(4, tree.getRoot().getLeft().getValue());
        assertNull(tree.getRoot().getRight());
    }

    @Test
    public void insertSecondElementGreaterThanRoot(){
        BinaryTree tree = new BinaryTree();
        tree.insert(9);
        tree.insert(14);

        assertEquals(2, tree.getHeight());
        assertEquals(9, tree.getRoot().getValue());
        assertEquals(14, tree.getRoot().getRight().getValue());
        assertNull(tree.getRoot().getLeft());    
    }

    @Test
    public void insertTwoElementsLessThanRoot(){
        BinaryTree tree = new BinaryTree();
        tree.insert(9);
        tree.insert(5);
        tree.insert(6);

        assertEquals(3, tree.getHeight());
        assertEquals(9, tree.getRoot().getValue());
        assertEquals(5, tree.getRoot().getLeft().getValue());
        assertEquals(6, tree.getRoot().getLeft().getRight().getValue());
        assertNull(tree.getRoot().getRight());
    }

    


    
}