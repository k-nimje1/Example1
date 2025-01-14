import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

String expectedText_1="child-care-locator";
public class HomepageNavigationSteps {
    WebDriver driver;
    @Given("I open the Bright Horizons home page")
    public void openHomePage() {
        driver.get("https://www.brighthorizons.com/");
    }
    public void clickSearchIcon() {
        WebElement searchHeader = driver.findElement(By.xpath//nav[@class='nav-shared txt-nav-hierarchy nav-top js-nav-shared js-nav-top']
                                                     //ul[@class='nav-list-wrap']//li[@class='nav-item displayed-desktop']
                                                     //a[@class='btn-nav btn btn-large btn-hollow color-nileblue global_header_findcenter track_cta_click'][contains(text(),'Find a Center')].click();

        String currentURL = driver.getCurrentUrl();
        currentURL.contains(expectedText_1);
    }

    public void searchBoxOpenandEnterTextandVerify(expectedText_1) {
        WebElement searchBox = driver.findElement(By.id("addressInput")); assertTrue(searchBox.isDisplayed());
        searchBox.sendKeys(“New York”);

        WebElement resultCenters = driver.findElement(By.xpath("//div[@class='centerResult infoWindow track_center_select covidOpen']").getCount();
        WebElement resultCount = driver.findElement(By.xpath("//span[@class='resultsNumber']").getText();
        assertEquals(resultCenters, resultCount);

        driver.findElement(By.xpath//div[@class='centerResult infoWindow track_center_select covidOpen'][1].click().
        WebElement resultText= driver.findElement(By.xpath("//div[@class='centerResult infoWindow track_center_select covidOpen']"[1]).getText();
        WebElement resultNme = driver.findElement(By.xpath("//span[@class='mapTooltip__headline']").getText();
        assertEquals(resultText, resultNme);

    }
    driver.quit();
}


