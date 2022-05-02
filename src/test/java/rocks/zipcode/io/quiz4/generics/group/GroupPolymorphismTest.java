package rocks.zipcode.io.quiz4.generics.group;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;
import rocks.zipcode.io.quiz4.generics.GroupInterface;

import java.util.Collection;

/**
 * @author leon on 11/12/2018.
 */
public class GroupPolymorphismTest {
    @Test
    public void test1() {
        Assert.assertTrue(new Group() instanceof Iterable);
    }

    @Test
    public void test3() {
        Assert.assertTrue(new Group() instanceof GroupInterface);
    }

    @Test
    public void test2() {
        Assert.assertFalse(new Group() instanceof Collection);
    }
}
