package org.wahlzeit.model;

import org.junit.Test;
import org.wahlzeit.model.Coordinates.Coordinate;
import org.wahlzeit.model.Coordinates.SphericCoordinate;

import static junit.framework.TestCase.assertEquals;

public class LocationTest {


    @Test
    public void testgetDistance(){
        Coordinate dest = new SphericCoordinate(52.517, 13.40);
        Location testLocation = new Location(dest);

        assertEquals(testLocation.getCoordinates(), dest);
    }
}
