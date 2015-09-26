package grupo5.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
@DefaultUrl("http://www.google.com.br")
public class PatientPage extends PageObject {

    // Web Elements

    @FindBy(name="update_patient")
    private WebElementFacade update_patient_button;
    
    @FindBy(name="exclude_patient")
    private WebElementFacade exclude_patient_button;

    // Methods 

    public void update_patient() {
        update_patient_button.click();
    }
    
    public void exclude_patient(){
    	exclude_patient_button.click();
    }
}
