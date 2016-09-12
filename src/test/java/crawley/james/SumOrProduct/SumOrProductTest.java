package crawley.james.SumOrProduct;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class SumOrProductTest {

    public SumOrProductTest () {
        testAdd();
        testMultiply();
    }

    @Test
    public void testAdd () {
        ConsecutiveAddOrMultiply operator = new ConsecutiveAddOrMultiply();

        Assert.assertEquals("The value should be 15.",15, operator.consecutiveAdd(5));
    }

    @Test
    public void testMultiply () {
        ConsecutiveAddOrMultiply operator = new ConsecutiveAddOrMultiply();

        Assert.assertEquals("The value should be 120.",120, operator.consecutiveMultiply(5));
    }
}
