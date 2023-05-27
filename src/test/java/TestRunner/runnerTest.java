package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/java/features"},glue = "Step_Definition",tags = "@tag123")
public class runnerTest {
	

}
