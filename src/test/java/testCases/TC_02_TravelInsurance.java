package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TravelInsurancePage;
import testBase.BaseClass;

public class TC_02_TravelInsurance extends BaseClass {
  
	@Test
	void travelinsurance() {
		logger.info("**** Started TC_02_TravelInsurance *****");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			TravelInsurancePage travel = new TravelInsurancePage(driver);
			travel.clickTravelInsurance();
			
			travel.searchCountry(p.getProperty("country"));
			travel.clickCountry();
			travel.clickDateBox();
			travel.clickOnStartDate();
			travel.clickOnEndDate();
			travel.clickDateDone();
			travel.addTravellers();
			travel.travellers();
			travel.firstAge();
			travel.secondAge();
			travel.medical();
			travel.ageDone();
			travel.viewPlans();
			//Thread.sleep(4000);
			//travel.showPlanExists();
			//travel.sort();
			Thread.sleep(5000);
		}
		catch(Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());
		}

	}
}
