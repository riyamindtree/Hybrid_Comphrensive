package runner;



import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.ArticlePage;
import pageobject.HomePage;
import pageobject.SearchPage;
import utilities.BaseClass;
import utilities.ConfigRead;
import utilities.ExtentReports_;
import utilities.ReadExcel;

import utilities.SnapShot;

public class TestRunner extends BaseClass {

	BaseClass baseclass;
	ReadExcel readexcel;
	SnapShot ss;
	ExtentReports_ reports;
	HomePage homepage;
	SearchPage searchpage;
	ConfigRead read;
	ArticlePage articlepage;
	
	
	@BeforeClass
	public void beforeClass() {
		
		reports = new ExtentReports_();
		reports.createReports();
		reports.createTest(" tide ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		baseclass = new BaseClass();
		baseclass.setUp();
		homepage = new HomePage();
		searchpage = new SearchPage();
		articlepage = new ArticlePage();
		ss = new SnapShot();
		readexcel = new ReadExcel();
		reports.logPass("Opening Browser");
		
		
		
	}
	
	@Test
	public void t1() throws IOException, InterruptedException {
		String data= ReadExcel.getStringData(1, 0);
		System.out.println(data);
		homepage.searchingBox(data);
		Thread.sleep(6000);
		homepage.clickClosePopUp();
		homepage.clickSearchButton();
		/*String productname= searchpage.selectedProductName();
		System.out.println(productname);
			if(searchpage.selectedProductName().contains("Powder")) {
				reports.logPass("PASSED");
				ss.takeSnapShot("t1");
			}
			else {
				
				reports.logFail("FAIL");
			}*/
			String product1 = searchpage.innImg();
			System.out.println("product1");
			if(searchpage.outImg().equalsIgnoreCase(product1))
			{
				System.out.println("pass");
			}else
			{
				
				System.out.println("fail");
			}
			
          
	}
	
	/*@Test
	public void t2() throws InterruptedException, IOException {	
		homepage.clickClosePopUp();
		homepage.hoverOnShopProduct();
		Thread.sleep(6000);
		homepage.clickOnLiquid();
		String Delicates = searchpage.verifyProductNameForLiquid();
		System.out.println(Delicates);
		if(searchpage.verifyProductNameForLiquid().contains("Delicates")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t2");
		
		}
		else {
			reports.logFail("FAIL");
			
		}

	}
	
	@Test(priority=0)
	public void t3() throws InterruptedException, IOException {	
		homepage.clickClosePopUp();
		homepage.clickAdditivesFromByNeed();
		String heading = searchpage.verifyHeading();
		System.out.println(heading);
			reports.logPass("PASSED");
			ss.takeSnapShot("t3");

		}
	
	
	
   
		
		
	
   	@Test
	public void t4() throws InterruptedException, IOException {	
		
		homepage.clickClosePopUp();
		homepage.clickOnLearnMoreButton();
		searchpage.clickSecondTabName();
		String data = articlepage.verifyTabHeading();
		System.out.println(data);
		if(articlepage.verifyTabHeading().contains("Joining")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t4");
			
		}
		else {
		
			reports.logFail("FAIL");
		}
		
		
	}
		
	@Test
	public void t5() throws InterruptedException, IOException {	
		
		homepage.clickClosePopUp();
		homepage.clickOnWhatNewTab();
		searchpage.clickOnReadMore();
		String curtains = articlepage.curtainArticleOpen();
		System.out.println(curtains);
		if(articlepage.curtainArticleOpen().contains("How to Wash Curtains")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t5");
		}
		else {
		          reports.logFail("FAIL");
		
		}
		
	}
	
	@Test
	public void t6() throws InterruptedException {
		homepage.clickClosePopUp();
		homepage.hoverOnCommitment();
		homepage.clickOnSafety();
		searchpage.clickOnLearnMore();
		String data = articlepage.verifyHeading();
		System.out.println(data);
		if(articlepage.verifyHeading().contains("Ingredients")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t6");
		}
		else {
			reports.logFail("FAIL");
			
		}

		
	}
		
	
	@Test
	public void t7() throws InterruptedException, IOException {	
		homepage.clickClosePopUp();
		homepage.clickOnDeepClean();
		
		String data = searchpage.verifySensitiveSkinHeading();
		System.out.println(data);
		if(searchpage.verifySensitiveSkinHeading().contains("Skin")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t7");
			
		}
		else {
			reports.logFail("FAIL");
			
		}
		
		
		
	}
	
	
	@Test(priority=1)
	public void t8() throws InterruptedException, IOException {	
		
		homepage.clickClosePopUp();
		homepage.washClothesTab();
		homepage.clickFabricTab();
		Thread.sleep(1000);
		articlepage.clickHowToUseClothes();
		String data = articlepage.verifyArticleHeading();
		System.out.println(data);
		if(articlepage.verifyArticleHeading().contains("How to Use and Care for Cloth Diapers")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t8");
			
		}
		else {
			reports.logFail("FAIL");
			
		}
		
		
	}
	
	
	@Test
	public void t9() throws InterruptedException, IOException {	
		
		homepage.clickClosePopUp();
		homepage.clickOnCoupons();
		String data = searchpage.verifyTagPnG();
		System.out.println(data);
		if(searchpage.verifyTagPnG().contains("Your")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t9");
			
		}
		else {
			reports.logFail("FAIL");
			
		}
		
	}
	
	
	@Test
	public void t10() throws InterruptedException, IOException {	
		
		
		homepage.clickClosePopUp();
		homepage.clickOnLaundryInFooter();
		searchpage.clickOnRetailer();
		String data = searchpage.showProductStatus();
		System.out.println(data);
		if(searchpage.showProductStatus().contains("Tide Brights")) {
			reports.logPass("PASSED");
			ss.takeSnapShot("t10");
			
		}
		else {
			
			reports.logFail("FAIL");
		}
	}*/
		
	
	
	
	
    @AfterMethod
    public void afterMethod() {
    	baseclass.tearDown();
		reports.logPass("browser closed successfully");
    }

	@AfterClass
	public void afterClass() {
		reports.closeTest();
		reports.closeReport();
	}
	}

	
	
	

