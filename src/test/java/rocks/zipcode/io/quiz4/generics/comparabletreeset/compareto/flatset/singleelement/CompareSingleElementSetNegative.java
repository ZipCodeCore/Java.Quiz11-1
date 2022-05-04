package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.singleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareSingleElementSetNegative {
    @Test
    public void test1Test() {
        // given
        ComparableTreeSet<String> a = new ComparableTreeSet<>("a");
        ComparableTreeSet<String> b = new ComparableTreeSet<>("b");

        // when
        Integer actual = a.compareTo(b);

        // then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void test2Test() {
        // given
        ComparableTreeSet<String> a = new ComparableTreeSet<>("a");
        ComparableTreeSet<String> c = new ComparableTreeSet<>("c");

        // when
        Integer actual = a.compareTo(c);

        // then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void test3Test() {
        // given
        ComparableTreeSet<String> a = new ComparableTreeSet<>("a");
        ComparableTreeSet<String> d = new ComparableTreeSet<>("d");

        // when
        Integer actual = a.compareTo(d);

        // then
        Assert.assertTrue(actual < 0);
    }
}
