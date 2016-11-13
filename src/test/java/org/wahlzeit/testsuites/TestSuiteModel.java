package org.wahlzeit.testsuites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.wahlzeit.model.*;
import org.wahlzeit.model.persistence.AbstractAdapterTest;
import org.wahlzeit.model.persistence.DatastoreAdapterTest;
import org.wahlzeit.model.persistence.GcsAdapterTest;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        {
                //AbstractAdapterTest.class,
                DatastoreAdapterTest.class,
                //GcsAdapterTest.class,
                AccessRightsTest.class,
                CoordinateTest.class,
                FlagReasonTest.class,
                GenderTest.class,
                GuestTest.class,
                LiquorPhotoFactoryTest.class,
                LiquorPhotoManagerTest.class,
                LiquorPhotoTest.class,
                LocationTest.class,
                PhotoFilterTest.class,
                TagsTest.class,
                UserStatusTest.class,
                ValueTest.class
        }
)

public class TestSuiteModel {
}
