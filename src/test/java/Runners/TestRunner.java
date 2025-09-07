package Runners;    
import io.cucumber.testng.AbstractTestNGCucumberTests;
    import io.cucumber.testng.CucumberOptions;
    import org.testng.annotations.DataProvider;

    @CucumberOptions(
    		features="src/test/resources/Features",
    		glue={"StepDefinitions","hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        dryRun=false,
        monochrome = true,
        tags="@Smoke"
    )
    public class TestRunner extends AbstractTestNGCucumberTests {

        // Optional: Override scenarios() for parallel execution with TestNG's DataProvider
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }