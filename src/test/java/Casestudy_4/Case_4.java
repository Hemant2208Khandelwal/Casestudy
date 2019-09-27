package Casestudy_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case_4 {
	WebDriver driver=null;
	
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		   
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
		
        WebElement search=driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input"));
		
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"bag").perform();
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	   
	}

	@When("Try to proceed to payment without adding any item in it")
	public void try_to_proceed_to_payment_without_adding_any_item_in_it() {
		try {
			driver.findElement(By.linkText("Cart")).click();
		}
		catch(Exception e)
		{
			System.out.println("Cart is not there, payment is not possible.");
		}
	    
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
	       driver.close();
	}

}
