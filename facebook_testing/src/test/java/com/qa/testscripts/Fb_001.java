import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb_001 {

    private WebDriver driver;
    private FacebookPage facebookPage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        facebookPage = new FacebookPage(driver);
    }

    @Test
    public void testFacebookRegistration() {
        // Open Chrome browser and navigate to Facebook
        driver.get("http://www.fb.com");

        // Verify that the page is redirected to "http://www.facebook.com"
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://www.facebook.com", "Page redirection failed.");

        // Verify that the "Create an account" section is displayed
        Assert.assertTrue(facebookPage.isCreateAccountSectionDisplayed(),
                "Create an account section is not displayed.");

        // Fill in the registration form
        facebookPage.fillRegistrationForm("John", "Doe", "johndoe@example.com",
                "johndoe@example.com", "password123");

        // Update the date of birth
        facebookPage.updateBirthDate("10", "August", "1990");

        // Select gender
        facebookPage.selectGender();

        // Click on "Create an account"
        facebookPage.clickCreateAccountButton();

        // Verify that the account is created successfully (Add relevant verification steps here)

    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
