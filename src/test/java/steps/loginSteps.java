package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
public class loginSteps {
	WebDriver driver;
	loginPage login;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException{ 
		System.out.println("inside Step-user is on login page");
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://www.exist.com.tn/");
	   
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div")).click();
		driver.findElement(By.xpath("//span[@class='hidden-md-down']")).click();
		
	    // Write code here that turns the phrase above into concrete actions
		 
	  
	}
	
	@When ("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside Step-clicks on login button");	
		login.ClickLogin();
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String email,String password) {
		System.out.println("inside Step-user enters email and password");
		login = new loginPage(driver);
		login.enterEmail(email);
		login.enterPassword(password);
	}

	@Then("error message")
	public void error_message() {
	    
	    throw new io.cucumber.java.PendingException();
	}


}


		

	


