package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest {
	static WebDriver driver;

	@Given("user is able to launch URL")
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("user should be able to enter the username")
	public void EnterUsername() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("user should be able to enter the password")
	public void EnterPassword() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user should be able to click on the submit button")
	public void user_should_be_able_to_click_on_the_submit_button() {
		driver.findElement(By.cssSelector(".oxd-button--main")).click();
	}

	@Then("I validate the user is able to logged in")
	public void i_validate_the_user_is_able_to_logged_in() {
	}

}
