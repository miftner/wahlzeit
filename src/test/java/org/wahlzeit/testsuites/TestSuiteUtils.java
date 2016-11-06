package org.wahlzeit.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.wahlzeit.utils.StringUtilTest;
import org.wahlzeit.utils.VersionTest;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        {
                StringUtilTest.class,
                VersionTest.class
        }
)

public class TestSuiteUtils {
}
