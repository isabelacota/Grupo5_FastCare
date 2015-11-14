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
public class ObjectiveDataPage extends PageObject {

// Web Elements
	
    
	@FindBy(id="cancel")
    private WebElementFacade reset_button;
    @FindBy(id="confirm")
    private WebElementFacade confirm_button;
    
    //Fields
    @FindBy(id="height-control-input")
    private WebElementFacade height_field;
    @FindBy(id="weight-control-input")
    private WebElementFacade weight_field;
    @FindBy(id="temperatura-control-input")
    private WebElementFacade temperature_field;
    
   
    
    
    
    
    
    
    
    @FindBy(id="systolicArterialPressure-control-input")
    private WebElementFacade systolic_pressure_field;
    @FindBy(id="diastolicArterialPressure-control-input")
    private WebElementFacade diastolic_pressure_field;
    
    @FindBy(id="cardiacFrequency-control-input")
    private WebElementFacade heart_rate_field;
    @FindBy(id="frequenciaRespiratoria-control-input")
    private WebElementFacade respiratory_rate_field;
    @FindBy(id="saturacaoOxigenio-control-input")
    private WebElementFacade oxygen_field;
    @FindBy(id="saturacaoCarbonico-control-input")
    private WebElementFacade gas_carbon_field;
    @FindBy(id="glicemiaCapilar-control-input")
    private WebElementFacade glucose_field;
    @FindBy(id="comentarios-control-input")
    private WebElementFacade comments_field;
    // Methods 
    
    public void enter_height(String str) {
    	height_field.type(str);
    }
    public void enter_weight(String str) {
    	weight_field.type(str);
    }
    public void enter_temperature(String str) {
    	temperature_field.type(str);
    }
    public void enter_systolic_pressure(String str) {
    	systolic_pressure_field.type(str);
    }
    public void enter_diastolic_pressure(String str) {
    	diastolic_pressure_field.type(str);
    }
    public void enter_heart_rate(String str) {
    	heart_rate_field.type(str);
    }
    public void enter_respiratory_rate(String str) {
    	respiratory_rate_field.type(str);
    }
    public void enter_oxygen(String str) {
    	oxygen_field.type(str);
    }
    public void enter_gas_carbon(String str) {
    	gas_carbon_field.type(str);
    }
    public void enter_glucose(String str) {
    	glucose_field.type(str);
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