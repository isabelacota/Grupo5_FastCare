package mc437.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import mc437.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the initial page")
    public void givenTheUserIsOnTheInitialPage() {
        endUser.is_the_home_page();
    }
    
    @Given("the user is receptionist or doctor")
    public void givenTheUserIsReceptionistOrDoctor() {
        assert(endUser.is_receptionist() || endUser.is_doctor()); 
    }

    @When("the user looks up a pacient name '$name'")
    public void whenTheUserLooksUpThePacientName(String name) {
        endUser.looks_for_pacient(name);
    }
    
    @When("the user click the insert pacient button")
    public void whenTheUserClickTheInsertPacientButton() {
        endUser.click_insert_button();
    }

    @Then("they should see a form to enter the pacient data")
    public void thenTheyShouldSeeAFormToEnterPacientData() {
        endUser.should_see_insert_pacient_form();
    }
    
    @Then("they should see the pacient data")
    public void thenTheyShouldSeeThePacientData() {
        endUser.should_see_the_pacient_data();
    }

}
