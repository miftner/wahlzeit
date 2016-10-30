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

    public void setCoordinates(Coordinate newCoordinates){
        if(newCoordinates.getLongitude() == this.getCoordinates().getLongitude() && newCoordinates.getLatitude() == this.getCoordinates().getLatitude()){
           throw new IllegalArgumentException("Coordinates don't differ");
        }else{
            this.coordinates = newCoordinates;
        }
    }

}
