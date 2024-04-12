package failtestcases;

import org.testng.IAnnotationTransformer;

public class AutomaticallyRunTestScript implements IAnnotationTransformer {

    public void transform(org.testng.annotations.ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod) {
    annotation.setRetryAnalyzer(IRetryAnalyzerForFailScript.class);
    }
}

