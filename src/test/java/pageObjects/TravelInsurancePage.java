package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelInsurancePage extends BasePage{

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public TravelInsurancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[7]//a[1]//div[1]//div[1]")
	WebElement travelInsurance;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement searchCountry;
	
	@FindBy(xpath = "//li[@class='search-item'][1]")
	WebElement countryName;
	
	@FindBy(xpath = "//article[@class='newPq_duration_wrap']//div[1]")
	WebElement clickDateBox;
	
	@FindBy(xpath = "//button[@aria-label='Oct 28, 2024']")
	WebElement startDate;
	
	@FindBy(xpath = "//button[@aria-label='Nov 4, 2024']")
	WebElement endDate;
	
	// //*[@id="modal-root"]/section/article/div/div/div[2]/div[3]/div/button
	//button[normalize-space()='Done']
	@FindBy(xpath ="//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[3]/div/button[normalize-space()='Done']")
	WebElement clickDateDone;
	
	@FindBy(xpath = "//a[normalize-space()='+ Add travellers']")
	WebElement addtravellers;
	
	// //*[@id="modal-root"]/section/article/div/div/div[2]/div[1]/div[1]/div[2]/label
	@FindBy(xpath = "//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[1]/div[1]/div[2]/label" )
	WebElement travellers;
	
	@FindBy(xpath = "(//div[@id='divarrow_undefined'])[1]")
	WebElement firstAge;
	
	@FindBy(xpath = "//*[@id=\"optionBox_0_wrapper\"]/div[24]/label")
	WebElement age22;
	
	@FindBy(xpath = "(//div[@id='divarrow_undefined'])[2]")
	WebElement secondAge;
	
	@FindBy(xpath = "//*[@id=\"optionBox_1_wrapper\"]/div[23]/label")
	WebElement age21;
	
	@FindBy(xpath = "//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[2]/div/div[2]/label")
	WebElement medical;
	
	@FindBy(xpath = "//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[3]/div/button")
	WebElement ageDone;
	
	////button[contains(text(),'View plans ›')]
	@FindBy(xpath = "//*[@id=\"newPq_mainWrapper\"]/section/section[2]/div/button[contains(text(),'View plans ›')]")
	WebElement viewPlans;
	
//	@FindBy(xpath = "//h2[normalize-space()='Showing 25 plans for 2 members']")
//	WebElement showPlanExists;
//	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
//	WebElement sort;
	
	public void clickTravelInsurance() {
		travelInsurance.click();
	}
	
	public void searchCountry(String country) {
		searchCountry.sendKeys(country);
		searchCountry.click();
	}
	public void clickCountry() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='search-item'][1]")));
		wait.until(ExpectedConditions.elementToBeClickable(countryName));
		countryName.click();
	}
	public void clickDateBox() {
		clickDateBox.click();
	}
	public void clickOnStartDate() {
		startDate.click();
	}
	public void clickOnEndDate() {
		endDate.click();
	}
	public void clickDateDone() throws InterruptedException {
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[3]/div/button")));
		//wait.until(ExpectedConditions.elementToBeClickable(clickDateDone));
		js.executeScript("arguments[0].click();", clickDateDone);
		//clickDateDone.click();
	}
	public void addTravellers() {
		addtravellers.click();
	}
	public void travellers() {
		js.executeScript("arguments[0].click();", travellers);
	}
	public void firstAge() {
		firstAge.click();
		age22.click();
	}
	public void secondAge() {
		secondAge.click();
		age21.click();
	}
	public void medical() {
		medical.click();
	}
	public void ageDone() {
		js.executeScript("arguments[0].click();", ageDone);
	}
	public void viewPlans() {
		//js.executeScript("arguments[0].click();", viewPlans);
		//viewPlans.click();
		//js.executeScript("document.getElementsByClassName('travel_main_cta')[0].click();");
//		Actions ac = new Actions(driver);
//		ac.moveToElement(viewPlans).perform();
		js.executeScript("arguments[0].scrollIntoView(true);", viewPlans);
		wait.until(ExpectedConditions.elementToBeClickable(viewPlans));
		js.executeScript("arguments[0].click();", viewPlans);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Showing 25 plans for 2 members']")));

	}
//	public void showPlanExists() {
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Showing 25 plans for 2 members']")));
//	}
	public void sort() {
		//js.executeScript("arguments[0].click();", sort);
	}
	
}
