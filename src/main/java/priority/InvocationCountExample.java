package priority;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 100, invocationTimeOut = 1000)
    public void testCaseMethod() {
        System.out.println("Test Case Method");
    }
}
