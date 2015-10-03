package grupo5.steps;

import grupo5.pages.InitialPage;
import grupo5.pages.PatientPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

	InitialPage initialPage;
	PatientPage patientPage;

    PatientPage patientPage;

    @Step
    public void enters(String name) {
    	initialPage.enter_pacient_name(name);
    }

    @Step
    public void starts_search_pacient() {
    	initialPage.lookup_pacient();
    }
    
    @Step
    public void click_insert_button() {
    	initialPage.insert_pacient();
    }
    
    @Step
    public void click_exlude_button() {
    	patientPage.exclude_patient();
    }

    @Step
    public void should_see_insert_pacient_form() {
    }
    
    @Step
    public void should_see_the_pacient_data() {
    }

    @Step
    public void is_the_home_page() {
    	initialPage.open();
    }
    
    @Step
    public boolean is_receptionist() {
    	return false;
    }
    
    @Step
    public boolean is_doctor() {
    	return false;
    }
    
    @Step
    public boolean is_administrator() {
    	return false;
    }

    @Step
    public void looks_for_pacient(String name) {
        enters(name);
        starts_search_pacient();
    }

    @Step
    public void is_on_the_patient_page() {
        patientPage.open();
    }
}