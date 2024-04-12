package testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassExample {
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class Method");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class Method");
    }

    @Test
     public void testCase_P(){
        System.out.println(" Test Case P");
    }
    @Test
    public void testCase_Q(){
        System.out.println(" Test Case Q");
    }

}
