package grupo5.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://127.0.0.1:8080/FastCare/insert.html")
public class RegistrationPage extends PageObject {

	// Web Elements
	
    @FindBy(id="username")
    private WebElementFacade name_field;
    
    @FindBy(id="gender_field")
    private WebElementFacade gender_field;
    
    @FindBy(id="cpfnumber")
    private WebElementFacade cpf_field;
    
    @FindBy(id="date-birth")
    private WebElementFacade birth_field;
    
    @FindBy(id="phonenumber")
    private WebElementFacade phone_field;
    
    @FindBy(id="plan_field")
    private WebElementFacade plan_field;
    
    @FindBy(id="confirm")
    private WebElementFacade confirm_button;
    
    // Methods 
    
    public void enter_patient_name(String name) {
    	name_field.type(name);
    }
    
    public void enter_patient_gender(String gender) {
    	gender_field.type(gender);
    }
    
    public void enter_patient_cpf(String cpf) {
    	cpf_field.type(cpf);
    }
    
    public void enter_patient_birth(String birth) {
    	birth_field.type(birth);
    }
    
    public void enter_patient_phone(String phone) {
    	phone_field.type(phone);
    }
    public void enter_patient_plan(String plan) {
    	plan_field.type(plan);
    }
    
//    public void pops_message_patient_already_exists(){
//    	message_cpf_already_exists.getCssValue("display");
//    }
        
    public void confirm_submission() {
    	confirm_button.click();
    }
    
    
    
}