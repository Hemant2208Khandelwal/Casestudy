package Casestudy_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	WebDriver driver = null;
	
	@Given("the Home page is opened")
	public void the_Home_page_is_opened() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		  
	}

	@When("user enters SignUp page")
	public void user_enters_SignUp_page() {
		
		driver.findElement(By.linkText("SignUp")).click();	
	}

	@And("user enters Complete details")
	public void user_enters_Complete_details() {
		
		driver.findElement(By.name("userName")).sendKeys("Rehaan");
		driver.findElement(By.name("firstName")).sendKeys("Rehaan");
		driver.findElement(By.name("lastName")).sendKeys("Khanna");
		driver.findElement(By.id("password")).sendKeys("rehaan123");
		driver.findElement(By.id("pass_confirmation")).sendKeys("rehaan123");
		driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("rehaan@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9876556789");
		driver.findElement(By.name("dob")).sendKeys("08/22/2000");
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		driver.findElement(By.id("securityQuestion")).sendKeys("2");
		driver.findElement(By.id("answer")).sendKeys("Tommy");    
		
	}

	@And("user clicks on register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("user will find a testmeapp homepage")
	public void user_will_find_a_testmeapp_homepage() {
		System.out.println("Title of the page is"+driver.getTitle());
	    
	}

}
