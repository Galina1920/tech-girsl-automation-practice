package project.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.pageObjects.BlousesPage;

public class BlousesPageSteps {
    @Given("Blouses page is displayed")
    public void blousesPageIsDisplayed(){
        BlousesPage blousesPage = new BlousesPage();
        Assert.assertTrue(blousesPage.blousesTitleIsDisplayed());
    }

    @When("user adds blouse to cart")
    public void userChooseBlouses() {
        BlousesPage blousesPage = new BlousesPage();
        blousesPage.clickBlouseAddToCartButton();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        BlousesPage blousesPage = new BlousesPage();
        blousesPage.successIconIsDisplayed();
    }
}
