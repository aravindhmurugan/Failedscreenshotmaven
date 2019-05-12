package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base{
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	@Test
	public void logintest() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Searchtest() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Homepagetest() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Dealspagetest() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Contactspagetest() {
		Assert.assertEquals(true, false);
	}

}
