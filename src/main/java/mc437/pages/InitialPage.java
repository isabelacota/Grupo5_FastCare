package mc437.pages;

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
	
    @FindBy(name="search_pacient")
    private WebElementFacade search_pacients;

    @FindBy(name="search")
    private WebElementFacade search_pacient_button;
    
    @FindBy(name="insert_pacient")
    private WebElementFacade insert_pacient_button;
    
    // Methods 
    
    public void enter_pacient_name(String name) {
    	search_pacients.type(name);
    }

    public void lookup_pacient() {
    	search_pacient_button.click();
    }
    
    public void insert_pacient() {
    	insert_pacient_button.click();
    }
}