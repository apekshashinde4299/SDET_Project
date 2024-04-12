package testngExample;


import org.testng.annotations.*;

public class BeforeAfterExample {

    @BeforeClass
    public static void beforeByClass() {
        System.out.println("Before by Class");
    }

    @AfterClass
    public static void afterByClass() {
        System.out.println("After by Class");
    }

    @BeforeMethod
    public void preMethod() {
        System.out.println("Before Method ");
    }

    @Test
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase3() {
        System.out.println("Test Case 3");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }
}
