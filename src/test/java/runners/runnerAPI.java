package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"steps"},
        features = {"src/test/java/features/API.feature"},
        tags = "@API"
)

public class runnerAPI {
}
