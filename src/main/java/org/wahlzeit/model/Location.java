package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Ignore;
import org.wahlzeit.model.Coordinates.Coordinate;

public class Location {


    @Ignore
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
        if(newCoordinates == null) {
            throw new IllegalArgumentException("newCoordinates has to be not null");
        }else{
            this.coordinates = newCoordinates;
        }
    }

}
