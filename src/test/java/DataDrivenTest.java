import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;
import core.GeneralHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
@Epic("DataTestEpic")
public class DataDrivenTest extends GeneralHelper {
    @DataProvider
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"http://selenium.webtesting.eu/","selenium"},
                {"https://de-de.facebook.com/","facebook"},
                {"https://www.qytera.de/","die experten"}
        };
    }
    @UseDataProvider("dataProvider")
    @Tag("DataTest")
    @Description("Aufruf verschiedener Webseiten")
    @Feature("Aufruf Webseiten")
    @Epic("DataTest")
    @TestTemplate
    public void test(String url, String title){
        generalPage.doOpenBrowserWithLink(url);
        generalPage.assertTabTitle(title);
    }
}


