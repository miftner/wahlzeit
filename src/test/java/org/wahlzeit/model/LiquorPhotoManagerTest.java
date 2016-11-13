package org.wahlzeit.model;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.LocalDatastoreServiceTestConfigProvider;

import static junit.framework.TestCase.assertEquals;

public class LiquorPhotoManagerTest {

    @ClassRule
    public static TestRule chain = RuleChain.outerRule(new LocalDatastoreServiceTestConfigProvider());

    /**
     * Check if Singleton is working correctly
     */
    @Test
    public void testCreate(){
        LiquorPhotoManager m1 = LiquorPhotoManager.getInstance();
        LiquorPhotoManager m2 = LiquorPhotoManager.getInstance();

        assertEquals(m1,m2);
    }
}
