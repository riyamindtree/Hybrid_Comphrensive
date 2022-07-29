package pageobject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.HomeUI;
import utilities.Logs;

public class HomePage {
	
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public HomePage() {
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	
public void searchingBox(String text) {
		helper.explicitWaitForInvisibilty(HomeUI.searchBox, 80);
		helper.sendText(HomeUI.searchBox, text);
		log.info(" Product name entered ");
	}
	
	
	
	
public void clickSearchButton() {
		
		helper.explicitWaitForInvisibilty(HomeUI.button,80);
		helper.clickButton(HomeUI.button);
		log.info(" Search Button Clicked ");
	}

public void clickClosePopUp() {
	
	helper.explicitWaitForInvisibilty(HomeUI.closePopUp, 80);
	helper.clickButton(HomeUI.closePopUp);
	log.info(" Pop up closed ");
}


public void hoverOnShopProduct() {
	helper.explicitWaitForInvisibilty(HomeUI.shopProducts, 80);
	helper.hover(HomeUI.shopProducts);
	log.info(" Hover on the Shop Product ");
}

public void clickOnLiquid() {
	helper.explicitWaitForInvisibilty(HomeUI.liquid, 20);
	helper.clickButton(HomeUI.liquid);
	log.info(" Liquid clicked inside the shop product category ");
}


public void clickAdditivesFromByNeed() {
	helper.scrollUntilVisible(HomeUI.byNeed, 80);
	helper.clickButton(HomeUI.byNeed);
	log.info(" Clicked on Additives in footer section  ");
	
}

public void clickOnLearnMoreButton() {
	helper.explicitWaitForInvisibilty(HomeUI.learnMore, 20);
	helper.clickButton(HomeUI.learnMore);
	log.info(" Liquid clicked");
}

public void clickOnWhatNewTab() {
	helper.explicitWaitForInvisibilty(HomeUI.whatNew, 20);
	helper.clickButton(HomeUI.whatNew);
	log.info(" Clicked on what's new ");
}


public void clickOnDeepClean() {
	
	helper.scrollUntilVisible(HomeUI.senstive, 90);
	helper.clickButton(HomeUI.senstive);
	log.info(" Clicked on deep clean ");
}

public void clickOnContactTab() {
	helper.explicitWaitForInvisibilty(HomeUI.contact, 20);
	helper.clickButton(HomeUI.contact);
	log.info(" Clicked on the contact tab ");
}

public void hoverOnCommitment() {
	helper.explicitWaitForInvisibilty(HomeUI.commitment, 80);
	helper.hover(HomeUI.commitment);
	log.info("Hover on the our commitment ");
}

public void clickOnSafety() {
	
	helper.explicitWaitForInvisibilty(HomeUI.safety, 80);
	helper.clickButton(HomeUI.safety);
	log.info(" Clicked on the ingredients and safety ");
}

public void washClothesTab() {
	
	helper.explicitWaitForInvisibilty(HomeUI.washClothes, 80);
	helper.clickButton(HomeUI.washClothes);
	log.info(" Clicked on the How to wash clothes tab ");
}

public void clickFabricTab() {
	
	helper.explicitWaitForInvisibilty(HomeUI.fabric, 80);
	helper.clickButton(HomeUI.fabric);
	log.info(" Clicked on washing fabrics and colors");
}

public void clickOnCoupons() {
	
	helper.explicitWaitForInvisibilty(HomeUI.coupons, 80);
	helper.clickButton(HomeUI.coupons);
	log.info(" Clicked on the coupons and rewards ");
}

public void clickOnLaundryInFooter() {
	

    helper.scrollUntilVisible(HomeUI.whiteness, 80);
	helper.clickButton(HomeUI.whiteness);
	log.info("Clicked on the whiteness under by need section ");
}


}


