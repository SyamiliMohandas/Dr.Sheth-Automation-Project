package syamiliacademy.DrShethProject.Test;

import org.testng.annotations.Test;

import syamiliacademy.DrShethProject.Base.BaseClass;
import syamiliacademy.DrShethProject.Pages.AddToCartPage;
import syamiliacademy.DrShethProject.Pages.ShethHomePage;

public class ShethTest extends BaseClass {
	
	
	@Test(enabled=false)
	public void AcctCreationTest()
	{
		ShethHomePage shp=new ShethHomePage(driver);
		shp.createAccount();
	}
	@Test
	public void AddToCartTest()
	{
		AddToCartPage ap=new AddToCartPage(driver);
		ap.searchProduct();
		ap.selectProduct();
	}

}
