package methods;

import org.junit.Assert;

public class assertmethod {

    public void assertionmethod() {
        try {
            Assert.assertTrue(false);
        } catch (AssertionError error) {
            Assert.fail("Count MisMatch");
        }
    }
}
