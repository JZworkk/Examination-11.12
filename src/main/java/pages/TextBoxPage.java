package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public By header = By.xpath("//div[@class='col-md-4 py-2']");
    public By textinputLocator = By.id("my-text-id");
    public By passwordLocator = By.name("my-password");
    public By textareaLocator = By.id("my-textarea");

    public void settextinput(String textInput){

        driver.findElement(textinputLocator).sendKeys(textInput);
    }
    public void setpassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);

        public void settextarea(String textarea) {
            driver.findElement(textareaLocator).sendKeys(textarea);

