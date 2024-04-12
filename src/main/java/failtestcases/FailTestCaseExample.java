package failtestcases;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class FailTestCaseExample {


    @Test(retryAnalyzer = IRetryAnalyzerForFailScript.class)
    public void testCase_11(){
        Assert.assertTrue(false);
        System.out.println("Test Case 11");
    }
    @Test(retryAnalyzer = IRetryAnalyzerForFailScript.class)
    public void testCase_22(){
        System.out.println("Test Case 22");
    }
    @Test(retryAnalyzer = IRetryAnalyzerForFailScript.class)
    public void testCase_33(){
        System.out.println("Test Case 33");
    }
    @Test(retryAnalyzer = IRetryAnalyzerForFailScript.class)
    public void testCase_44(){
        System.out.println("Test Case 44");
    }
    @Test(retryAnalyzer = IRetryAnalyzerForFailScript.class)
    public void testCase_55(){
        System.out.println("Test Case 55");
    }
}
