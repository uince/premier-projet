package org.Fitec;

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

    public void shouldReturnFiveGiven2And3()
    {

        App app = new App();

        assertTrue(app.addition(2,3) == 5);
    }

    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
