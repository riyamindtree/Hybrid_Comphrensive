package pageobject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.ArticleUI;
import uistore.HomeUI;
import uistore.SearchUI;
import utilities.Logs;

public class SearchPage {
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public SearchPage() {
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	
	
	
public String selectedProductName() {

		helper.explicitWaitForInvisibilty(SearchUI.result1, 80);
		String text = helper.getText(SearchUI.result1);
		return text;
	}


public String verifyProductNameForLiquid() {

	helper.explicitWaitForInvisibilty(SearchUI.result4, 80);
	String text = helper.getText(SearchUI.result4);
	return text;
}


public String verifyHeading() {

	helper.explicitWaitForInvisibilty(SearchUI.topHeading, 80);
	String text = helper.getText(SearchUI.topHeading);
	return text;
}
	
public void clickSecondTabName() {
	helper.explicitWaitForInvisibilty(SearchUI.secondTab, 80);
	helper.clickButton(SearchUI.secondTab);
	log.info(" Clicked on the second tab of the page ");
	}

public void clickOnReadMore() {
	helper.explicitWaitForInvisibilty(SearchUI.readMore, 80);
	helper.clickButton(SearchUI.readMore);
	log.info(" Clicked on the read more button ");
	}



public String verifySensitiveSkinHeading() {

	helper.explicitWaitForInvisibilty(SearchUI.sensitiveSkinHeading, 80);
	String text = helper.getText(SearchUI.sensitiveSkinHeading);
	return text;
}


public void clickOnLearnMore() {
	helper.explicitWaitForInvisibilty(SearchUI.learnMore4, 80);
	helper.clickButton(SearchUI.learnMore4);
	log.info(" Clicked on the learn more button ");
	}


public String verifyTagPnG() {

	helper.explicitWaitForInvisibilty(SearchUI.tagPnG, 80);
	String text = helper.getText(SearchUI.tagPnG);
	return text;
}

public void clickOnRetailer() {
	helper.explicitWaitForInvisibilty(SearchUI.findRetailer, 80);
	helper.clickButton(SearchUI.findRetailer);
	log.info(" Clicked on the find retailers ");
	}

public String showProductStatus() {
	
	helper.explicitWaitForInvisibilty(SearchUI.productStatus, 80);
	String text = helper.getText(SearchUI.productStatus);
	return text;
	
}

public String outImg() {
	
	helper.explicitWaitForInvisibilty(SearchUI.outerImage, 90);
	String text = helper.getText(SearchUI.outerImage);
	return text;
}
	
public String innImg() {
	
	helper.explicitWaitForInvisibilty(SearchUI.innerImage, 90);
	String text = helper.getText(SearchUI.innerImage);
	return text;
}

}





