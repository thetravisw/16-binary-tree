package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void add() {
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals(5, TestTree.getRoot().data);
        assertEquals(7, TestTree.getRoot().right.data);
        assertEquals(4, TestTree.getRoot().left.data);
    }

    @Test
    public void order() {
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals(4, (int)TestTree.inorder().get(0));
        assertEquals(5, (int)TestTree.inorder().get(1));
        assertEquals(7, (int)TestTree.inorder().get(2));
    }

    @Test
    public void preorder() {
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals(5, (int)TestTree.preOrder().get(0));
        assertEquals(4, (int)TestTree.preOrder().get(1));
        assertEquals(7, (int)TestTree.preOrder().get(2));
    }


    @Test
    public void postorder() {
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals(4, (int)TestTree.postOrder().get(0));
        assertEquals(7, (int)TestTree.postOrder().get(1));
        assertEquals(5, (int)TestTree.postOrder().get(2));
    }

    @Test
    public void tostring(){
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals("[4, 5, 7]",TestTree.toString());
    }

    @Test
    public void min(){
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals(4,TestTree.min());
    }

    @Test
    public void contains(){
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertTrue(TestTree.contains(5));
        assertTrue(TestTree.contains(7));
        assertFalse(TestTree.contains(8));
    }

    @Test
    public void size(){
        BinaryTree TestTree = new BinaryTree();
        TestTree.add(5);
        TestTree.add(7);
        TestTree.add(4);

        assertEquals(3,TestTree.size());
    }



}