package org.wahlzeit.model;

public class Coordinate {

    private final double earthRadiusInMeters = 6371000.0;


    //displayed as degree
    private double latitude = 0.0;
    private double longitude = 0.0;

    public Location coordinate;

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

    // AB calculated by ABdegree times
    public double getDistance(Coordinate sourceCoordinates){

        //Define variables
        double oDest, lDest, oSrc, lSrc;

        oDest = this.getLatitude();
        lDest = this.getLongitude();

        oSrc = sourceCoordinates.getLatitude();
        lSrc = sourceCoordinates.getLongitude();

        //Calculate Degree of Source (A) to Destination (B)
        double absin = Math.sin(oSrc) * Math.sin(oDest);
        double abcos = Math.cos(oSrc) * Math.cos(oDest) * Math.cos(lDest - lSrc);
        double abDegree = Math.acos(absin + abcos );
        double abRad = Math.toRadians(abDegree);

        //Calculate the Distance in Meters
        double ab = abRad * earthRadiusInMeters;

        return ab;

    }

}
