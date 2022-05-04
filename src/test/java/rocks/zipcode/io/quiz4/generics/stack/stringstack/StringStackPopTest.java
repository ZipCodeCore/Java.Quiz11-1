package rocks.zipcode.io.quiz4.generics.stack.stringstack;

import org.junit.Assert;
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
public class StringStackPopTest {
    private MyStack<String> stack;

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
        test("765", "321", "9", "342", "98", "132");
    }
    
    @Test
    public void test3Test() {
        test("1123", "65", "4568", "21", "3154");
    }

    private void test(String... elementsToBePushed) {
        List<String> listOfElementsTobePushed = Arrays.asList(elementsToBePushed);
        List<String> result = new ArrayList<>();
        for (String elementToBePushed : listOfElementsTobePushed) {
            stack.push(elementToBePushed);
        }

        for (String elementToBePopped : listOfElementsTobePushed) {
            result.add(stack.pop());
        }

        String[] actual = TestUtils.reveseList(result).toArray(String[]::new);
        String[] expected = listOfElementsTobePushed.stream().toArray(String[]::new);
        TestUtils.assertArrayEquals(expected, actual);
    }
}
