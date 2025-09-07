package StepDefinitions;


import java.util.List;
import java.util.Map;

import Utilities.ScenarioContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When; 



public class StepDefinitions {
	
	private final ScenarioContext context;
	public StepDefinitions() {
		this.context = new ScenarioContext();
		
	}
	public StepDefinitions(ScenarioContext context) {
		this.context=context;
	}
	
	@Given("I m on login page")
	public void i_m_on_login_page() throws Throwable {
	   System.out.println("I m on Login page");
	}

	@When("I Enter {string} as username")
	public void EnterUsername(String Username){
System.out.println("Entering Username as "+Username);
context.set("Username used", Username);
	}

	@When("I Enter {string} as password")
	public void i_EnterPwd(String pwd) {
		System.out.println("Entering Password as "+pwd);
	}
	
	@Then("following data should be there")
	public void following_data_should_be_there(DataTable table) {
	    List<Map<String,String>> datalist =  table.asMaps(String.class,String.class);
	    for(Map<String,String> data : datalist) {
	    	System.out.println("Table"+data.get("Table")+"--Value"+data.get("value"));
	    }
	    
	}
	
	@Then("following data should be displayed")
	public void following_data_should_be_displayed(DataTable dataTable) {
	   List<String> data = dataTable.asList();
	   for(String d : data) {
		   System.out.println(d);
	   }
	}
	
	@Given("I Load the Application URL")
	public void i_load_the_application_url() {
	    System.out.println("Background Section feature file:");
	}

	@When("^I Click on Submit$")
	public void i_Click_on_Submit() throws Throwable {
		System.out.println("Clicking Submit");
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
		System.out.println("Login Successful"+context.get("Username used", String.class));
		
	}

	@Then("^I need to be on Homepage$")
	public void i_need_to_be_on_Homepage() throws Throwable {
		System.out.println("On Homepage");
	}

	@When("I Enter {string} in Search Textbox")
	public void I_Enter_SearchKey(String SearchKey){
		System.out.println("Search Key Entered "+SearchKey);
		
	}
	@Given("^I m on Search page$")
	public void i_m_on_Search_page() throws Throwable {
System.out.println(" On SearchPage");
	}



	@When("^I Click on Search$")
	public void i_Click_on_Search() throws Throwable {
	 System.out.println("Clicking on search button"); 
	}

	@Then("^Search results should be displayed$")
	public void search_results_should_be_displayed() throws Throwable {
	    System.out.println("Search results displayed");
	}
	
}