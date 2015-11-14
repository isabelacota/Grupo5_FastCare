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
    
    
    
    @Given("the user is on the subjective data page")
    public void givenTheUserIsOnSubjectiveDataPage() {
        endUser.is_the_subjective_data_page();;
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
    ////AVALIACAO STEPS /////////////////////////////////////
    @Given("the user is on avaliacao page")
    public void givenTheUserIsOnAvaliacaoPage() {
        endUser.is_the_avaliacao_page();
    }
    @When("the user insert the diagnosis '$str'")
    public void whenTheUserInsertTheDiagnosis(String str) {
        endUser.avaliacao_inserts_diagnostico(str);
    }
    @When("the user insert the comments '$str'")
    public void whenTheUserInsertTheAvaliacaoComentarios(String str) {
        endUser.avaliacao_enter_comentario(str);
    }
    
    @Then("a message '$str' should be sent to the user on avaliacao page")
    public void thenMsgShouldBeSentOnAvaliacaoPage(String str) {
        endUser.should_see_avaliacao_confirmation(str);
    }
    ////SUBJETIVOS STEPS ////////////////////////////////////////////////////////
    
    
    
    @When("the user insert the main complaint '$str'")
    public void whenTheUserInsertTheMainComplaint(String str) {
        endUser.inserts_main_complaint(str);
    }
    @When("the user insert the history of present illness '$str'")
    public void whenTheUserInsertHistoryIllness(String str) {
        endUser.inserts_history_illness(str);
    }
    @When("the user insert the symptomatic interrogation '$str'")
    public void whenTheUserInsertSymptomaticInterrogation(String str) {
        endUser.inserts_symptomatic(str);
    }
    @When("the user insert the personal and family history '$str'")
    public void whenTheUserInsertPersonalFamilyHistory(String str) {
        endUser.inserts_personal_family_history(str);
    }
    @When("the user insert the lifestyle and socioeconomic and cultural conditions '$str'")
    public void whenTheUserInsertLifestyleEtc(String str) {
        endUser.inserts_lifestyle(str);
    }
    
    @When("the user insert the orthotics and prosthetics '$str'")
    public void whenTheUserInsertOrthoticsProsthetics(String str) {
        endUser.inserts_orthotics(str);
    }
    @When("the user insert the comments '$str'")
    public void whenTheUserInsertComments(String str) {
        endUser.inserts_comments(str);
    }
    @When("the user confirm the subjetivo submission")
    public void whenTheUserConfirmSubjetivoSubmission() {
        endUser.confirm_subjetivos_submission();
    }
    @Then("a message '$str' should be sent to the user on visit page")
    public void thenSubjMsgShouldBeSentOnSubjPage(String str) {
        endUser.should_see_subjetivos_confirmation(str);
    }
    
    
    ////OBJETIVOS STEPS ////////////////////////////////////////////////////////
    
    @When("the user insert the height '$str'")
    public void whenTheUserInsertTheHeight(String str) {
        endUser.inserts_height(str);
    }
    @When("the user insert the weight '$str'")
    public void whenTheUserInsertWeight(String str) {
        endUser.inserts_weight(str);
    }
    @When("the user insert the temperature '$str'")
    public void whenTheUserInsertTemperature(String str) {
        endUser.inserts_temperature(str);
    }
    @When("the user insert the systolic pressure '$str'")
    public void whenTheUserInsertSystolicPressure(String str) {
        endUser.inserts_s_pressure(str);
    }
    @When("the user insert the diastolic pressure '$str'")
    public void whenTheUserInsertDiastolicPressure(String str) {
        endUser.inserts_d_pressure(str);
    }
    
    @When("the user insert the heart rate '$str'")
    public void whenTheUserInsertHeartRate(String str) {
        endUser.inserts_heart_rate(str);
    }
    
    @When("the user insert the respiratory rate '$str'")
    public void whenTheUserInsertRespiratoryRate(String str) {
        endUser.inserts_respiratory_rate(str);
    }
    @When("the user insert the oxygen saturation '$str'")
    public void whenTheUserInsertOxySaturation(String str) {
        endUser.inserts_oxygen_saturation(str);
    }
    @When("the user insert the gas carbon saturation '$str'")
    public void whenTheUserInsertGasCarbonSaturation(String str) {
        endUser.inserts_gas_carbon_saturation(str);
    }
    @When("the user insert the capillary blood glucose '$str'")
    public void whenTheUserInsertBloodGlucose(String str) {
        endUser.inserts_blood_glucose(str);
    }
    
    @When("the user insert the objective comments '$str'")
    public void whenTheUserInsertObjectivesComments(String str) {
        endUser.inserts_objective_comments(str);
    }
    @When("the user confirm the objective submission")
    public void whenTheUserConfirmObjetivoSubmission() {
        endUser.confirm_objective_submission();
    }
    @Then("a message '$str' should be sent to the user on visit page")
    public void thenSubjMsgShouldBeSentOnObjPage(String str) {
        endUser.should_see_objetivos_confirmation(str);
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
    
    @Then("a success message '$message' should be sent to the user on registration page")
    public void thenASuccessMessageInsertedIsSentToTheUserOnRegistrationPage(String message) {
    	endUser.should_see_success_message_registration(message);
    }
    
    @Then("a success message '$message' should be sent to the user on subjective data page")
    public void thenASuccessMessageInsertedIsSentToTheUserOnSubjectiveDataPage(String message) {
    	endUser.should_see_success_message_subjective_data(message);
    }
    
    @Then("a error message '$message' should be sent to the user on registration page")
    public void thenAErrorMessageInsertedIsSentToTheUserOnRegistrationPage(String message) {
    	endUser.should_see_error_message_registration(message);
    }
    
    @Then("a error message '$message' should be sent to the user on search page")
    public void thenAErrorMessageInsertedIsSentToTheUserOnSearchPage(String message) {
    	endUser.should_see_error_message_search(message);
    }
        
//    @Then("the user sees a message saying that a patient with the same cpf already exists")
//    public void thenAMessagePatientAlreadyExists() {
//        endUser.should_see_a__message_patient_already_exists();
//    }
       




}
