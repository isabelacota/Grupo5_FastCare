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

@DefaultUrl("http://www.google.com.br")
public class RegistrationPage extends PageObject {

	// Web Elements
	
    @FindBy(name="name_field")
    private WebElementFacade name_field;
    
    @FindBy(name="gender_field")
    private WebElementFacade gender_field;
    
    @FindBy(name="cpf_field")
    private WebElementFacade cpf_field;
    
    @FindBy(name="birth_field")
    private WebElementFacade birth_field;
    
    @FindBy(name="phone_field")
    private WebElementFacade phone_field;
    
    @FindBy(name="confirm_button")
    private WebElementFacade confirm_button;
    
    // Methods 
    
    public void enter_patient_name(String name) {
    	name_field.type(name);
    }
   
    public void submit_patient_name() {
    	name_field.submit();
    }
    
    public void enter_patient_gender(String gender) {
    	gender_field.type(gender);
    }
   
    public void submit_patient_gender() {
    	gender_field.submit();
    }
    
    public void enter_patient_cpf(String cpf) {
    	cpf_field.type(cpf);
    }
   
    public void submit_patient_cpf() {
    	cpf_field.submit();
    }
    
    public void enter_patient_birth(String birth) {
    	birth_field.type(birth);
    }
   
    public void submit_patient_birth() {
    	birth_field.submit();
    }
    
    public void enter_patient_phone(String phone) {
    	phone_field.type(phone);
    }
   
    public void submit_patient_phone() {
    	phone_field.submit();
    }
    
    public void confirm_submission() {
    	confirm_button.click();
    }
    
    
    
}