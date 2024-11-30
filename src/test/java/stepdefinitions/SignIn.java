package stepdefinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn {
	WebDriver driver;

@Given("navigates to jira")
public void navigates_to_jira() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.atlassian.com/software"
			+ "/jira?referer=jira.com");
	
   
}

@When("i click on sign in")
public void i_click_on_sign_in() {
	driver.findElement(By.xpath("//div[contains(@class,'productpage-subnav-bar')]/descendant::span[text()='Sign in']")).click();
	
    
}

@Then("verify can't login")
public void verify_can_t_login() {
WebElement text = driver.findElement(By.xpath("//a[@id='resetPassword']"));
String verify = text.getText();
boolean a = text.isDisplayed();
//System.out.println(a);
driver.quit();

	
}



    
}





