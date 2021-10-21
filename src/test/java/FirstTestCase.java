import core.GeneralHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

public class FirstTestCase extends GeneralHelper {

    @Test
    @Description("Erster Testfall")
    @Tag("MyFirstTest")
    public void firstTestCase(){
        System.out.println("FirstTest");
        generalPage.doOpenBrowserWithLink("http://selenium.webtesting.eu/");
        startPage.checkHeaderContributionsIsShown();
        generalPage.clickOnElementWithId("menu-item-134");
        Assertions.assertEquals( "TESTSEITE-KONTAKTFORMULAR", driver.findElement(By.xpath("//h1[contains(text(),'Testseite-Kontaktformular')]")).getText());
        contactPage.checkBusinessIsChecked();
        contactPage.checkPrivateIsNotChecked();
    }


    @Test
    @Tag("MySecondTestcase")
    public void secondTestCase(){
        System.out.println("SecondTest");
        generalPage.doOpenBrowserWithLink("http://selenium.webtesting.eu/");
        startPage.checkHeaderContributionsIsShown();
        generalPage.clickOnElementWithId("menu-item-134");
    }


}
