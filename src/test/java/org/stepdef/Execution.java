package org.stepdef;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.pagerepo.HomePageRepo;
import org.pagerepo.PageRepo2;
import org.pagerepo.PageRepo3;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Execution {
	HomePageRepo hp=new HomePageRepo();
	PageRepo2 pr=new PageRepo2();
	PageRepo3 lv3 = new PageRepo3();
	@Given("launch the Application")
	public void launch_the_Application() {
		HookClass. driver.get("https://www.cheapair.com/");
	}

	@When("enter the credential details")
	public void enter_the_credential_details() {
	    HookClass.waitTime();
	    hp.getDestination().sendKeys("chennai");
	    HookClass.waitTime();
	    hp.getAirport().click();
	   // hp.getTraveler().click();
	    HookClass.clickMethod(hp.getDepart());
	   // hp.getReturn().sendKeys("Jun 24");
	    
	    HookClass.clickMethod(hp.getReturn());
	    HookClass.waitTime();
		   for(int i=1;i<4;i++) {
			   try {
				   HookClass.clickMethod(hp.getAdultCount());
			} catch (Exception e) {
				// TODO: handle exception
				HookClass.waitTime();
			}
		   }
		  
		   for(int i=1;i<=2;i++) {
			   try {
				   hp.getChildCount().click();
				   hp.getSeniorCount().click();
			} catch (Exception e) {
				// TODO: handle exception
				HookClass.waitTime();
			}
		  }

		   HookClass.Scroll(hp.getSearchFlight());
		   HookClass.clickMethod(hp.getSearchFlight());   

	}
	
	 
	@Then("find the list of flights")
	
		public void Select_the_fligth() {
			HookClass.window(1);
			pr.getClose().click();
			HookClass.waitTime();
			try {
				HookClass.clickMethod(pr.getCross());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("not visible");
			}	

		List<WebElement> price= pr.getPrice();

	    
		HookClass.clickMethod(pr.getDepartflight());
		HookClass.waitTime();
		HookClass.clickMethod(pr.getReturnflight());
		HookClass.waitTime();
		HookClass.Scroll(pr.getContinue());
		HookClass.clickMethod(pr.getContinue());
	

	}
	@And("Enter the details of passengers")
	public void detail(DataTable userdetails) 
	{
		List<List<String>> asList = userdetails.asLists();
		HookClass.waitTime();
		lv3.getFirstName1().sendKeys(asList.get(0).get(0));
		lv3.getLastName1().sendKeys(asList.get(0).get(1));
		HookClass.dropdown(lv3.getGender1(),asList.get(0).get(2));
		HookClass.dropdown(lv3.getDobMonth1(), asList.get(0).get(3));
		lv3.getDobDay1().sendKeys(asList.get(0).get(4));
		lv3.getDobYear1().sendKeys(asList.get(0).get(5));
		
		lv3.getFirstName2().sendKeys(asList.get(1).get(0));
		lv3.getLastName2().sendKeys(asList.get(1).get(1));
		HookClass.dropdown(lv3.getGender2(),asList.get(1).get(2));
		HookClass.dropdown(lv3.getDobMonth2(), asList.get(1).get(3));
		lv3.getDobDay2().sendKeys(asList.get(1).get(4));
		lv3.getDobYear2().sendKeys(asList.get(1).get(5));
		
		lv3.getFirstName3().sendKeys(asList.get(2).get(0));
		lv3.getLastName3().sendKeys(asList.get(2).get(1));
		HookClass.dropdown(lv3.getGender3(),asList.get(2).get(2));
		HookClass.dropdown(lv3.getDobMonth3(), asList.get(2).get(3));
		lv3.getDobDay3().sendKeys(asList.get(2).get(4));
		lv3.getDobYear3().sendKeys(asList.get(2).get(5));
		
		lv3.getFirstName4().sendKeys(asList.get(3).get(0));
		lv3.getLastName4().sendKeys(asList.get(3).get(1));
		HookClass.dropdown(lv3.getGender4(),asList.get(3).get(2));
		HookClass.dropdown(lv3.getDobMonth4(), asList.get(3).get(3));
		lv3.getDobDay4().sendKeys(asList.get(3).get(4));
		lv3.getDobYear4().sendKeys(asList.get(3).get(5));
		
		lv3.getFirstName5().sendKeys(asList.get(4).get(0));
		lv3.getLastName5().sendKeys(asList.get(4).get(1));
		HookClass.dropdown(lv3.getGender5(),asList.get(4).get(2));
		HookClass.dropdown(lv3.getDobMonth5(), asList.get(4).get(3));
		lv3.getDobDay5().sendKeys(asList.get(4).get(4));
		lv3.getDobYear5().sendKeys(asList.get(4).get(5));
		
		lv3.getFirstName6().sendKeys(asList.get(5).get(0));
		lv3.getLastName6().sendKeys(asList.get(5).get(1));
		HookClass.dropdown(lv3.getGender6(),asList.get(5).get(2));
		HookClass.dropdown(lv3.getDobMonth6(), asList.get(5).get(3));
		lv3.getDobDay6().sendKeys(asList.get(5).get(4));
		lv3.getDobYear6().sendKeys(asList.get(5).get(5));
		
		lv3.getFirstName7().sendKeys(asList.get(6).get(0));
		lv3.getLastName7().sendKeys(asList.get(6).get(1));
		HookClass.dropdown(lv3.getGender7(),asList.get(6).get(2));
		HookClass.dropdown(lv3.getDobMonth7(), asList.get(6).get(3));
		lv3.getDobDay7().sendKeys(asList.get(6).get(4));
		lv3.getDobYear7().sendKeys(asList.get(6).get(5));
		
		lv3.getFirstName8().sendKeys(asList.get(7).get(0));
		lv3.getLastName8().sendKeys(asList.get(7).get(1));
		HookClass.dropdown(lv3.getGender8(),asList.get(7).get(2));
		HookClass.dropdown(lv3.getDobMonth8(), asList.get(7).get(3));
		lv3.getDobDay8().sendKeys(asList.get(7).get(4));
		lv3.getDobYear8().sendKeys(asList.get(7).get(5));		
	}
	
	@When("Enter the cerdit card details")
	public void enter_the_cerdit_card_details(DataTable carddetails) {
		HookClass.Scroll(lv3.getCreditcardno());
	    List<List<String>> asLists = carddetails.asLists();
	    lv3.getCreditcardno().sendKeys(asLists.get(0).get(0));
	    
	    HookClass.dropdown(lv3.getExpMonth1(),asLists.get(0).get(1));
	    HookClass.dropdown(lv3.getExpYear1(),asLists.get(0).get(2));
	    lv3.getCvv().sendKeys(asLists.get(0).get(3));
	    lv3.getCardholdername().sendKeys(asLists.get(0).get(4));
	    HookClass.dropdown(lv3.getCountry(),asLists.get(0).get(5));
	    lv3.getAddress().sendKeys(asLists.get(0).get(6));
	    lv3.getPhonenumber().sendKeys(asLists.get(0).get(7));
	}
	



}
