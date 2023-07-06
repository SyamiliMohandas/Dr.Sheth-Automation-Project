package syamiliacademy.DrShethProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import syamiliacademy.DrShethProject.Base.BaseClass;

public class ShethHomePage extends BaseClass {

	
	@FindBy(xpath="//a[@href='/account']")
	WebElement acctBtn;
	@FindBy(xpath="//button[@class='btn-button bordered']")
	WebElement createAcctBtn;
	@FindBy(id="FirstName")
	WebElement firstName;
	@FindBy(id="LastName")
	WebElement lastName;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="CreatePassword")
	WebElement password;
	@FindBy(xpath="//input[@class='btn-button bordered']")
	WebElement submitBtn;
	public ShethHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount()
	{
		acctBtn.click();
		createAcctBtn.click();
		firstName.sendKeys("Syamili");
		lastName.sendKeys("Mohandas");
		email.sendKeys("syamili.das@gmail.com");
		password.sendKeys("Syamili123!");
		submitBtn.click();
	}

}
