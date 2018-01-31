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


//    @org.junit.jupiter.api.Test
//    void addTestTooMany() throws Exception{
//
//        Throwable exception = assertThrows(Exception.class, ()-> StringCalc.add("1,2") );
//
//    }


    @org.junit.jupiter.api.Test
    void addTestTwoPos() throws Exception {

        int sum = StringCalc.add("1,2");
        assertEquals(3, sum);

    }

    @org.junit.jupiter.api.Test
    void addTestTwoNeg() throws Exception {

        int sum = StringCalc.add("-1,-2");
        assertEquals(-3, sum);

    }

    @org.junit.jupiter.api.Test
    void addTestTwoPosNeg() throws Exception {

        int sum = StringCalc.add("-1,2");
        assertEquals(1, sum);

    }

    @org.junit.jupiter.api.Test
    void addTestTwoNegPos() throws Exception {

        int sum = StringCalc.add("1,-2");
        assertEquals(-1, sum);

    }

    @org.junit.jupiter.api.Test
    void addTestFour() throws Exception {

        int sum = StringCalc.add("1,-2,17,-5");
        assertEquals(11, sum);

    }

    @org.junit.jupiter.api.Test
    void addTestTen() throws Exception {

        int sum = StringCalc.add("1,2,3,4,5,6,7,8,9,-45");
        assertEquals(0, sum);

    }
}
