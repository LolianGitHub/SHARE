package Auto.Cucumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"},
 features={"src/test/features"},
 glue = {"lsy.auto.web.test.steps"},
 dryRun = false)


public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}