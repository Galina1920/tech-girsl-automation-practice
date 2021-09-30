package project.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static project.browser.Driver.getDriver;

public class ShopHomePage {
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    private WebElement logo;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement tabWomen;
    @FindBy(xpath = "//a[@title='Blouses']")
    private WebElement blousesLink;
    public ShopHomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void clickLogo(){
        logo.click();
    }
    public boolean logoIsDisplayed(){
        return logo.isDisplayed();
    }
    public void clickTabWomen(){
        tabWomen.click();
    }
    public void hoverTabWomen(){
        Actions action = new Actions(getDriver());
        action.moveToElement(tabWomen).perform();
    }

    public void clickBlousesLink(){
        blousesLink.click();
    }

}

