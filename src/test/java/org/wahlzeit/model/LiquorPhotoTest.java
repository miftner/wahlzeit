package org.wahlzeit.model;


import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.LocalDatastoreServiceTestConfigProvider;

import static junit.framework.TestCase.assertEquals;

public class LiquorPhotoTest {

    @ClassRule
    public static TestRule chain = RuleChain.outerRule(new LocalDatastoreServiceTestConfigProvider());

    @Test
    public void testCreateNoArgument(){
        LiquorPhoto l1 = new LiquorPhoto();
        assertEquals(l1.getCharacteristic(), null);
    }

    @Test
    public void testCreateId(){
        PhotoId testid = PhotoId.getIdFromInt(1337);
        LiquorPhoto l2 = new LiquorPhoto(testid);

        assertEquals(l2.getId(), testid);
    }

    @Test
    public void testCreateIdAndChar(){
        PhotoId testid = PhotoId.getIdFromInt(1337);
        String chara = "Malzig im Abgang";
        LiquorPhoto l3 = new LiquorPhoto(testid, chara);

        assertEquals(l3.getCharacteristic(), chara);
    }

}
