package package1;

import io.qameta.allure.Story;
import org.testng.annotations.*;

@Story("Suite 1")
public class TestSuite1{
    @BeforeClass
    public void beforeClassInTestSuite1(){
        System.out.println("Before Class in Suite 1");
    }

    @Test
    public void testInSuite1(){
        System.out.println("Test 1 in Suite 1");
    }

    @AfterClass
    public void afterClassInTestSuite1(){ System.out.println("After Class in Suite 1");}
}
