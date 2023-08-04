import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fb_Pages {
    private final WebDriver driver;

    // Locators
    private final By createAccountSection = By.id("section_create_account");
    private final By firstNameInput = By.name("firstname");
    private final By lastNameInput = By.name("lastname");
    private final By mobileOrEmailInput = By.name("reg_email__");
    private final By reenterMobileInput = By.name("reg_email_confirmation__");
    private final By newPasswordInput = By.name("reg_passwd__");
    private final By birthDayDropdown = By.id("day");
    private final By birthMonthDropdown = By.id("month");
    private final By birthYearDropdown = By.id("year");
    private final By genderRadioButton = By.xpath("//input[@name='sex' and @value='2']");
    private final By createAccountButton = By.name("websubmit");

    public FacebookPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCreateAccountSectionDisplayed() {
        return driver.findElement(createAccountSection).isDisplayed();
    }

    public void fillRegistrationForm(String firstName, String lastName, String mobileOrEmail,
                                     String reenterMobile, String password) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(mobileOrEmailInput).sendKeys(mobileOrEmail);
        driver.findElement(reenterMobileInput).sendKeys(reenterMobile);
        driver.findElement(newPasswordInput).sendKeys(password);
    }

    public void updateBirthDate(String day, String month, String year) {
        driver.findElement(birthDayDropdown).sendKeys(day);
        driver.findElement(birthMonthDropdown).sendKeys(month);
        driver.findElement(birthYearDropdown).sendKeys(year);
    }

    public void selectGender() {
        driver.findElement(genderRadioButton).click();
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }
}
