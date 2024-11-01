package setup;

import drivermanager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {

    @BeforeTest
    public void setup(){
        DriverManager.getInstance().createDriver();
    }

    @AfterTest
    public void teardown(){
        DriverManager.getInstance().closeDriver();
    }
}
