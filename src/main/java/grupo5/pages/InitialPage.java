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
public class InitialPage extends PageObject {

	// Web Elements
	
    @FindBy(name="search_patient")
    private WebElementFacade search_patient_button;
    
    @FindBy(name="register_patient")
    private WebElementFacade register_patient_button;
    
    // Methods 
    
    public void search_patient() {
    	search_patient_button.click();
    }
    
    public void register_patient() {
    	register_patient_button.click();
    }
}