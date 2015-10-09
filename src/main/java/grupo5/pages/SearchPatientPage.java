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

@DefaultUrl("http://xaveco.lab.ic.unicamp.br:8000/search.html")
public class SearchPatientPage extends PageObject {

	// Web Elements
	
    @FindBy(name="patient_name_field")
    private WebElementFacade patient_name_field;
    
    @FindBy(name="cpf_field")
    private WebElementFacade cpf_field;
    
    @FindBy(name="phone_field")
    private WebElementFacade phone_field;
    
    @FindBy(name="gender_field")
    private WebElementFacade gender_field;
    
    @FindBy(name="birth_field")
    private WebElementFacade birth_field;
    
    @FindBy(name="diagnosis_field")
    private WebElementFacade diagnosis_field;

    @FindBy(name="search")
    private WebElementFacade search_patient_button;
        
    // Methods 
    
    public void enter_patient_name(String name) {
    	patient_name_field.type(name);
    }
    
    public void enter_cpf(String cpf) {
    	cpf_field.type(cpf);
    }
    
    public void enter_phone(String phone) {
    	phone_field.type(phone);
    }
    
    public void enter_gender(String gender) {
    	gender_field.type(gender);
    }
    
    public void enter_birth(String birth) {
    	birth_field.type(birth);
    }
    
    public void enter_diagnosis(String diagnosis) {
    	diagnosis_field.type(diagnosis);
    }

    public void click_search_button() {
    	search_patient_button.click();
    }
    
}