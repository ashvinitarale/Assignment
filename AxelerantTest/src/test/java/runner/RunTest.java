/**
 * 
 */
package runner;

/**
 * @author Ashvini
 *
 */
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = "src/test/resources/feature",
		glue = {"stepDefination"}		
		) 

public class RunTest {

}
