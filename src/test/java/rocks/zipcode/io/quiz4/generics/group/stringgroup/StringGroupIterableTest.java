package rocks.zipcode.io.quiz4.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupIterableTest {
    @Test
    public void test1Test() {
        test("the");
    }

    @Test
    public void test2Test() {
        test("the", "quick");
    }

    @Test
    public void test3Test() {
        test("the", "quick", "brown");
    }


    @Test
    public void test4Test() {
        test("the", "quick", "brown", "fox");
    }

    @Test
    public void test5Test() {
        test("the", "quick", "brown", "fox", "jumps");
    }

    private void test(String... valuesToInsert) {
        // given
        Group<String> group = new Group<>();
        List<String> result = new ArrayList<>();
        List<String> contents = Arrays.asList(valuesToInsert);
        contents.forEach(value -> group.insert(value));
        Iterable<String> iterableGroup = (Iterable<String>)group;

        // when
        iterableGroup.forEach(string -> result.add(string));

        // then
        Assert.assertEquals(group.count().intValue(), contents.size());
    }
}
