package org.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdef.HookClass;

public class HomePageRepo  {
	public HomePageRepo() {
		PageFactory.initElements(HookClass.driver, this);
	}
@FindBy(id="to1")
private WebElement destination;
@FindBy(xpath="//span[text()='Airport']")
private WebElement airport;
@FindBy(xpath="(//tbody//td//a[text()='20'])[2]")
private WebElement depart;
@FindBy(xpath="(//tbody//td//a[text()='24'])[2]")
private WebElement Return;

/*@FindBy(id="options")
private WebElement Traveler;*/
@FindBy(xpath="(//button[@type='button'])[2]")
private WebElement AdultCount;
@FindBy(xpath="(//button[@type='button'])[6]")
private WebElement childCount;
@FindBy(xpath="(//button[@type='button'])[4]")
private WebElement seniorCount;
@FindBy(xpath="//button[text()='Search Flights']")
private WebElement searchFlight;


public WebElement getSearchFlight() {
	return searchFlight;
}
public WebElement getSeniorCount() {
	return seniorCount;
}
public WebElement getChildCount() {
	return childCount;
}
public WebElement getAdultCount() {
	return AdultCount;
}
/*public WebElement getTraveler() {
	return Traveler;
}*/
public WebElement getReturn() {
	return Return;
}
public WebElement getDepart() {
	return depart;
}

public WebElement getAirport() {
	return airport;
}
public WebElement getDestination() {
	return destination;
}
}


