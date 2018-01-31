/**
 * Created by Mia Kimmich Mitchell on 1/26/2018.
 */

import static org.junit.jupiter.api.Assertions.*;

public class StringCalcTest {

    @org.junit.jupiter.api.Test
    void addTestZero(){

        int sum = StringCalc.add("");
        assertEquals(0, sum);

    }



}
