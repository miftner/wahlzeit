package org.wahlzeit.model;

public class Location {

    protected Coordinate coordinates;


    //Constuctor
    public Location(Coordinate coordinate){
        if(coordinate == null){
            throw new IllegalArgumentException("Coordinate is null");
        }else{
            this.coordinates = coordinate;
        }

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
