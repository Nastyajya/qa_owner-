package qa.owner;


import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.TypConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class TypTest {
 @Test
    public void testInteger() {
     System.setProperty("integer", "10");
        TypConfig config = ConfigFactory.create(TypConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }
}
