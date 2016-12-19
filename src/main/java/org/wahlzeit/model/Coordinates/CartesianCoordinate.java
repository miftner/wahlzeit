package org.wahlzeit.model.Coordinates;


import java.util.HashMap;


public class CartesianCoordinate extends AbstractCoordinate {

    private double x;
    private double y;
    private double z;

    private static HashMap<CartesianCoordinate, CartesianCoordinate> cartMap = new HashMap<>();

    /**
     * Returns the specific object in the Hashmap and adds it if not found
     * Has to be syncronized in order to avoid race-conditions with put/pull
     * @param x
     * @param y
     * @param z
     * @return
     * returns an Cartesian Object
     */
    public static synchronized CartesianCoordinate getCartesianObject(double x, double y, double z){
        CartesianCoordinate indexObject = new CartesianCoordinate(x,y,z);

        if(cartMap.containsKey(indexObject) == false){
            //Object not yet in the Hashmap
            cartMap.put(indexObject, indexObject);

        }else{
            indexObject = cartMap.get(indexObject);
        }

        return indexObject;
    }

    private CartesianCoordinate(double x, double y, double z) {

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