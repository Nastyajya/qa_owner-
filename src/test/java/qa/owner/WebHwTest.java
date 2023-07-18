package qa.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.WebHwConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class WebHwTest {

    @Test
    public void testRemote() {
        WebHwConfig config = ConfigFactory.create(WebHwConfig.class, System.getProperties());

        assertThat(config.browserName()).isEqualTo("CHROME");
        assertThat(config.browserVersion()).isEqualTo("100.00");
        assertThat(config.browserSize()).isEqualTo("1920x1080");
        assertThat(config.browserVersion()).isEqualTo("100.00");
        assertThat(config.baseUrl()).isEqualTo("https://demoqa.com");
        assertThat(config.remoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hab");
    }

    @Test
    public void testLocal() {
        WebHwConfig config = ConfigFactory.create(WebHwConfig.class, System.getProperties());

        assertThat(config.browserName()).isEqualTo("CHROME");
        assertThat(config.browserVersion()).isEqualTo("100.00");
        assertThat(config.browserSize()).isEqualTo("1920x1080");
        assertThat(config.browserVersion()).isEqualTo("100.00");
    }
}
