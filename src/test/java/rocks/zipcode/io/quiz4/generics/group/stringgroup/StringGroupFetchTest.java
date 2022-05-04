package rocks.zipcode.io.quiz4.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupFetchTest {
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

    @Test(expected = IndexOutOfBoundsException.class)
    public void test4Test() {
        // given
        Group<String> group = new Group<>();

        // when
        group.fetch(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test5Test() {
        // given
        Group<String> group = new Group<>();

        // when
        group.fetch(15);
    }


    private void test(String... stringsToInsert) {
        // given
        Group<String> group = new Group<>();
        List<String> simpleStringGroupContents = Arrays.asList(stringsToInsert);
        simpleStringGroupContents.forEach(string -> group.insert(string));

        // when
        for (int i = 0; i < stringsToInsert.length; i++) {
            Assert.assertEquals(stringsToInsert[i], group.fetch(i));
        }
    }
}
