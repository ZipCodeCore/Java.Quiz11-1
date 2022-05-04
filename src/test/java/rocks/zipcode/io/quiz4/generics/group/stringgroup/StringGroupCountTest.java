package rocks.zipcode.io.quiz4.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

import java.util.UUID;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupCountTest {
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

    public void test(Integer numberOfItemsToAdd) {
        // given
        Group<String> group = new Group<>();

        // when
        for (int i = 0; i < numberOfItemsToAdd; i++) {
            String itemToAdd = UUID.randomUUID().toString();
            group.insert(itemToAdd);
        }

        // then
        Assert.assertEquals(group.count(), numberOfItemsToAdd);
    }
}
