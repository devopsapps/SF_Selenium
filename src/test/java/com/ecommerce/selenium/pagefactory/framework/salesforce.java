package com.ecommerce.selenium.pagefactory.framework;

import org.testng.annotations.Test;

import com.ecommerce.selenium.pagefactory.framework.browser.web.WebBrowser;
import com.ecommerce.selenium.pagefactory.framework.functions.Wrapper;
import com.ecommerce.selenium.pagefactory.framework.pages.ConfirmOrderPage;
import com.ecommerce.selenium.pagefactory.framework.pages.HomePage;

public class salesforce extends Wrapper {
	
	//public static final String WEB_DRIVER_PATH = System.getProperty("C:\\Users\\Shahed\\Downloads\\chromedriver_win32\\chromedriver.exe");
			Wrapper wp = new Wrapper();
			HomePage hp= new HomePage();
			//ConfirmOrderPage cop = new ConfirmOrderPage();
			//public WebBrowser app;
			
			
			//@BeforeTest
			/*public void Openapp() throws Exception {
		    	app = openApplication();
		    	Thread.sleep(3000);
		    	
		    }
				//@BeforeMethod   
			    public void Login() throws Exception {
			    	wp.login(app);
					Thread.sleep(3000);
					
				}*/
					   
				    @Test(priority=1)
					public void Addcontent() throws Exception {
				    	WebBrowser app;
				    	app = openSF_Application();
				    	Thread.sleep(3000);
				    	wp.login_SF(app);
						Thread.sleep(3000);
						//hp.Addcontent_SF(app);
						//Thread.sleep(3000);
						//hp.Logout(app);
						//app.quit();
						
					}
					
				    /*@Test(priority=2)
					public void Checkoutcart() throws Exception {
				    	WebBrowser app;
				    	app = openBL_Application();
				    	Thread.sleep(3000);
				    	//wp.login(app);
						//Thread.sleep(3000);
				    	hp.Addtocart_BL(app);
						Thread.sleep(3000);
						hp.Checkoutcart_BL(app);
						Thread.sleep(3000);
						//hp.Logout(app);
						app.quit();
						
					}
					
				    @Test(priority=3)
					public void placeorder() throws Exception {
				    	WebBrowser app;
				    	app = openBL_Application();
				    	Thread.sleep(3000);
				    	//wp.login(app);
						//Thread.sleep(3000);
				    	hp.Addtocart_BL(app);
				    	Thread.sleep(3000);
						hp.Checkoutcart_BL(app);
						Thread.sleep(3000);
						cop.PlaceOrder_BL(app);
						Thread.sleep(3000);
						//hp.Logout(app);
						app.quit();
						
					}*/
				/*//@AfterMethod
				public void Logout() throws Exception {
			    	hp.Logout(app);
				}
			//@AfterTest
			public void Closeapp() throws Exception {
		    	app.quit();
			}*/
				
		   
		    	
		    	
		    	
		    	
		    	


}
