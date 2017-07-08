package package1;

import io.qameta.allure.Story;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Story("Suite 2")
public class TestSuite2{
    @BeforeClass
    public void beforeClassInTestSuite2(){
        System.out.println("Before Class in Suite 2");
    }

    @Test
    public void testInSuite2(){
        System.out.println("Test in Suite 2");
    }

    @AfterClass
    public void afterClassInTestSuite2(){ System.out.println("After Class in Suite 2");}
}
