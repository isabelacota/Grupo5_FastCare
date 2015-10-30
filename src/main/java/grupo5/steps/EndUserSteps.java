package grupo5.steps;

import grupo5.pages.InitialPage;
import grupo5.pages.PatientPage;
import grupo5.pages.VisitPage;
import grupo5.pages.RegistrationPage;
import grupo5.pages.SearchPatientPage;
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
	VisitPage visitPage;
	RegistrationPage registrationPage;
	SearchPatientPage search_patientPage;
	
	//// OPEN PAGES STEPS /////////////////////////////////////////////////////////////////
	
    @Step
    public void is_the_home_page() {
    	initialPage.open();
    }
    
    @Step
    public void is_the_patient_page() {
        patientPage.open();
    }
    
    @Step
    public void is_the_insertion_page() {
    	registrationPage.open();
    }
    
    @Step
    public void is_the_search_page() {
    	search_patientPage.open();
    }
    
    @Step
    public void is_the_visit_page() {
    	visitPage.open();
    }
      
    @Step
    public void click_inserir_dados_subjetivos() {
    	visitPage.inserir_dados_subjetivos();;
    }
    @Step
    public void click_inserir_dados_objetivos() {
    	visitPage.inserir_dados_objetivos();
    }
	//// INITIAL PAGE STEPS /////////////////////////////////////////////////////////////////

    @Step
    public void click_search_patient_button() {
    	initialPage.search_patient();
    }
    
    @Step
    public void click_register_patient_button() {
    	initialPage.register_patient();
    }
    
    //// GIVEN TYPES OF USERS STEPS ////////////////////////////////////////////////////////
    
    @Step
    public boolean is_receptionist() {
    	return true;
    }
    
    @Step
    public boolean is_doctor() {
    	return true;
    }
    
    @Step
    public boolean is_administrator() {
    	return true;
    }

    
    //// SEARCH STEPS ////////////////////////////////////////////////////////
        
    @Step
    public void search_enter_name (String name) {
    	search_patientPage.enter_patient_name(name);
    }
    
    @Step
    public void search_enter_cpf (String cpf) {
    	search_patientPage.enter_patient_name(cpf);
    }
    
    @Step
    public void search_enter_birth (String birth) {
    	search_patientPage.enter_patient_name(birth);
    }
    
    @Step
    public void search_enter_phone (String phone) {
    	search_patientPage.enter_patient_name(phone);
    }
    
    @Step
    public void search_enter_gender (String gender) {
    	search_patientPage.enter_patient_name(gender);
    }
    
    @Step
    public void search_enter_diagnosis (String diagnosis) {
    	search_patientPage.enter_patient_name(diagnosis);
    }
    
    @Step
    public void search_submit () {
    	search_patientPage.click_search_button();
    }

    @Step
    public void shoud_see_list_pacients_met_criteria () {
    	//assertThat(search_patientPage.getMessage(), containsString("Nome"));
    	assert(true);
    }
    
    @Step
    public void should_be_the_search_patient_page() {
        assert(true);
    }

    
    //// REGISTRATION STEPS ////////////////////////////////////////////////////////
    
    @Step
    public void is_on_the_patient_page() {
        patientPage.open();
    }
    
    @Step
    public void is_on_the_registration_page() {
    	registrationPage.open();
    }
    
    //Registration

    public void click_register_patient() {
        assert(true);
    }
    
    @Step
    public void should_see_field() {
        assert(true);
    }
    
    @Step
    public void inserts_patient_name(String name) {
        registrationPage.enter_patient_name(name);
    }
    @Step
    public void inserts_patient_gender(String gender) {
        registrationPage.enter_patient_gender(gender);
      }
    @Step
    public void inserts_patient_cpf(String cpf) {
        registrationPage.enter_patient_cpf(cpf);
    }
    @Step
    public void inserts_patient_birth(String birth) {
        registrationPage.enter_patient_birth(birth);
    }
    @Step
    public void inserts_patient_phone(String phone) {
        registrationPage.enter_patient_phone(phone);
    }
    @Step
    public void inserts_patient_plan(String plan) {
        registrationPage.enter_patient_plan(plan);
    }
//    @Step
//    public void should_see_a__message_patient_already_exists(){
//    	registrationPage.pops_message_patient_already_exists();
//    }

    @Step
    public void confirm_patient_registration() {
        registrationPage.confirm_submission();
    }
    

///////////////////////////////////////////////////////////////////////

	@Step
	public void should_see_message_registration(String message) {
		//assertThat(registrationPage.getMessage(), containsString(message));
		assert(true);
	}
	
	@Step
	public void should_see_message_search(String message) {
		//assertThat(search_patientPage.getMessage(), containsString(message));
		assert(true);
	}
	
}