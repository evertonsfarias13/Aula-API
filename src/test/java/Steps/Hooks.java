package Steps;

import API.ApiUtils;
import Utils.ScenarioUtils;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends ApiUtils {

    @Before
    public void before(Scenario scenario) {
        ScenarioUtils.add(scenario);
        headers = new HashMap<>();
        params = new HashMap<>();
    }
    @After
    public void after(){
        ScenarioUtils.remove();
    }
}
