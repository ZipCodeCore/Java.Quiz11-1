package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareMultipleElementNeutral {

    @Test
    public void test1Test() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Arty", "Fee", "Shawl");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Fee", "Shawl", "Arty");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual == 0);
    }


    @Test
    public void test2Test() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("The", "Quick", "Brown", "Fox", "Jumps");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Jumps", "Brown", "Fox", "Quick", "The");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual == 0);
    }
}
