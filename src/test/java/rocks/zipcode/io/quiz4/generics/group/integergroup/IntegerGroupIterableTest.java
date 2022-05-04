package rocks.zipcode.io.quiz4.generics.group.integergroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerGroupIterableTest {
    @Test
    public void test1Test() {
        test(9);
    }

    @Test
    public void test2Test() {
        test(9, 99);
    }

    @Test
    public void test3Test() {
        test(9, 99, 999);
    }


    @Test
    public void test4Test() {
        test(9, 99, 999, 999);
    }

    @Test
    public void test5Test() {
        test(9, 99, 999, 999, 9999);
    }

    private void test(Integer... valuesToInsert) {
        // given
        Group<Integer> group = new Group<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> contents = Arrays.asList(valuesToInsert);
        contents.forEach(value -> group.insert(value));
        Iterable<Integer> iterableGroup = (Iterable<Integer>)group;

        // when
        iterableGroup.forEach(string -> result.add(string));

        // then
        Assert.assertEquals(group.count().intValue(), contents.size());
    }
}
