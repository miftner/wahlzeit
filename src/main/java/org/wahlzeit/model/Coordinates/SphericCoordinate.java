package org.wahlzeit.model.Coordinates;


public class SphericCoordinate extends AbstractCoordinate {

    private static final double EARTH_RADIUS_IN_METERS = 6371000.0;

    private double latitude;
    private double longitude;
    private double radius;


    public SphericCoordinate(double latitude, double longitude) {
        new SphericCoordinate(latitude, longitude, EARTH_RADIUS_IN_METERS);
    }

    private SphericCoordinate(double latitude, double longitude, double radius) {
        checkLatitudeIsValid(latitude);
        checkLongtitudeIsValid(longitude);

        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;

        assertClassInvariants();
    }

    /**
     * @return  the latitude value of the coordinate in degrees
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @return  the longitude value of the coordinate in degrees
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @return  the radius value of the coordinate
     */
    public double getRadius() {
        return radius;
    }

    public CartesianCoordinate getCartesianCoordinateObject() {
        return calculateCartesianCoordinate();
    }

    /**
     * Converts the spherical representation to its cartesian counterpart
     *
     * @return
     * Returns a new CartesianCoordinate object
     */
    protected CartesianCoordinate calculateCartesianCoordinate() {
        double latRadian = Math.toRadians(this.latitude);
        double longRadian = Math.toRadians(this.longitude);
        double x = radius * Math.cos(latRadian) * Math.cos(longRadian);
        double y = radius * Math.cos(latRadian) * Math.sin(longRadian);
        double z = radius * Math.sin(latRadian);
        return new CartesianCoordinate(x, y, z);
    }





    protected void checkLatitudeIsValid(double latitude) {
        isValidDouble(latitude);
        if (latitude < -90.0 || latitude > 90.0) {
            throw new IllegalArgumentException("Latitude not vaild");
        }
    }

    protected void checkLongtitudeIsValid(double longitude) {
        isValidDouble(longitude);
        if (longitude < -180.0 || longitude > 180.0) {
            throw new IllegalArgumentException("Longtitude not vaild");
        }

    }


    @Override
    public boolean isEqual(Coordinate other) {
        return isEqual(other.getCartesianCoordinateObject());
    }

    @Override
    protected void assertClassInvariants() {
        checkLatitudeIsValid(latitude);
        checkLongtitudeIsValid(longitude);
    }

}
