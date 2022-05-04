package rocks.zipcode.io.quiz4.generics.stack.stringstack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.MyStack;

/**
 * @author leon on 11/12/2018.
 */
public class StringStackPushTest {
    private MyStack<String> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1Test() {
        Assert.assertNull(stack.peek());
    }

    @Test
    public void test2Test() {
        String expected = "0";
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test3Test() {
        String expected = "1";
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test4Test() {
        String val1 = "10";
        String val2 = "15";
        String val3 = "20";
        String expected = "25";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test5Test() {
        String  val1 = "30";
        String  val2 = "35";
        String  val3 = "40";
        String  expected = "45";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }
}
