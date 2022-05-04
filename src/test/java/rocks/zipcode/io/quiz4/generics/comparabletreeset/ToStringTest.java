package rocks.zipcode.io.quiz4.generics.comparabletreeset;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ToStringTest {
    @Test
    public void test1Test() {
        // given
        String[] input = "qwertyuiop".split("");
        ComparableTreeSet<String> set = new ComparableTreeSet<>(input);
        String expected = "[e, i, o, p, q, r, t, u, w, y]";

        // when
        String actual = set.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2Test() {
        // given
        String[] input = "asdfghjk".split("");
        ComparableTreeSet<String> set = new ComparableTreeSet<>(input);
        String expected = "[a, d, f, g, h, j, k, s]";

        // when
        String actual = set.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
