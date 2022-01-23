package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {

	WebDriver driver = null;
	
	//Defining Object Locators
	//Landing Page elements
	By acceptcookies_button = By.id("onetrust-accept-btn-handler");
	By createPoll_button = By.xpath("//span[@class='CreatePollMenu-createMenuLabel']");
	
	//CreatePoll Page1
	By enterTitle_textbox = By.xpath("//input[@id='d-pollTitle']");
	By enterLocation = By.xpath("//input[@id='d-pollLocation']");
	By selectLocation = By.xpath("//li[@data-popular-option-category='ONLINE']//div[@class='d-location d-suggestionText']");
	By addNote_textbox = By.xpath("//textarea[@id='d-pollDescription']");
	By continue_button = By.xpath("//div[contains(text(),'Continue')]");
	
	
	//CreatePoll Page2
	By text_option = By.xpath("//a[normalize-space()='Text']");
	By option1 = By.xpath("//textarea[@id='d-wizardChoicesView0']");
	By option2 = By.xpath("//textarea[@id='d-wizardChoicesView1']");
	By option3 = By.xpath("//textarea[@id='d-wizardChoicesView2']");
	By continue_button2 = By.xpath("//section[@id='d-wizardOptionsNavigationView']//div[@class='d-text'][normalize-space()='Continue']");
	
	
	//PollSettings Page
	By continue_button3 = By.xpath("//*[@id=\"d-wizardSettingsNavigationView\"]/div/div/div[2]/button[2]/div/div[1]/div/div");
	
	//UserInfo Page
	By addUsername = By.xpath("//*[@id=\"d-initiatorName\"]");
	By addEmail = By.xpath("//*[@id=\"d-initiatorEmail\"]");
	By finish_button = By.xpath("//*[@id=\"d-persistPollButton\"]/div/div[1]/div/div");
	
	
	//Voting Page
	By select_option= By.xpath("//*[@id=\"d-pollView\"]/article/div/div/div/ul/li[1]/label/div[1]/div[1]");
	By submit_button = By.xpath("//*[@id=\"d-pollActionBarView\"]/div/div/div[3]/button");
	
	
		
	//Actions on page objects
	
	public PageObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickCookiesButton() {
		
		driver.findElement(acceptcookies_button).click();
		
	}
	
	public void clickCreateButton() {
		
		driver.findElement(createPoll_button).click();
	}
			
	
	public void enterPollTitle(String text) {
	
		driver.findElement(enterTitle_textbox).sendKeys(text);
		
	} 
	
	
	public void chooseLocation() {
		driver.findElement(enterLocation).click();
		driver.findElement(selectLocation).click();
	}
	
	public void addNote(String text) 	{
		driver.findElement(addNote_textbox).sendKeys(text);
	}
	
	public void continue_button() {
		driver.findElement(continue_button).click();
	}
		
	public void text_option() {
		driver.findElement(text_option).click();
	}
	
	public void enteroption1(String text) 	{
		driver.findElement(option1).sendKeys(text);
	}
	
	public void enteroption2(String text) 	{
		driver.findElement(option2).sendKeys(text);
	}
	
	public void enteroption3(String text) 	{
		driver.findElement(option3).sendKeys(text);
	}
	
	public void continue_button2() {
		driver.findElement(continue_button2).click();
	}
	
	public void continue_button3() {
		driver.findElement(continue_button3).click();
	}
	
	public void addUsername(String text)
	{
		driver.findElement(addUsername).sendKeys(text);
	}	
	
	public void addEmail(String text) 	{
		driver.findElement(addEmail).sendKeys(text);
	}	
	
	public void finish_button() 	{
		driver.findElement(finish_button).click();
	}
		
	public void votePoll() {
		driver.findElement(select_option).click();
		driver.findElement(submit_button).click();
	}
	
}
