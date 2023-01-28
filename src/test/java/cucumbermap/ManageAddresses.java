package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class ManageAddresses {
	@When ("^user click on manage addreses$")
	public void clickonmanageAddress() throws InterruptedException {
		Thread.sleep(5000);
		Object[] Pen= new Object[1];
		Pen[0]="(//div[normalize-space()='Manage Addresses'])[1]";
	
		Hashtable<String, Object> output10= SeleniumOperations.clickonElement(Pen);
		HTMLReportGenerator.StepDetails(output10.toString(), "^user click on manage addreses$", output10.get("MESSAGE").toString());
	}
	@When ("^user click on ad me addresss$")
	public void clickonNewAddress() throws InterruptedException {
		Thread.sleep(5000);
		Object[] Pen1= new Object[1];
		Pen1[0]="//div[@class='_1QhEVk']";
		Hashtable<String, Object> output11= SeleniumOperations.clickonElement(Pen1);
		HTMLReportGenerator.StepDetails(output11.toString(), "^user click on ad me addresss$", output11.get("MESSAGE").toString());
	}
	@When ("^user enter (.*) as name$")
	public void EnterName(String nm) throws InterruptedException {
		Object[] Pen2= new Object[2];
		Pen2[0]="//input[@name='name']";
		Pen2[1]=nm;
		Hashtable<String, Object> output12= SeleniumOperations.UserDetails(Pen2);
		HTMLReportGenerator.StepDetails(output12.toString(), "^user enter (.*) as name$", output12.get("MESSAGE").toString());
	}
	@When ("^user enter (.*) as mobile number$")
	public void EnterMobileNumber(String mob) throws InterruptedException {
		Thread.sleep(3000);
		Object[] Pen3= new Object[2];
		Pen3[0]="(//input[@name='phone'])[1]";
		Pen3[1]=mob;
		Hashtable<String, Object> output13= SeleniumOperations.UserDetails(Pen3);
		HTMLReportGenerator.StepDetails(output13.toString(), "^user enter (.*) as mobile number$", output13.get("MESSAGE").toString());
}
	@When ("^user enter (.+) as pincode$")
	public void EnterPincode(String pin) throws InterruptedException {
		Thread.sleep(5000);
		Object[] Pen4= new Object[2];
		Pen4[0]="//input[@name='pincode']";
		Pen4[1]=pin;
		Hashtable<String, Object> output14= SeleniumOperations.UserDetails(Pen4);
		HTMLReportGenerator.StepDetails(output14.toString(), "^user enter (.+) as pincode$", output14.get("MESSAGE").toString());
}
	@When ("^user enter (.*) as locality$")
	public void Enterlocality(String loc) throws InterruptedException {
		Thread.sleep(5000);
		Object[] Pen5= new Object[2];
		Pen5[0]="//input[@name='addressLine2']";
		Pen5[1]=loc;
		Hashtable<String, Object> output15= SeleniumOperations.UserDetails(Pen5);
		HTMLReportGenerator.StepDetails(output15.toString(), "^user enter (.*) as locality$", output15.get("MESSAGE").toString());
	
}
	@When ("^user enter (.*) as address details$")
	public void AddressDetails(String addr) throws InterruptedException {
		Thread.sleep(5000);
		Object[] pen8= new Object[2];
		pen8[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		pen8[1]=addr;
		Hashtable<String, Object> output18= SeleniumOperations.UserDetails(pen8);
		HTMLReportGenerator.StepDetails(output18.toString(), "^user enter (.*) as address details$", output18.get("MESSAGE").toString());
	}
	@When ("^user select Home as address type$")
	public void Enter() throws InterruptedException {
		Thread.sleep(5000);
		Object[] pen6= new Object[1];
		pen6[0]="(//div[@class='_1XFPmK'])[1]";
		Hashtable<String, Object> output16= SeleniumOperations.clickonElement(pen6);
		HTMLReportGenerator.StepDetails(output16.toString(), "^user select Home as address type$", output16.get("MESSAGE").toString());
}
	@When ("^user click on Save button$") 
	public void clickonHome() throws InterruptedException {
		Thread.sleep(5000);
		Object[] pen7= new Object[1];
		pen7[0]="//button[normalize-space()='Save']";
		Hashtable<String, Object> output17= SeleniumOperations.clickonElement(pen7);
		HTMLReportGenerator.StepDetails(output17.toString(), "^user click on Save button$", output17.get("MESSAGE").toString());
}
	@Then ("^address added sucessfully$")
	public void AddSuccesfully() {
		
	}
	@When ("^user click on delete saved address$")
	public void AddressDelete() {
		Object[] pen10= new Object[1];
		pen10[0]="(//*[@class='dpjmKp'])[1]";
		Hashtable<String, Object> output20= SeleniumOperations.loginWindow(pen10);
		HTMLReportGenerator.StepDetails(output20.toString(), "user click on delete saved address$", output20.get("MESSAGE").toString());
	}
	@Then ("^saved address delete$")
	public void AddDel() {
		Object[] pen11= new Object[1];
		pen11[0]="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]";
		Hashtable<String, Object> output18= SeleniumOperations.clickonElement(pen11);
		HTMLReportGenerator.StepDetails(output18.toString(), "^user click on Save button$", output18.get("MESSAGE").toString());
	}
	
}
	