package org.wahlzeit.model;

import org.junit.Test;
import org.wahlzeit.model.Coordinates.SphericCoordinate;

import static junit.framework.TestCase.assertEquals;


public class CoordinateTest {

    @Test
    public void testgetDistance(){
        SphericCoordinate dest = SphericCoordinate.getSphericalObject(52.517, 13.40);
        SphericCoordinate src = SphericCoordinate.getSphericalObject(35.70, 139.767);

        double desiredlength = 8208278.0;

        double result = Math.round(dest.getDistance(src));
        System.out.println(desiredlength +" des is not result: " + result);
        assertEquals(desiredlength, result);

    }

}
