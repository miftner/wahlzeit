package org.wahlzeit.model.Coordinates;

public interface Coordinate {

    boolean isEqual(Coordinate other);

    /**
     * Distance from this Coordinate to the sourceCoordinates returned in Meters
     */
    double getDistance(Coordinate sourceCoordinates);

    /**
     * Converts the CoordinateObject
     * @return
     * returns a Cartesian Coordinate Object
     */
    CartesianCoordinate getCartesianCoordinateObject();


}