package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class loginPage {

	     WebDriver driver;
	     By txt_email = By.name("email");
	     By txt_password = By.name("password");
	     By btn_login = By.id("submit-login");
	     By error_message=By.xpath("//*[@id=\"content\"]/section/div/ul/li");
	     
	     public loginPage(WebDriver driver) {
	    	 this.driver = driver ;
	     }
         public void enterEmail(String email) {
        	 
        	 driver.findElement(txt_email).sendKeys(email);
          }
         public void enterPassword(String password) {
        	 
        	 driver.findElement(txt_password).sendKeys(password);
          }
         public void ClickLogin() {
        	 
        	 driver.findElement(btn_login).click();
       
}
         public void errorMessage(String error_message ) {
        	 
        	
        	
}
         }