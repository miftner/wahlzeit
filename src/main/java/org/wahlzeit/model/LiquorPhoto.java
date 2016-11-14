package org.wahlzeit.model;


import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class LiquorPhoto extends Photo {

protected String characteristic;

 /**
  * Get Default id from system and pipe it to constructor
  */
 public LiquorPhoto(){
  this(PhotoId.getNextId(), null);
 }

 /**
  * Set custom id but no characteristic
  * @param id
  */
 public LiquorPhoto(PhotoId id){
  this(id, null);
 }

 /**
  * Default Constructor
  * @param id
  * @param newCharacteristic
  */
 public LiquorPhoto(PhotoId id, String newCharacteristic){
  super(id);
  this.characteristic = newCharacteristic;
 }


 public void setCharacteristic(String newChar){
  this.characteristic = newChar;
 }

 public String getCharacteristic(){
  return this.characteristic;
 }

}
