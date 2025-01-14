import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

static String expectedText="Employee Education in 2018: Strategies to Watch";

public static void main() {
    class Test1 {
        WebDriver driver;
        @Given("I open the Bright Horizons home page")
        public void openHomePage() {
            driver.get("https://www.brighthorizons.com/");
        }
        public void clickSearchIcon() {
            WebElement searchIcon =
                    driver.findElement(By.xpath("//input[@class=’icon-search bhc-icon-search-rounded’]")).click();
        }
        @Then("the search input box should be displayed")
        public void searchBoxOpenandEnterTextandVerify(expectedText) {
            WebElement searchBox = driver.findElement(By.id("search-field"));
            assertTrue(searchBox.isDisplayed());
            searchBox.sendKeys(expectedText);
            WebElement firstResult = driver.findElement(By.xpath("//div[@class=’ col’]//h3[@class=’title’]")).getText().trim();;
            assertEquals(expectedText, actualText);
        }
    }
}


