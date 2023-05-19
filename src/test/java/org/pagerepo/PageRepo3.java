package org.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdef.HookClass;

public class PageRepo3 {
	public PageRepo3() {
		PageFactory.initElements(HookClass.driver,this);
	}
	@FindBy(id = "firstName1")
	private WebElement FirstName1;
	
	@FindBy(id = "firstName2")
	private WebElement FirstName2;
	
	@FindBy(id = "firstName3")
	private WebElement FirstName3;
	
	@FindBy(id = "firstName4")
	private WebElement FirstName4;
	
	@FindBy(id = "firstName5")
	private WebElement FirstName5;
	
	@FindBy(id = "firstName6")
	private WebElement FirstName6;
	
	@FindBy(id = "firstName7")
	private WebElement FirstName7;
	
	@FindBy(id = "firstName8")
	private WebElement FirstName8;
	
	@FindBy(id = "lastName1")
	private WebElement lastName1;
	
	@FindBy(id = "lastName2")
	private WebElement lastName2;
	
	@FindBy(id = "lastName3")
	private WebElement lastName3;
	
	@FindBy(id = "lastName4")
	private WebElement lastName4;
	
	@FindBy(id = "lastName5")
	private WebElement lastName5;
	
	@FindBy(id = "lastName6")
	private WebElement lastName6;
	
	@FindBy(id = "lastName7")
	private WebElement lastName7;
	
	@FindBy(id = "lastName8")
	private WebElement lastName8;
	
	@FindBy(id = "gender1")
	private WebElement gender1;
	
	@FindBy(id = "gender2")
	private WebElement gender2;
	
	@FindBy(id = "gender3")
	private WebElement gender3;
	
	@FindBy(id = "gender4")
	private WebElement gender4;
	
	@FindBy(id = "gender5")
	private WebElement gender5;
	
	@FindBy(id = "gender6")
	private WebElement gender6;
	
	@FindBy(id = "gender7")
	private WebElement gender7;
	
	@FindBy(id = "gender8")
	private WebElement gender8;
	
	@FindBy(id = "dobMonth1")
	private WebElement dobMonth1;
	
	@FindBy(id = "dobMonth2")
	private WebElement dobMonth2;
	
	@FindBy(id = "dobMonth3")
	private WebElement dobMonth3;
	
	@FindBy(id = "dobMonth4")
	private WebElement dobMonth4;
	
	@FindBy(id = "dobMonth5")
	private WebElement dobMonth5;
	
	@FindBy(id = "dobMonth6")
	private WebElement dobMonth6;
	
	@FindBy(id = "dobMonth7")
	private WebElement dobMonth7;
	
	@FindBy(id = "dobMonth8")
	private WebElement dobMonth8;
	
	@FindBy(id = "dobDay1")
	private WebElement dobDay1;
	
	@FindBy(id = "dobDay2")
	private WebElement dobDay2;
	
	@FindBy(id = "dobDay3")
	private WebElement dobDay3;
	
	@FindBy(id = "dobDay4")
	private WebElement dobDay4;
	
	@FindBy(id = "dobDay5")
	private WebElement dobDay5;
	
	@FindBy(id = "dobDay6")
	private WebElement dobDay6;
	
	@FindBy(id = "dobDay7")
	private WebElement dobDay7;
	
	@FindBy(id = "dobDay8")
	private WebElement dobDay8;
	
	@FindBy(id = "dobYear1")
	private WebElement dobYear1;
	
	@FindBy(id = "dobYear2")
	private WebElement dobYear2;
	
	@FindBy(id = "dobYear3")
	private WebElement dobYear3;
	
	@FindBy(id = "dobYear4")
	private WebElement dobYear4;
	
	@FindBy(id = "dobYear5")
	private WebElement dobYear5;
	
	@FindBy(id = "dobYear6")
	private WebElement dobYear6;
	
	@FindBy(id = "dobYear7")
	private WebElement dobYear7;
	
	@FindBy(id = "dobYear8")
	private WebElement dobYear8;
	
