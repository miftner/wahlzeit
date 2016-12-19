package org.wahlzeit.model.Coordinates;


public class CartesianCoordinate extends AbstractCoordinate {

    private double x;
    private double y;
    private double z;

    public CartesianCoordinate(double x, double y, double z) {

        isValidDouble(x);
        isValidDouble(y);
        isValidDouble(z);

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }


    @Override
    public boolean isEqual(Coordinate other) {
        return this.isEqual(other.getCartesianCoordinateObject());
    }

    public CartesianCoordinate getCartesianCoordinateObject() {
        return this;
    }

    protected double doGetDistance(CartesianCoordinate that) {

        assertCoordinateNotNull(this);
        assertCoordinateNotNull(that);

        double dx = this.x - that.x;
        double dy = this.y - that.y;
        double dz = this.z - that.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

}