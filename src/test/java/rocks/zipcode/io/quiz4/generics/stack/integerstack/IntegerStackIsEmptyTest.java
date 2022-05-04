package rocks.zipcode.io.quiz4.generics.stack.integerstack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.MyStack;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerStackIsEmptyTest {
    private MyStack<Integer> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1Test() {
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void test2Test() {
        stack.push(0);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void test3Test() {
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
    }
}
