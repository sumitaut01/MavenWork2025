package org.example.Module2;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class Module2Tests {
    @Test(groups = "perftest")
    public void Test1(ITestContext context) {
        System.out.println("Running Test 1 in module 2");
    }

    @Test(groups = "functest")
    public void Test2(ITestContext context) {
        System.out.println("Running Test 2 in module 2");
    }

}





