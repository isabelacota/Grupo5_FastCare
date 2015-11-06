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

@DefaultUrl("http://127.0.0.1:8080/FastCare/formulario_S.html")
public class SubjectiveDataPage extends PageObject {

	// Web Elements
	
    @FindBy(id="queixa-control-input")
    private WebElementFacade complaint_field;
    
    @FindBy(id="historia-control-input")
    private WebElementFacade illness_field;
    
    @FindBy(id="interrogatorio-control-input")
    private WebElementFacade symptomatic_field;
    
    @FindBy(id="antecedentes-control-input")
    private WebElementFacade personal_field;
    
    @FindBy(id="habitos-control-input")
    private WebElementFacade lifestyle_field;
    
    @FindBy(id="orteses-proteses-control-input")
    private WebElementFacade orthotics_field;
    
    @FindBy(id="comentarios-control-input")
    private WebElementFacade comments_field;
    
    @FindBy(id="confirm")
    private WebElementFacade confirm_button;
    
    @FindBy(id="cancel")
    private WebElementFacade reset_button;
    
    // Methods 
        
    public void enter_main_complaint(String str) {
    	complaint_field.type(str);
    }
    public void enter_illness(String str) {
    	illness_field.type(str);
    }
    public void enter_symptomatic(String str) {
    	symptomatic_field.type(str);
    }
    public void enter_personal(String str) {
    	personal_field.type(str);
    }
    public void enter_lifestyle(String str) {
    	lifestyle_field.type(str);
    }
    public void enter_orthotics(String str) {
    	orthotics_field.type(str);
    }
    public void enter_comments(String str) {
    	comments_field.type(str);
    }
   
    
        
    public void confirm_submission() {
    	confirm_button.click();
    }
    public void reset() {
    	reset_button.click();
    }
    
    public String getSuccessMessage() {
        WebElement messageClass = find(By.name("mensagemSucesso"));
        return messageClass.getText();
    }
    
    public String getErrorMessage() {
        WebElement messageClass = find(By.name("mensagemErro"));
        return messageClass.getText();
    }
    
    
    
}