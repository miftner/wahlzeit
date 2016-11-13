package org.wahlzeit.model;

public class LiquorPhotoFactory extends PhotoFactory{

    /**
     * Make instance of factory accessible without exposing the constructor
     * @return
     */
    public static LiquorPhotoFactory getInstance(){
        return instance;
    }

    private static LiquorPhotoFactory instance = new LiquorPhotoFactory();


    public Photo createPhoto(){
        return new LiquorPhoto();
    }

    public LiquorPhoto createPhoto(PhotoId id) {
        return new LiquorPhoto(id);
    }
}
