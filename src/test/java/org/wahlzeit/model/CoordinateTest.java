package org.wahlzeit.model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CoordinateTest {

    @Test
    public void testgetDistance(){
        Coordinate src = new Coordinate(52.517, 13.40);
        Coordinate dest = new Coordinate(35.70, 139.767);

        double desiredlength = 8918000.0;

        double result = Math.round(dest.getDistance(src));

        System.out.println(result);
        assertEquals(desiredlength, result);
    }

}
