package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\Phases 5webeclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("Prakash@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		password.sendKeys("Prakash@123");
		Thread.sleep(1000);
		
		WebElement repassword = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repassword.sendKeys("Prakash@123");
		Thread.sleep(1000);
		
		WebElement country = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
		country.sendKeys("India");
		
		WebElement firstname = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		firstname.sendKeys("Prakash");
		
		WebElement lastname = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		lastname.sendKeys("Murugesan");
		
		WebElement jobTitle = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		jobTitle.sendKeys("SE");
		
		WebElement workPhone = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		workPhone.sendKeys("8189000022");
		
		WebElement companyName = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		companyName.sendKeys("XYZ Company");
		
		WebElement address = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		address.sendKeys("87/3 Pallaiyar kovil st, Nedugundrum");
		
		WebElement city = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		state.sendKeys("Tamil Nadu");
		
		WebElement pinCode = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		pinCode.sendKeys("600127");
		
		Thread.sleep(1000);
		WebElement register= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		register.click();
	}


}
