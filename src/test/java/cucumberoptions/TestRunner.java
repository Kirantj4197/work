package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features",
glue="stepdefinitions",stepNotifications=true)

public class TestRunner {
	
	private void Sysout() {
		// TODO Auto-generated method stub

		
		System.out.println("ranjith tj");
		System.out.println("tharmaraj");
		System.out.println("jayanthi");
		
		System.out.println("adding arsenal coach arteta");
	}

}
