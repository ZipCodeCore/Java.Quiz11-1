package rocks.zipcode.io.quiz4.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupInsertTest {
    @Test
    public void test1Test() {
        test("first test");
    }

    @Test
    public void test2Test() {
        test("second test");
    }

    @Test
    public void test3Test() {
        test("third test");
    }

    private void test(String valueToInsert) {
        // given
        Group<String> group = new Group<>();

        // when
        Assert.assertFalse(group.has(valueToInsert));
        group.insert(valueToInsert);

        // then
        Assert.assertTrue(group.has(valueToInsert));
    }
}
