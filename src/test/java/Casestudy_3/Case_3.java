package Casestudy_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case_3 {
	
	WebDriver driver=null;
	
	@Given("user enters login details")
	public void user_enters_login_details() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	    
	}

	@When("user goes for product search")
	public void user_goes_for_product_search() {
		//driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/a/span")).click();
		//driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/a/span")).click();
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input"));
		
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"bag").perform();
		
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	    
	}

	@And("user searches the product with four keywords")
	public void user_searches_the_product_with_four_keywords() {
		
		System.out.println("The title of the page is: "+driver.getTitle());
	    
	}

	@Then("user makes the purchase and logout")
	public void user_makes_the_purchase_and_logout() {
		driver.close();
	    
	}

}
