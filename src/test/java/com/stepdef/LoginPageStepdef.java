package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepdef {
	WebDriver driver;

	@When("Am enter the {string}, {string} and enter the login button")
	public void usernameAndPasswordAndLogin(String userName, String password) {
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

	@When("I search the Hotel {string},{string},{string},{string},{string},{string} and select the Hotel")
	public void searchHotelAndSelectHotel(String location, String hotel, String roomType, String noOfRooms,
			String adult, String child) {
		WebElement dDnLocation = driver.findElement(By.id("location"));
		new Select(dDnLocation).selectByVisibleText(location);

		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		new Select(dDnHotel).selectByVisibleText(hotel);

		WebElement dDnType = driver.findElement(By.id("room_type"));
		new Select(dDnType).selectByVisibleText(roomType);

		WebElement dDnnoOfRooms = driver.findElement(By.id("room_nos"));
		new Select(dDnnoOfRooms).selectByVisibleText(noOfRooms);

		WebElement dDnAdult = driver.findElement(By.id("adult_room"));
		new Select(dDnAdult).selectByVisibleText(adult);

		WebElement dDnChild = driver.findElement(By.id("child_room"));
		new Select(dDnChild).selectByVisibleText(child);

		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}

	@When("I enter the details {string},{string},{string},{string},{string},{string},{string},{string} and order the Hotel")
	public void enterDetailsAndOrder(String firstName, String lastName, String address, String cardNo, String cardType,
			String month, String year, String cvv) {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("cc_num")).sendKeys(cardNo);

		WebElement dDnCardType = driver.findElement(By.id("cc_type"));
		new Select(dDnCardType).selectByVisibleText(cardType);

		WebElement dDnMonth = driver.findElement(By.id("cc_exp_month"));
		new Select(dDnMonth).selectByVisibleText(month);

		WebElement dDnYear = driver.findElement(By.id("cc_exp_year"));
		new Select(dDnYear).selectByVisibleText(year);

		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
		driver.findElement(By.id("book_now")).click();
	}

	@Then("I should get the order Id")
	public void orderId() {

		String orderId = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(orderId);
	}

}
