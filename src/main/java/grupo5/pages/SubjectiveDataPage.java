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
public class SubjectiveDataPage extends PageObject {

	// Web Elements
	
    @FindBy(id="queixa-control")
    private WebElementFacade queixa_field;
    
    @FindBy(id="historia")
    private WebElementFacade historia_field;
    
    @FindBy(id="interrogatorio")
    private WebElementFacade interrogatorio_field;
    
    @FindBy(id="antecedentes")
    private WebElementFacade antecedentes_field;
    
    @FindBy(id="habitos")
    private WebElementFacade habitos_field;
    
    @FindBy(id="orteses-proteses")
    private WebElementFacade orteses_field;
    
    @FindBy(id="comentarios")
    private WebElementFacade comentarios_field;
    
    @FindBy(id="confirm")
    private WebElementFacade confirm_button;
    
    @FindBy(id="cancel")
    private WebElementFacade reset_button;
    
    // Methods 
    
    public void enter_queixa(String str) {
    	queixa_field.type(str);
    }
    public void enter_historia(String str) {
    	historia_field.type(str);
    }
    public void enter_interrogatorio(String str) {
    	interrogatorio_field.type(str);
    }
    public void enter_antecedentes(String str) {
    	antecedentes_field.type(str);
    }
    public void enter_habitos(String str) {
    	habitos_field.type(str);
    }
    public void enter_orteses(String str) {
    	orteses_field.type(str);
    }
    public void enter_comentarios(String str) {
    	comentarios_field.type(str);
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