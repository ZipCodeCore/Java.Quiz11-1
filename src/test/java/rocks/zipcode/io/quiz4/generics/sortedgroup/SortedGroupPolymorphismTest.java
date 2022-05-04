package rocks.zipcode.io.quiz4.generics.sortedgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.GroupInterface;
import rocks.zipcode.io.quiz4.generics.SortedGroup;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroupPolymorphismTest {
    @Test
    public void test1Test() {
        Assert.assertTrue(new SortedGroup() instanceof GroupInterface);
    }
}
