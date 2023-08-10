package qa.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.WebConfig;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class GitHubTest extends TestBase {


    @Test
    void TestSolutions() {
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        step("open page", () -> {
            open(config.baseUrl());
        });
        step("point to Solutions and click", () -> {
            $(byTagAndText("button", "Solutions")).hover();
            $("[href='/enterprise']").click();
        });
        step("check text", () -> {
            $(".application-main").shouldHave(text("Build like the best"));
        });
    }
}



