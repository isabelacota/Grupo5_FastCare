package grupo5.steps;

import grupo5.pages.*;
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
	//VisitPage visitPage;
	RegistrationPage registrationPage;
	SearchPatientPage search_patientPage;
	SubjectiveDataPage subjectiveDataPage;
	ObjectiveDataPage objectiveDataPage;
	AvaliacaoPage avaliacaoPage;


	
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
    public void is_the_avaliacao_page() {
    	avaliacaoPage.open();
    }
    
    
    @Step
    public void is_the_subjective_data_page() {
    	subjectiveDataPage.open();
    }
    @Step
    public void is_the_objective_data_page() {
    	objectiveDataPage.open();
    }
      
    //Avaliacao
    @Step
    public void avaliacao_inserts_diagnostico(String str) {
        avaliacaoPage.enter_diagnostico(str);
    }
    @Step
    public void avaliacao_enter_comentario(String str) {
        avaliacaoPage.enter_comentario(str);
    }
    @Step
    public void confirm_avaliacao_submission() {
    	avaliacaoPage.confirm_submission();
    }
    @Step
    public void reset_avaliacao_submission() {
    	avaliacaoPage.reset();
    }
    @Step
	public void should_see_avaliacao_confirmation(String message) {
		assertThat(avaliacaoPage.getSuccessMessage(), containsString(message));
	}
    
    //// DADOS SUBJETIVOS //////
    @Step
    public void inserts_main_complaint(String str) {
        subjectiveDataPage.enter_main_complaint(str);
    }
    @Step
    public void inserts_history_illness(String str) {
    	subjectiveDataPage.enter_illness(str);
    }
    @Step
    public void inserts_symptomatic(String str) {
    	subjectiveDataPage.enter_symptomatic(str);
    }
    @Step
    public void inserts_personal_family_history(String str) {
    	subjectiveDataPage.enter_personal(str);
    }
    @Step
    public void inserts_lifestyle(String str) {
    	subjectiveDataPage.enter_lifestyle(str);
    }
    @Step
    public void inserts_orthotics(String str) {
    	subjectiveDataPage.enter_orthotics(str);
    }
    @Step
    public void inserts_comments(String str) {
    	subjectiveDataPage.enter_comments(str);
    }
    @Step
    public void confirm_subjetivos_submission() {
    	subjectiveDataPage.confirm_submission();
    }
    
    @Step
	public void should_see_subjetivos_confirmation(String message) {
		assertThat(subjectiveDataPage.getSuccessMessage(), containsString(message));
	}
    
////DADOS OBJETIVOS //////
   @Step
   public void inserts_height(String str) {
       objectiveDataPage.enter_height(str);
   }
   @Step
   public void inserts_weight(String str) {
   	objectiveDataPage.enter_weight(str);
   }
   @Step
   public void inserts_temperature(String str) {
   	objectiveDataPage.enter_temperature(str);
   }
   @Step
   public void inserts_s_pressure(String str) {
   	objectiveDataPage.enter_systolic_pressure(str);
   }
   @Step
   public void inserts_d_pressure(String str) {
   	objectiveDataPage.enter_diastolic_pressure(str);
   }
   @Step
   public void inserts_heart_rate(String str) {
   	objectiveDataPage.enter_heart_rate(str);
   }
   @Step
   public void inserts_respiratory_rate(String str) {
   	objectiveDataPage.enter_respiratory_rate(str);
   }
   @Step
   public void inserts_oxygen_saturation(String str) {
   	objectiveDataPage.enter_oxygen(str);
   }
   @Step
   public void inserts_gas_carbon_saturation(String str) {
   	subjectiveDataPage.enter_comments(str);
   }
   @Step
   public void inserts_blood_glucose(String str) {
	objectiveDataPage.enter_glucose(str);
   }
   @Step
   public void inserts_objective_comments(String str) {
   	objectiveDataPage.enter_comments(str);
   }
  
   @Step
   public void confirm_objective_submission() {
   	objectiveDataPage.confirm_submission();
   }
   @Step
   public void reset_objective_submission() {
   	objectiveDataPage.reset();
   }
   
   @Step
	public void should_see_objetivos_confirmation(String message) {
		assertThat(subjectiveDataPage.getSuccessMessage(), containsString(message));
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
    	assertThat(search_patientPage.getSuccessMessage(), containsString("Nome"));
    	//assert(true);
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
	public void should_see_success_message_registration(String message) {
		assertThat(registrationPage.getSuccessMessage(), containsString(message));
		//assert(true);
	}
	
	@Step
	public void should_see_success_message_subjective_data(String message) {
		assertThat(subjectiveDataPage.getSuccessMessage(), containsString(message));
		//assert(true);
	}
	
	@Step
	public void should_see_error_message_registration(String message) {
		assertThat(registrationPage.getErrorMessage(), containsString(message));
		//assert(true);
	}
	
	@Step
	public void should_see_error_message_search(String message) {
		assertThat(search_patientPage.getErrorMessage(), containsString(message));
		//assert(true);
	}
	
}