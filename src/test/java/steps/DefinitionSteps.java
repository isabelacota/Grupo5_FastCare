package steps;

import grupo5.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the initial page")
    public void givenTheUserIsOnTheInitialPage() {
        endUser.is_the_home_page();
    }

    @Given("the user is on the patient page")
    public void givenTheUserIsOnThePatientPage() {
        endUser.is_on_the_patient_page();
    }
    
    @Given("the user is on buscar paciente page")
    public void givenTheUserIsOnBuscarPacientePage() {
        //endUser.is_the_buscar_paciente_page();
    }
    
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
    
    @When("the user clicks on 'Buscar Paciente'")
    public void whenTheUserClicksBuscarPaciente(String name) {
        endUser.looks_for_pacient(name);
    }

    @When("the user looks up a pacient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth' or diagnosis '$diagnosis'")
    public void whenTheDoctorLooksUpPacient(String name, String cpf, String phone, String gender, String birth, String diagnosis) {
        //endUser.looks_for_pacient(name, cpf, phone, gender, birth, diagnosis);
    }
    
    @When("the user looks up a pacient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth'")
    public void whenTheReceptionistLooksUpPacient(String name, String cpf, String phone, String gender, String birth, String diagnosis) {
        //endUser.looks_for_pacient(name, cpf, phone, gender, birth);
    }
    
    @Given("the user is a doctor")
    public void givenTheUserIsADoctor() {
        assert(endUser.is_doctor());
    }

    @When("the user looks up a pacient name '$name'")
    public void whenTheUserLooksUpThePacientName(String name) {
        endUser.looks_for_pacient(name);
    }

    @When("the user clicks to update the patient data")
    public void whenTheUserClicksToUpdateThePatientData() {
        // TODO
    }
    
    @When("the user click the insert pacient button")
    public void whenTheUserClickTheInsertPacientButton() {
        endUser.click_insert_button();
    }

    //Registration - when
    @When("the user insert the patient's name")
    public void whenTheUserInsertPatientName() {
        endUser.inserts_patient_name("joao");
    }
    @When("the user insert the patient's gender")
    public void whenTheUserInsertPatientGender() {
        endUser.inserts_patient_gender("male");
    }
    @When("the user insert the patient's cpf")
    public void whenTheUserInsertPatientCPF() {
        endUser.inserts_patient_cpf("12345");
    }
    @When("the user insert the patient's birth time and date")
    public void whenTheUserInsertPatientBirth() {
    	endUser.inserts_patient_birth("dezembro");
    }
    @When("the user insert the patient's phone")
    public void whenTheUserInsertPatientPhone() {
    	endUser.inserts_patient_phone("192222222");
    }
   
    @When("the user confirm the submission")
    public void whenTheUserConfirmSubmission() {
        endUser.confirm_patient_registration();
    }
    
    @When("the user click on Register a patient")
    public void whenTheUserClickOnRegisterPatient() {
       endUser.click_register_patient();
    }
    
    //Registration then

 
    @Then("the user should see a field to insert the patient's full name")
    public void thenTheyShouldSeeAFieldToPatientName() {
    	endUser.should_see_field();
        //endUser.should_see_field_patient_name();
    }
    @Then("the user should see a field to insert the patient's gender")
    public void thenTheyShouldSeeAFieldToPatientGender() {
    	endUser.should_see_field();
        //endUser.should_see_field_patient_gender();
    }
    @Then("the user should see a field to insert the patient's cpf")
    public void thenTheyShouldSeeAFieldToPatientCPF() {
    	endUser.should_see_field();
        //endUser.should_see_field_patient_cpf();
    }
    @Then("the user should see a field to insert the patient's birth time and date")
    public void thenTheyShouldSeeAFieldToPatientBirth() {
    	endUser.should_see_field();
        //endUser.should_see_field_patient_birth();
    }
    @Then("the user should see a field to insert the patient's phone")
    public void thenTheyShouldSeeAFieldToPatientPhone() {
    	endUser.should_see_field();
        //endUser.should_see_field_patient_phone();
    }
    @Then("the user should see a page asking for confirmation to submit")
    public void thenTheyShouldSeeAPageAskingConfirmationToSubmit() {
    	endUser.should_see_field();
        //endUser.should_see_page_confirmation_submit();
    }
    @Then("the patient is added to the database")
    public void thenThePatientIsAddedToTheDatabase() {
    	endUser.should_see_field();

        //patient added to the database
    }
    @Then("a message patient inserted should be sent to the user")
    public void thenAMessageInsertedIsSentToTheUser() {
    	endUser.should_see_field();
        //endUser.should_see_a_message_user_inserted();
    }
    
    

    @Then("they should see a list of pacients that met that criteria")
    public void thenTheyShouldSeeListPacientsMetCriteria() {
        //endUser.shoud_see_list_pacients_met_criteria();
    }
    
    @Then("the user is on buscar paciente page")
    public void thenTheyShouldBeBuscarPacientePage() {
        //endUser.should_be_buscar_paciente_page();
    }
    
    @Then("they should see the pacient data")
    public void thenTheyShouldSeeThePacientData() {
        endUser.should_see_the_pacient_data();
    }
    
    @Then("an event must be inserted into audit log")
    public void MustInsertEventAuditLog() {
        //endUser.must_insert_event_audit_log();
    }

    @Then("the patient data is updated on the database")
    public void thenThePatientDataIsUpdatedOnTheDatabase() {
        // TODO
    }

}
