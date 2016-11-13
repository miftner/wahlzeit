package org.wahlzeit.model;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.LocalDatastoreServiceTestConfigProvider;

import static junit.framework.TestCase.assertEquals;

public class LiquorPhotoFactoryTest {


    @ClassRule
    public static TestRule chain = RuleChain.outerRule(new LocalDatastoreServiceTestConfigProvider());


    /**
     * Check if Singleton is working correctly
     */
    @Test
    public void testCreate(){
        LiquorPhotoFactory f1 = LiquorPhotoFactory.getInstance();
        LiquorPhotoFactory f2 = LiquorPhotoFactory.getInstance();

        assertEquals(f1,f2);
    }
}
