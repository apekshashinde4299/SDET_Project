package priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseA() {
        System.out.println("Test Case A");
    }

    @Test(priority = -1)
    public void testCaseX() {
        System.out.println("Test Case X");
    }

    @Test
    public void testCaseM() {
        System.out.println("Test Case M");
    }

    @Test(priority = 'A')
    public void testCaseF() {
        System.out.println("Test Case F");
    }

    @Test(priority = -5)
    public void testCaseO() {
        System.out.println("Test Case O");
    }


}
