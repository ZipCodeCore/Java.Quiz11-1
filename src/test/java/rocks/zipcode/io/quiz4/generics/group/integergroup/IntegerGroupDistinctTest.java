package rocks.zipcode.io.quiz4.generics.group.integergroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerGroupDistinctTest {
    @Test
    public void test1Test() {
        test(1);
    }

    @Test
    public void test2Test() {
        test(2);
    }

    @Test
    public void test3Test() {
        test(3);
    }

    private void test(Integer valueToInsert) {
        // given
        Group<Integer> group = new Group<>();

        // when
        Assert.assertFalse(group.has(valueToInsert));
        group.insert(valueToInsert);

        // then
        Assert.assertTrue(group.has(valueToInsert));
    }
}
