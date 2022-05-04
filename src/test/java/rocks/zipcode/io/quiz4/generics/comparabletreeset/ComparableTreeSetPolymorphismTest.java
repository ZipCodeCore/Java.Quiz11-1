package rocks.zipcode.io.quiz4.generics.comparabletreeset;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSetPolymorphismTest {
    @Test
    public void test1Test() {
        Assert.assertTrue((Object)new ComparableTreeSet() instanceof TreeSet);
    }

    @Test
    public void test2Test() {
        Assert.assertTrue(new ComparableTreeSet() instanceof Comparable);
    }
}
