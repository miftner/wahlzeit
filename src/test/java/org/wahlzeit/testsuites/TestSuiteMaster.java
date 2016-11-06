package org.wahlzeit.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        {
            TestSuiteHandlers.class,
            TestSuiteModel.class,
            TestSuiteServices.class,
            TestSuiteUtils.class
        }

)

public class TestSuiteMaster {
}
