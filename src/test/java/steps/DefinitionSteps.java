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
    
    @Given("the user is on the registration page")
    public void givenTheUserIsOnTheRegistrationPage() {
        endUser.is_on_the_registration_page();
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

    //Registration
    @When("the user insert the patient's name")
    public void whenTheUserInsertPatientName() {
        //endUser.insert_patient_name();
    }
    @When("the user insert the patient's gender")
    public void whenTheUserInsertPatientGender() {
        //endUser.insert_patient_gender();
    }
    @When("the user insert the patient's cpf")
    public void whenTheUserInsertPatientCPF() {
        //endUser.insert_patient_CPF();
    }
    @When("the user confirms that he wants to register the patient anyways")
    public void whenTheUserWantsRegisterAnyways() {
        //endUser.register_same_cpf();
    }
    @When("the user insert the patient's birth time and date")
    public void whenTheUserInsertPatientBirth() {
        //endUser.insert_patient_birth();
    }
    @When("the user insert the patient's phone")
    public void whenTheUserInsertPatientPhone() {
        //endUser.insert_patient_phone();
    }
    @When("the user insert the patient's address")
    public void whenTheUserInsertPatientAddress() {
        //endUser.insert_patient_address();
    }
    @When("the user confirm the submission")
    public void whenTheUserConfirmSubmission() {
        //endUser.insert_patient_confirm_submission();
    }
    
    @When("the user click on \"Register a patient")
    public void whenTheUserClickOnRegisterPatient() {
        //endUser.click_register_patient();
    }
    
    //Registration then

 
    @Then("the user should see a field to insert the patient's full name")
    public void thenTheyShouldSeeAFieldToPatientName() {
        //endUser.should_see_field_patient_name();
    }
    @Then("the user should see a field to insert the patient's gender")
    public void thenTheyShouldSeeAFieldToPatientGender() {
        //endUser.should_see_field_patient_gender();
    }
    @Then("the user should see a field to insert the patient's cpf")
    public void thenTheyShouldSeeAFieldToPatientCPF() {
        //endUser.should_see_field_patient_cpf();
    }
    @Then("the user should see a field to insert the patient's birth time and date")
    public void thenTheyShouldSeeAFieldToPatientBirth() {
        //endUser.should_see_field_patient_birth();
    }
    @Then("the user should see a field to insert the patient's phone")
    public void thenTheyShouldSeeAFieldToPatientPhone() {
        //endUser.should_see_field_patient_phone();
    }
    @Then("the user should see a field to insert the patient's address")
    public void thenTheyShouldSeeAFieldToPatientAddress() {
        //endUser.should_see_field_patient_address();
    }
    @Then("the user should see a page asking for confirmation to submit")
    public void thenTheyShouldSeeAPageAskingConfirmationToSubmit() {
        //endUser.should_see_page_confirmation_submit();
    }
    @Then("the patient is added to the database")
    public void thenThePatientIsAddedToTheDatabase() {
        //patient added to the database
    }
    @Then("a message patient inserted should be sent to the user")
    public void thenAMessageInsertedIsSentToTheUser() {
        //endUser.should_see_a_message_user_inserted();
    }
    
//    @Then("the user sees a message saying that a patient with the same cpf already exists")
//    public void thenAMessagePatientAlreadyExists() {
//        endUser.should_see_a__message_patient_already_exists();
//    }

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
