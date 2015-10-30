package grupo5.jbehave;

import grupo5.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;
    
    
    //// GIVEN PAGES STEPS /////////////////////////////////////////////////////////////////

    @Given("the user is on the initial page")
    public void givenTheUserIsOnTheInitialPage() {
        endUser.is_the_home_page();
    }

    @Given("the user is on the patient page")
    public void givenTheUserIsOnThePatientPage() {
        endUser.is_on_the_patient_page();
    }
    
    @Given("the user is on the registration page")
    public void givenTheUserIsOnTheRegistrationPage() {
        endUser.is_on_the_registration_page();
    }
    
    @Given("the user is on buscar paciente page")
    public void givenTheUserIsOnBuscarPacientePage() {
        //endUser.is_the_buscar_paciente_page();
        endUser.is_the_patient_page();
    }
    
    @Given("the user is on the insertion page")
    public void givenTheUserIsOnInsertionPage() {
        endUser.is_the_insertion_page();
    }
    
    @Given("the user is on the search page")
    public void givenTheUserIsOnSearchPage() {
        endUser.is_the_search_page();;
    }
    
    @Given("the user is on the visit page")
    public void givenTheUserIsOnVisitPage() {
        endUser.is_the_visit_page();;
    }
    
    //// GIVEN TYPES OF USERS STEPS ////////////////////////////////////////////////////////
       
    @Given("the user is receptionist")
    public void givenTheUserIsReceptionist() {
        assert(endUser.is_receptionist()); 
    }
    
    @Given("the user is doctor")
    public void givenTheUserIsDoctor() {
        assert(endUser.is_doctor()); 
    }
    
    @Given("the user is receptionist or doctor")
    public void givenTheUserIsReceptionistOrDoctor() {
        assert(endUser.is_receptionist() || endUser.is_doctor()); 
    }
    
    //// LOG STEPS ////////////////////////////////////////////////////////
    
    @Then("an event is added to the audit log")
    public void MustInsertEventAuditLog() {
    	assert(false);
        //endUser.must_insert_event_audit_log();
    }
    
    ////SUBJETIVOS STEPS ////////////////////////////////////////////////////////
    @When("When the user clicks on 'Inserir dados subjetivos'")
    public void whenTheUserClicksOnInserirDadosSubjetivos() {
        endUser.click_inserir_dados_subjetivos();
    }
    ////OBJETIVOS STEPS ////////////////////////////////////////////////////////
    @When("When the user clicks on 'Inserir dados objetivos'")
    public void whenTheUserClicksOnInserirDadosObjetivos() {
        endUser.click_inserir_dados_objetivos();
    }
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
    

    //// SEARCH STEPS /////////////////////////////////////////////////////////////////
    
    @When("the user clicks on search patient button")
    public void whenTheUserClicksSearchPatient() {
        endUser.click_search_patient_button();
    }
    
    @Then("the user should be on search patient page")
    public void thenShouldBeSearchPatientPage() {
        endUser.should_be_the_search_patient_page();
    }
    
    @When("the doctor looks up a patient name '$name'")
    public void whenTheDoctorLooksUpPacientName(String name) {
        endUser.search_enter_name(name);
        endUser.search_submit();
    }
    
    @When("the doctor looks up field '$name'")
    public void whenTheDoctorLooksUpField(String name) {
        endUser.search_enter_name(name);
        endUser.search_submit();
    }

    @When("the doctor looks up a patient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth'")
    public void whenTheDoctorLooksUpPacient(String name, String cpf, String phone, String gender, String birth) {
        if (name != "")
        	endUser.search_enter_name(name);
        if (cpf != "")
        	endUser.search_enter_cpf(cpf);
        if (phone != "")
        	endUser.search_enter_phone(phone);
        if (gender != "")
        	endUser.search_enter_gender(gender);
        if (birth != "")
        	endUser.search_enter_birth(birth);
        endUser.search_submit();
    }
    
    @When("the receptionist looks up a pacient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth'")
    public void whenTheReceptionistLooksUpPacient(String name, String cpf, String phone, String gender, String birth) {
        endUser.search_enter_name(name);
        endUser.search_enter_cpf(cpf);
        endUser.search_enter_phone(phone);
        endUser.search_enter_gender(gender);
        endUser.search_enter_birth(birth);
        endUser.search_submit();
    }
    
    @Then("they should see a list of patients that met that criteria")
    public void thenTheyShouldSeeListPacientsMetCriteria() {
        endUser.shoud_see_list_pacients_met_criteria();
    }
    
    
    //// UPDATE STEPS /////////////////////////////////////////////////////////////////
    

    @When("the user clicks to update the patient data")
    public void whenTheUserClicksToUpdateThePatientData() {
        // TODO
    }
    
    @Then("the patient data is updated on the database")
    public void thenThePatientDataIsUpdatedOnTheDatabase() {
        // TODO
    }
    
    
    //// REGISTER STEPS /////////////////////////////////////////////////////////////////
    
    @When("the user click the register patient button")
    public void whenTheUserClickTheInsertPatientButton() {
        endUser.click_register_patient_button();
    }

    //Registration - when
    @When("the user insert the patient's name '$name'")
    public void whenTheUserInsertPatientName(String name) {
        endUser.inserts_patient_name(name);
    }
    @When("the user insert the patient's gender '$gender'")
    public void whenTheUserInsertPatientGender(String gender) {
        endUser.inserts_patient_gender(gender);
    }
    @When("the user insert the patient's cpf '$cpf'")
    public void whenTheUserInsertPatientCPF(String cpf) {
        endUser.inserts_patient_cpf(cpf);
    }

    @When("the user insert the patient's birth date '$birth'")
    public void whenTheUserInsertPatientBirth(String birth) {
    	endUser.inserts_patient_birth(birth);
    	
    }
    
    @When("the user insert the patient's health insurance plan '$plan'")
    public void whenTheUserInsertHealthInsurancePlan(String plan) {
    	endUser.inserts_patient_plan(plan);
    	
    	
    }
    @When("the user insert the patient's phone '$phone'")
    public void whenTheUserInsertPatientPhone(String phone) {
    	endUser.inserts_patient_phone("192222222");
    }
   
    @When("the user confirm the submission")
    public void whenTheUserConfirmSubmission() {
        endUser.confirm_patient_registration();
    }
    
    @When("the user click on \"Register a patient")
    public void whenTheUserClickOnRegisterPatient() {
       endUser.click_register_patient();
    }
    
    //Registration then

    @Then("the user should see a page asking for confirmation to submit")
    public void thenTheyShouldSeeAPageAskingConfirmationToSubmit() {
    	assert(false);
        //endUser.should_see_page_confirmation_submit();
    }
    @Then("the patient is added to the database")
    public void thenThePatientIsAddedToTheDatabase() {
    	assert(false);
        //patient added to the database
    }
    
    @Then("a message '$message' should be sent to the user on registration page")
    public void thenAMessageInsertedIsSentToTheUserOnRegistrationPage(String message) {
    	endUser.should_see_message_registration(message);
    }
    
    @Then("a message '$message' should be sent to the user on search page")
    public void thenAMessageInsertedIsSentToTheUserOnSearchPage(String message) {
    	endUser.should_see_message_search(message);
    }

    
//    @Then("the user sees a message saying that a patient with the same cpf already exists")
//    public void thenAMessagePatientAlreadyExists() {
//        endUser.should_see_a__message_patient_already_exists();
//    }
       




}
