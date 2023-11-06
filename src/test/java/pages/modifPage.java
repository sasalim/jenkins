package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class modifPage {

	     
		WebDriver driver;
	     By btn_info= By.xpath("//*[@id=\"identity-link\"]/span/i");
	     By txt_user = By.name("firstname");
	     By tx_password =By.name("password");
	     By btn_save =  By.xpath("//button[@class='btn btn-primary form-control-submit float-xs-right']");
	     By txt_email = By.name("email");
	     By txt_password = By.name("password");
	     By btn_login = By.id("submit-login");
	     
	     public modifPage(WebDriver driver) {
	    	 this.driver = driver ;
	    	 
	    	 
	     }
         public void clickInformation() {
        	 
        	 driver.findElement( btn_info).click();
         }
        
         public void deleteName(String firstname) {
        	 
        	 driver.findElement( txt_user).clear();
         }
      
         public void enterNew(String firstname1) {
        	 
        	 driver.findElement(txt_user).sendKeys(firstname1);
        	 
         }

         public void enterPassword(String password) {
        	 
        	 driver.findElement(txt_user).sendKeys(password);
        	 
         }
         public void clickSave() {
        	 
        	 driver.findElement(btn_save).click();
        	 
         }

}
        	 
        	 
        	 
        	 