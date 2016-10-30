package org.wahlzeit.model;

public class Location {

    public Coordinate coordinates;


    //Constuctor
    public Location(Coordinate coordinate){
        this.coordinates = coordinate;
    }


    public Coordinate getCoordinates(){
        return this.coordinates;
    }

    public boolean setCoordinates(Coordinate newCoordinates){
        if(newCoordinates.getLongitude() == this.getCoordinates().getLongitude() && newCoordinates.getLatitude() == this.getCoordinates().getLatitude()){
            return false;
        }else{
            this.coordinates = newCoordinates;
            return true;
        }
    }

}
