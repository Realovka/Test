package by.academy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sum() {
        int a = 5;
        int b = 6;
        int aspectSum = 11;
        int res = App.sum(a, b);
        assertEquals(aspectSum,res);
    }
}
