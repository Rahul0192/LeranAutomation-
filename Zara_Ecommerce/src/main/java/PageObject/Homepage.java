package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
    WebDriver driver = null;

    @FindBy(how = How.ID, using = "main-search")
    WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "menu__search_submit")
    WebElement enterButton;

    @FindBy(how = How.CLASS_NAME, using = "new-product")
    WebElement newitems;

    public String search(){
        searchBox.sendKeys("Pant");
        enterButton.click();
        String actualValue = newitems.getText();
        return actualValue;
    }

}

