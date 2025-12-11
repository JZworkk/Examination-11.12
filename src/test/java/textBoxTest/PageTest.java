package textBoxTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class OpenTextBoxPageTest {
    private WebDriver driver;
    private TextBoxPage textBoxPage;
    private String textinput = "Зинькевич Ю.Н.";
    private String password = "testtest";
    private String textarea = "Зинькевич Ю.Н.";
    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
    }

    @Test
    public void step_1(){
        /*textBoxPage.setFullName("Testov Test");
        textBoxPage.setEmail("test@test.com");
        textBoxPage.setCurrentAddress("Test 1");
        textBoxPage.setPermanentAddress("Test 2");
        textBoxPage.clickSubmit();*/
        textBoxPage.setAllFieldAndSubmit(fullName,email,currentAddress, permanentAddress);
        textBoxPage.getOutputName();
        textBoxPage.getOutputEmail();
        textBoxPage.getOutputCurAddr();
        textBoxPage.getOutputPermAddr();
        Assert.assertEquals(textBoxPage.getOutputName(),"Name:"+fullName);
        Assert.assertEquals(textBoxPage.getOutputEmail(), "Email:"+email);
        Assert.assertEquals(textBoxPage.getOutputCurAddr(), "Current Address :"+currentAddress);
        Assert.assertEquals(textBoxPage.getOutputPermAddr(),"Permananet Address :"+permanentAddress);
    }
