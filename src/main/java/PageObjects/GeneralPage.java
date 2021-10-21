package PageObjects;

import core.GeneralHelper;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class GeneralPage extends GeneralHelper {
    public static final GeneralPage generalPage = new GeneralPage();
    public static GeneralPage getInstance(){
        return generalPage;
    }

    @Step("Öffne die Url {url}")
    public void doOpenBrowserWithLink(String url){
        driver.get(url);
    }

    @Step("Klicke auf das Element mit der id: {id}")
    public void clickOnElementWithId(String id){
        driver.findElement(By.id(id)).click();
    }

    @Step("Prüfe ob der Tabtitle {title} enthält")
    public void assertTabTitle(String title){
        Assertions.assertTrue(driver.getTitle().toLowerCase().contains(title));
    }

}
