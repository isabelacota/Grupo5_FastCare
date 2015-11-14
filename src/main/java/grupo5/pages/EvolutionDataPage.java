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

@DefaultUrl("http://127.0.0.1:8080/FastCare/formulario_E.html")
public class EvolutionDataPage extends PageObject {

	// Web Elements
	
    
    @FindBy(id="comentario-control-input")
    private WebElementFacade comments_field;
    
    @FindBy(id="diganostico-definitivo-control-input")
    private WebElementFacade flag_field;
    
    @FindBy(id="confirm")
    private WebElementFacade confirm_button;
    
    @FindBy(id="cancel")
    private WebElementFacade reset_button;
    
    // Methods 
        
   
    public void enter_comments(String str) {
    	comments_field.type(str);
    }
    
    public void enter_flag(String str) {
    	flag_field.type(str);
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