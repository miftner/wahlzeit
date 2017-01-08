package org.wahlzeit.model.Coordinates;

import org.wahlzeit.utils.DesignPatternInterface;

@DesignPatternInterface(
        patternName = "Template",
        participants = {
                "AbstractClass", "ConcreteClass"
        }

)

public abstract class AbstractCoordinate implements Coordinate {


    public CartesianCoordinate getCartesianCoordinateObject() {
        return null;
    }

    public boolean isEqual(CartesianCoordinate other) {
        assertCoordinateNotNull(other);
        CartesianCoordinate thisHere = this.getCartesianCoordinateObject();
        if (thisHere.getX() == other.getX() && thisHere.getY() == other.getY() && thisHere.getZ() == other.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculates the distance to another coordinate in meters.
     *
     * @return
     * distance in meters
     */
    @Override
    public double getDistance(Coordinate coordinate) {

        assertCoordinateNotNull(coordinate);

            CartesianCoordinate coordinateThis = this.getCartesianCoordinateObject();
            CartesianCoordinate coordinateThat = coordinate.getCartesianCoordinateObject();

            double distance = coordinateThis.doGetDistance(coordinateThat);

            if(distance < 0){
                throw new IllegalArgumentException("Calculated Distance has to be >= 0");
            }

            assertClassInvariants();

            return distance;
        }


    /*
    public double getDistance(CartesianCoordinate start, CartesianCoordinate end){


        double dx = start.getX() - end.getX();
        double dy = start.getY() - end.getY();
        double dz = start.getZ() - end.getZ();

        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }*/

    public void isValidDouble(double testDouble){
        if(Double.isInfinite(testDouble) || Double.isNaN(testDouble)) {
        throw new IllegalArgumentException("Double has no valid value");
        }
    }

    public void assertCoordinateNotNull(Coordinate coordinate){
        if(coordinate == null){
            throw new IllegalArgumentException("Argument may not be null!");
        }
    }


    protected void assertClassInvariants() {

    }
}
