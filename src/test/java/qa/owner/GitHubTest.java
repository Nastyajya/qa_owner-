package qa.owner;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    @Test
    void checkInscription() {
        open("https://github.com");
        $(".HeaderMenu-link").hover().shouldHave("")

    }
}
