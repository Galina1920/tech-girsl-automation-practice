package project.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static project.browser.Driver.getDriver;

public class BlousesPage {
    @FindBy(xpath = "//span[contains(text(),'Blouses')]")
    private WebElement blousesTitle;

    @FindBy(xpath = "//a[contains(text(),'Blouse')]/../../div[@class='button-container']/a[@title='Add to cart']")
    private WebElement blouseAddToCartButton;
    @FindBy(xpath = "//i[@class='icon-ok']")
    private WebElement successIcon;
    public BlousesPage(){
        PageFactory.initElements(getDriver(),this);
    }
    public boolean blousesTitleIsDisplayed(){
        return blousesTitle.isDisplayed();
    }
    public void clickBlouseAddToCartButton(){
        Actions action = new Actions(getDriver());
        action.moveToElement(blouseAddToCartButton).click();
    }
    public boolean successIconIsDisplayed(){
        return  successIcon.isDisplayed();
    }
}
