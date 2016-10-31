package org.wahlzeit.model;

public class Coordinate {

    private final double earthRadiusInMeters = 6371000.0;


    //displayed as degree
    private double latitude = 0.0;
    private double longitude = 0.0;

    //public Location coordinate;

    public Coordinate(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }


    //
    // Distance from this Coordinate to the sourceCoordinates returned in Meters
    public double getDistance(Coordinate sourceCoordinates){

        //Define variables o = omega, l = lambda
        double oDest, lDest, oSrc, lSrc;

        oDest = Math.toRadians(this.getLatitude());
        lDest = Math.toRadians(this.getLongitude());

        oSrc = Math.toRadians(sourceCoordinates.getLatitude());
        lSrc = Math.toRadians(sourceCoordinates.getLongitude());

        //double deltaOmega = Math.abs(oDest-oSrc);
        double deltaLambda = Math.abs(lDest-lSrc);

        double up = Math.sqrt(
                                ( Math.pow(Math.cos(oSrc)* Math.sin(deltaLambda), 2) )  +  (  Math.pow(Math.cos(oDest)*Math.sin(oSrc)-Math.sin(oDest)*Math.cos(oSrc)*Math.cos(deltaLambda),2)  )
                            );
        double down = Math.sin(oDest) * Math.sin(oSrc) + Math.cos(oDest) * Math.cos(oSrc)* Math.cos(deltaLambda);

        //Calculate Degree of Source (A) to Destination (B)
        double centralangle = Math.atan(up / down);

        double distanceInMeters = centralangle * earthRadiusInMeters;

        return distanceInMeters;

    }

}