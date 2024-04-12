package testngExample;

import org.testng.annotations.*;

public class Check_BeforeAfterClassExample {

    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("Before Test Method");
    }
    @AfterTest
    public void afterTestMethod(){
        System.out.println("After Test Method");
    }
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class Method for Check");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class Method for Check");
    }

    @Test
    public void testCase_X(){
        System.out.println(" Test Case X");
    }
    @Test
    public void testCase_Y(){
        System.out.println(" Test Case Y");
    }
}
