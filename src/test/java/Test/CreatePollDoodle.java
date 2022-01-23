package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.PageObjects;

public class CreatePollDoodle {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		doodleTest();
		
	}
		
	public static void doodleTest () {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
		PageObjects object = new PageObjects(driver);
		
		driver.get("https://doodle.com/en");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		object.clickCookiesButton();
		object.clickCreateButton();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		object.enterPollTitle("Test Poll");
		object.chooseLocation();
		object.addNote("This is a test poll");
		object.continue_button();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		object.text_option();
		object.enteroption1("Option A");
		object.enteroption2("Option B");
		object.enteroption3("Option C");
		object.continue_button2();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		object.continue_button3();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		object.addUsername("Username");
		object.addEmail("testemail@aaaa.com");
		object.finish_button();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		object.votePoll();
		
		
	}
	

}
