package rocks.zipcode.io.quiz4.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupClearTest {
    @Test
    public void test1Test() {
        test("first", "clear", "test");
    }

    @Test
    public void test2Test() {
        test("an", "additional", "test", "here");
    }

    @Test
    public void test3Test() {
        test("a", "dash", "of", "anonymity");
    }

    private void test(String... valuesToInsert) {
        // given
        Group<String> group = new Group<>();
        for(String valueToInsert : valuesToInsert) {
            group.insert(valueToInsert);
            Assert.assertTrue(group.has(valueToInsert));
        }

        // when
        group.clear();


        // then
        for(String valueToInsert : valuesToInsert) {
            Assert.assertFalse(group.has(valueToInsert));
        }
    }
}
