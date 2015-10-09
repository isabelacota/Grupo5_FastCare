package grupo5.steps;

import grupo5.pages.InitialPage;
import grupo5.pages.PatientPage;
import grupo5.pages.RegistrationPage;
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
	RegistrationPage registrationPage;

    //PatientPage patientPage;

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
    public void is_the_home_page() {
    	initialPage.open();
    }
    
    @Step
    public void is_on_the_patient_page() {
        patientPage.open();
    }
    
    @Step
    public void is_on_the_registration_page() {
    	registrationPage.open();
    }
    
    //Registration
    @Step
    public void inserts_patient_name(String name) {
        registrationPage.enter_pacient_name(name);
        registrationPage.submit_pacient_name();
    }
    @Step
    public void inserts_patient_gender(String gender) {
        registrationPage.enter_pacient_gender(gender);
        registrationPage.submit_pacient_gender();
    }
    @Step
    public void inserts_patient_cpf(String cpf) {
        registrationPage.enter_pacient_cpf(cpf);
        registrationPage.submit_pacient_cpf();
    }
    @Step
    public void inserts_patient_birth(String birth) {
        registrationPage.enter_pacient_birth(birth);
        registrationPage.submit_pacient_birth();
    }
    @Step
    public void inserts_patient_phone(String phone) {
        registrationPage.enter_pacient_phone(phone);
        registrationPage.submit_pacient_phone();
    }
//    @Step
//    public void should_see_a__message_patient_already_exists(){
//    	registrationPage.pops_message_patient_already_exists();
//    }
    @Step
    public void register_same_cpf() {
        registrationPage.register_same_cpf();
    }
    @Step
    public void confirm_patient_registration() {
        registrationPage.confirm_submission();
    }
    
}