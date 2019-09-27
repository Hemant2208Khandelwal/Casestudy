package Casestudy_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametrization {
WebDriver driver = null;
	
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		
	    
	}

	@When("User click on to Signin link")
	public void user_click_on_to_Signin_link() {
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("The title of the page is"+driver.getTitle());
	  
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	    driver.close();
	}

	@Then("Message displayed login successfully")
	public void message_displayed_login_successfully() {
		//System.out.println("Title of the page is"+driver.getTitle());
	   
	}

}