	@FindBy(id = "ccNum1")
	private WebElement creditcardno;
	
	@FindBy(id = "expMonth1")
	private WebElement expMonth1;
	
	@FindBy(id = "expYear1")
	private WebElement expYear1;
	
	@FindBy(id = "paymentName1")
	private WebElement cardholdername;
	
	@FindBy(id = "paymentCountry1")
	private WebElement country;
	
	@FindBy(id = "paymentAddress1")
	private WebElement address;
	
	@FindBy(id = "paymanetCity1")
	private WebElement city;
	
	@FindBy(id = "paymentPhone1")
	private WebElement phonenumber;
	
	@FindBy(id = "cvv1")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getExpMonth1() {
		return expMonth1;
	}

	public WebElement getExpYear1() {
		return expYear1;
	}

	public WebElement getCardholdername() {
		return cardholdername;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getFirstName1() {
		return FirstName1;
	}

	public WebElement getFirstName2() {
		return FirstName2;
	}

	public WebElement getFirstName3() {
		return FirstName3;
	}

	public WebElement getFirstName4() {
		return FirstName4;
	}

	public WebElement getFirstName5() {
		return FirstName5;
	}

	public WebElement getFirstName6() {
		return FirstName6;
	}

	public WebElement getFirstName7() {
		return FirstName7;
	}

	public WebElement getFirstName8() {
		return FirstName8;
	}

	public WebElement getLastName1() {
		return lastName1;
	}

	public WebElement getLastName2() {
		return lastName2;
	}

	public WebElement getLastName3() {
		return lastName3;
	}

	public WebElement getLastName4() {
		return lastName4;
	}

	public WebElement getLastName5() {
		return lastName5;
	}

	public WebElement getLastName6() {
		return lastName6;
	}

	public WebElement getLastName7() {
		return lastName7;
	}

	public WebElement getLastName8() {
		return lastName8;
	}

	public WebElement getGender1() {
		return gender1;
	}

	public WebElement getGender2() {
		return gender2;
	}

	public WebElement getGender3() {
		return gender3;
	}

	public WebElement getGender4() {
		return gender4;
	}

	public WebElement getGender5() {
		return gender5;
	}

	public WebElement getGender6() {
		return gender6;
	}

	public WebElement getGender7() {
		return gender7;
	}

	public WebElement getGender8() {
		return gender8;
	}

	public WebElement getDobMonth1() {
		return dobMonth1;
	}

	public WebElement getDobMonth2() {
		return dobMonth2;
	}

	public WebElement getDobMonth3() {
		return dobMonth3;
	}

	public WebElement getDobMonth4() {
		return dobMonth4;
	}

	public WebElement getDobMonth5() {
		return dobMonth5;
	}

	public WebElement getDobMonth6() {
		return dobMonth6;
	}

	public WebElement getDobMonth7() {
		return dobMonth7;
	}

	public WebElement getDobMonth8() {
		return dobMonth8;
	}

	public WebElement getDobDay1() {
		return dobDay1;
	}

	public WebElement getDobDay2() {
		return dobDay2;
	}

	public WebElement getDobDay3() {
		return dobDay3;
	}

	public WebElement getDobDay4() {
		return dobDay4;
	}

	public WebElement getDobDay5() {
		return dobDay5;
	}

	public WebElement getDobDay6() {
		return dobDay6;
	}

	public WebElement getDobDay7() {
		return dobDay7;
	}

	public WebElement getDobDay8() {
		return dobDay8;
	}

	public WebElement getDobYear1() {
		return dobYear1;
	}

	public WebElement getDobYear2() {
		return dobYear2;
	}

	public WebElement getDobYear3() {
		return dobYear3;
	}

	public WebElement getDobYear4() {
		return dobYear4;
	}

	public WebElement getDobYear5() {
		return dobYear5;
	}

	public WebElement getDobYear6() {
		return dobYear6;
	}

	public WebElement getDobYear7() {
		return dobYear7;
	}

	public WebElement getDobYear8() {
		return dobYear8;
	}
	
	
}


