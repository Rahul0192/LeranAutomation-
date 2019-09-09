package PageobjectTest;

import Driver_Runner.WebBrowser;
import PageObject.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest  extends WebBrowser {


    Homepage objHomePage=null;

    @BeforeMethod
    public void initElements(){
        objHomePage=PageFactory.initElements(driver,Homepage.class);

    }

    @Test
    public void searchTest() {
        String actualValue = objHomePage.search();
        System.out.println(actualValue);
        String expectedValue = "New Arrival";;
        Assert.assertEquals(actualValue,expectedValue);

    }

}

