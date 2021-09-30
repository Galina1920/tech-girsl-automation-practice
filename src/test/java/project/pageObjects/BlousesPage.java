package project.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static project.browser.Driver.getDriver;

public class BlousesPage {
    @FindBy(xpath = "//span[contains(text(),'Blouses')]")
    private WebElement blousesTitle;

    @FindBy(xpath = "//a[contains(text(),'Blouse')]/../../div[@class='button-container']/a[@title='Add to cart']")
    private WebElement blouseAddToCartButton;
    @FindBy(xpath = "//i[@class='icon-ok']")
    private WebElement successIcon;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div")
    private WebElement blouseArea;

    public BlousesPage(){
        PageFactory.initElements(getDriver(),this);
    }
    public boolean blousesTitleIsDisplayed(){
        return blousesTitle.isDisplayed();
    }
    public void clickBlouseAddToCartButton(){
        blouseAddToCartButton.click();
    }
    public boolean successIconIsDisplayed(){
        //wait until element to be displayed
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(successIcon));

        return  successIcon.isDisplayed();
    }

    public void hoverBlouseArea() {
        Actions action = new Actions(getDriver());
        action.moveToElement(blouseArea).perform();
    }
}
