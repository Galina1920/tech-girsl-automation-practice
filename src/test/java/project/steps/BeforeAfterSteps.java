package project.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import project.browser.Driver;

import static project.browser.Driver.runDriver;


public class BeforeAfterSteps {
    @Before
    public void beforeStep()  {
        runDriver();
    }



    @After
    public void afterStep(){
        Driver.quitDriver();
    }

}
