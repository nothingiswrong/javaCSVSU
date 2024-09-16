package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private BaseOperationsCalculator testCalc;
    public CalculatorTest(BaseOperationsCalculator testCalc) {
        this.testCalc = testCalc;
    }
    @Test
    public void sumTest() {
        var x = 5;
        var y = 5;
        var expected = 10;
        var got = testCalc.sum(x, y);
        Assert.assertEquals(got, expected);
    }

}
