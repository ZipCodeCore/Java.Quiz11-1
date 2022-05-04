package rocks.zipcode.io.quiz4.generics.stack.integerstack;

import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.MyStack;
import rocks.zipcode.io.quiz4.utils.TestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerStackPopTest {
    private MyStack<Integer> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test(expected = EmptyStackException.class)
    public void test1Test() {
        stack.pop();
    }

    @Test
    public void test2Test() {
        test(765, 321, 9, 342, 98, 132);
    }
    
    @Test
    public void test3Test() {
        test(1123, 65, 4568, 21, 3154);
    }

    private void test(Integer... elementsToBePushed) {
        List<Integer> listOfElementsTobePushed = Arrays.asList(elementsToBePushed);
        List<Integer> result = new ArrayList<>();
        for (Integer elementToBePushed : listOfElementsTobePushed) {
            stack.push(elementToBePushed);
        }

        for (Integer elementToBePopped : listOfElementsTobePushed) {
            result.add(stack.pop());
        }

        Integer[] actual = TestUtils.reveseList(result).toArray(Integer[]::new);
        Integer[] expected = listOfElementsTobePushed.stream().toArray(Integer[]::new);
        TestUtils.assertArrayEquals(expected, actual);
    }
}
