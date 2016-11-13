package org.wahlzeit.model;

public class LiquorPhotoManager extends PhotoManager {

    /**
     * Get sure to have only one instance
     */
    private final static LiquorPhotoManager instance = new LiquorPhotoManager();


    public static LiquorPhotoManager getInstance() {
        return instance;
    }
}
