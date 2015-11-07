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
public class VisitPage extends PageObject {

	// Web Elements
	
    @FindBy(name="Inserir dados objetivos")
    private WebElementFacade inserir_dados_objetivos_button;
    
    @FindBy(name="Inserir dados subjetivos")
    private WebElementFacade inserir_dados_subjetivos_button;
    
    @FindBy(id="confirm")
    private WebElementFacade confirm_button;
    
    //Fields
    @FindBy(id="complaint_field")
    private WebElementFacade complaint_field;
    @FindBy(id="complaint_field")
    private WebElementFacade illness_field;
    @FindBy(id="complaint_field")
    private WebElementFacade symptomatic_field;
    @FindBy(id="complaint_field")
    private WebElementFacade personal_field;
    @FindBy(id="complaint_field")
    private WebElementFacade lifestyle_field;
    @FindBy(id="complaint_field")
    private WebElementFacade orthotics_field;
    @FindBy(id="complaint_field")
    private WebElementFacade comments_field;
    // Methods 
    
    public void inserir_dados_objetivos() {
    	inserir_dados_objetivos_button.click();
    }
    
    public void inserir_dados_subjetivos() {
    	inserir_dados_subjetivos_button.click();
    }
    
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
    public String getMessage() {
        WebElement messageClass = find(By.name("mensagemSucesso"));
        return messageClass.getText();
    }
    
    
    
    
    
}