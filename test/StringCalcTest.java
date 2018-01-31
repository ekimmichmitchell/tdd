/**
 * Created by Mia Kimmich Mitchell on 1/26/2018.
 */

import static org.junit.jupiter.api.Assertions.*;

public class StringCalcTest {

    @org.junit.jupiter.api.Test
    void addTestZero() throws Exception {

        int sum = StringCalc.add("");
        assertEquals(0, sum);

    }


    @org.junit.jupiter.api.Test
    void addTestOnePos() throws Exception {

        int sum = StringCalc.add("12");
        assertEquals(12, sum);

    }

    @org.junit.jupiter.api.Test
    void addTestOneNeg() throws Exception {

        int sum = StringCalc.add("-2");
        assertEquals(-2, sum);

    }


    @org.junit.jupiter.api.Test
    void addTestTooMany() throws Exception{

        Throwable exception = assertThrows(Exception.class, ()-> StringCalc.add("1,2") );

    }

}
