package syamiliacademy.DrShethProject.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import syamiliacademy.DrShethProject.Base.BaseClass;

public class AddToCartPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='st-search-bar hidden-mobile']/input")
	WebElement searchBox;
	@FindBy(xpath="//div[@class='st-ProductItem-Info']/a")
	List<WebElement> products;
	@FindBy(xpath="//button[@name='add']")
	WebElement addToCartBtn;
	
	public AddToCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void searchProduct()
	{
		searchBox.sendKeys("sun protect");
		
	}
	
	public void selectProduct()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(products));
		for(int i=0;i<products.size();i++)
		{
			String text=products.get(i).getText();
			if(text.equals("Sun Protect & Refresh Duo"))
			{
				products.get(i).click();
				break;
			}
			
		}
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a =driver.switchTo().alert();
		a.dismiss();
		wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
		addToCartBtn.click();
		
		
	}

}
