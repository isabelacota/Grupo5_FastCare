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
	
    @FindBy(name="field_name")
    private WebElementFacade field_name;
    
    @FindBy(name="field_gender")
    private WebElementFacade field_gender;
    
    @FindBy(name="field_cpf")
    private WebElementFacade field_cpf;
    
    @FindBy(name="field_birth")
    private WebElementFacade field_birth;
    
    @FindBy(name="field_phone")
    private WebElementFacade field_phone;
    
    @FindBy(name="confirm_with_same_cpf")
    private WebElementFacade confirm_with_same_cpf;
    
    @FindBy(name="button_confirm")
    private WebElementFacade button_confirm;
    
    // Methods 
    
    public void enter_pacient_name(String name) {
    	field_name.type(name);
    }
   
    public void submit_pacient_name() {
    	field_name.submit();
    }
    
    public void enter_pacient_gender(String gender) {
    	field_gender.type(gender);
    }
   
    public void submit_pacient_gender() {
    	field_gender.submit();
    }
    
    public void enter_pacient_cpf(String cpf) {
    	field_cpf.type(cpf);
    }
   
    public void submit_pacient_cpf() {
    	field_cpf.submit();
    }
    
    public void enter_pacient_birth(String birth) {
    	field_birth.type(birth);
    }
   
    public void submit_pacient_birth() {
    	field_birth.submit();
    }
    
    public void enter_pacient_phone(String phone) {
    	field_phone.type(phone);
    }
   
    public void submit_pacient_phone() {
    	field_phone.submit();
    }
    
//    public void pops_message_patient_already_exists(){
//    	message_cpf_already_exists.getCssValue("display");
//    }
    
    public void register_same_cpf() {
    	confirm_with_same_cpf.click();
    }
    
    public void confirm_submission() {
    	button_confirm.click();
    }
    
    
    
}