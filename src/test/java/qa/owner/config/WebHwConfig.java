package qa.owner.config;

import org.aeonbits.owner.Config;

    @Config.Sources({
            "classpath:${selenoid}.properties",
            "classpath:local.properties",
    })

    public interface WebHwConfig extends Config {

        @Key("browserName")
        @DefaultValue("CHROME")
        String browserName();

        @Key("browserVersion")
        @DefaultValue("100.00")
        String browserVersion();

        @Key("browserSize")
        @DefaultValue("1920x1080")
        String browserSize();

        @Key("baseUrl")
        @DefaultValue("https://demoqa.com")
        String baseUrl();


        @Key("remote")
        @DefaultValue("true")
        String remote();

        @Key("remoteUrl")
        @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hab")
        String remoteUrl();

    }

