package guru.qa.panevin;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideSerachTest {

    @Test
    void softAssecrtionAndJUnitExistTest () throws InterruptedException {
        Configuration.startMaximized = true;
        open ("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[href=\"/selenide/selenide\"]").click();
        $("[data-content=\"Wiki\"]").click();
        $("#wiki-body").shouldHave(Condition.text("Soft assertions"));
        $("#wiki-body").$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));
    }

}
