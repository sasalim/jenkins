package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.modifPage;

public class modifSteps {
	WebDriver driver;
	modifPage modif;

	@When("clicks on information button")
	public void clicks_on_information_button() {
	 modif.clickInformation();
	    throw new io.cucumber.java.PendingException();
	}

	@When("clear  salim")
	public void clear_salim(String firstname) {
		modif.deleteName(firstname);
	    throw new io.cucumber.java.PendingException();
	}

	@When("whrite selim")
	public void whrite_selim(String firstname1) {
	 modif.enterNew(firstname1);;
	    throw new io.cucumber.java.PendingException();
	}
	@When("^enter (.*)$")
	public void enter_password(String password) {
	 
		modif.enterPassword(password);
	   
	 throw new io.cucumber.java.PendingException();
	}
	
	@When("clicks save")
	public void clicks_save() {
	    modif.clickSave();
	    throw new io.cucumber.java.PendingException();
	}
}
