package rocks.zipcode.io.quiz4.generics.stack;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.MyStack;

import java.util.Collection;

/**
 * @author leon on 11/12/2018.
 */
public class StackPolymorphismTest {
    @Test
    public void ensureStackIsIterableTest() {
        Assert.assertTrue(new MyStack<>() instanceof Iterable);
    }

    @Test
    public void ensureStackIsNotCollectionTest() {
        Assert.assertFalse(new MyStack<>() instanceof Collection);
    }
}
