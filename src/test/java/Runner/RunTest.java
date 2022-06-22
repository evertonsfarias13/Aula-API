package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//o cucumber option e para definir opções do cucumber..aqui estou definindo um arquivo html
@CucumberOptions(plugin = {"html:target/report.html"},
        features = {"src/test/resources/Features"}, glue = {"steps"}, tags = "@Gorest")

public class RunTest {

}
