package runner;

import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions
        (features = "src/test/resources/features",
    glue={"stepDefs","hooks"},
    plugin={
          "pretty",
            "html:test-output/report.html"
    }
        )
public class TestRunner  extends AbstractTestNGCucumberTests {


}
