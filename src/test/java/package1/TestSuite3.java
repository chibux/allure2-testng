package package1;

import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Story("Suite 3")
public class TestSuite3 {
    @Test
    public void testInSuite3(){
        System.out.println("Test in Suite 3");
    }
}
