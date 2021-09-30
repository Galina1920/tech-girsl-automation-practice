package project.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import project.pageObjects.ShopHomePage;

import static project.browser.Driver.getDriver;

public class ShopHomePageSteps {
    @Given("shop page is displayed")
    public void shopPageIsDisplayed(){
        getDriver().get("http://automationpractice.com/index.php");
        ShopHomePage shopHomePage = new ShopHomePage();
        Assert.assertTrue(shopHomePage.logoIsDisplayed());
    }

    @And("user hovers the Women tab")
    public void userHoversTheWomenTab() {
        ShopHomePage shopHomePage = new ShopHomePage();
        shopHomePage.hoverTabWomen();
    }

    @And("user clicks on Blouses link")
    public void userClicksOnBlousesLink() {
        ShopHomePage shopHomePage = new ShopHomePage();
        shopHomePage.clickBlousesLink();
    }
}
