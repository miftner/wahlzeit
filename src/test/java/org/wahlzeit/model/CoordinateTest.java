package org.wahlzeit.model;

import org.junit.Test;
import org.wahlzeit.model.Coordinates.Coordinate;
import org.wahlzeit.model.Coordinates.SphericCoordinate;

import static junit.framework.TestCase.assertEquals;


public class CoordinateTest {

    @Test
    public void testgetDistance(){
        SphericCoordinate dest = new SphericCoordinate(52.517, 13.40);
        SphericCoordinate src = new SphericCoordinate(35.70, 139.767);

        double desiredlength = 8918950.0;

        double result = Math.round(dest.getDistance(src));
        assertEquals(desiredlength, result);
    }

}
