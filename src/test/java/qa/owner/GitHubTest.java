package qa.owner;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GitHubTest extends TestBase {

    @Test
    void TestSolutions() {
        step("open page", () -> {
            open("https://github.com/");
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



