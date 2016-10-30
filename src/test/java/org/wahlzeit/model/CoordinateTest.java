package org.wahlzeit.model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CoordinateTest {

    @Test
    public void testgetDistance(){
        Coordinate dest = new Coordinate(52.517, 13.40);
        Coordinate src = new Coordinate(35.70, 139.767);

        double desiredlength = 8918950.0;

        double result = Math.round(dest.getDistance(src));
        assertEquals(desiredlength, result);
    }

}
