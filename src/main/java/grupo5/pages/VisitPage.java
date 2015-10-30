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
    
    // Methods 
    
    public void inserir_dados_objetivos() {
    	inserir_dados_objetivos_button.click();
    }
    
    public void inserir_dados_subjetivos() {
    	inserir_dados_subjetivos_button.click();
    }
}