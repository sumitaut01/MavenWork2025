package org.example.Module1;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class Module1Tests {
    @Test(groups = "functest")
    public void Test1(ITestContext context) {
        System.out.println("Running Test 1 in module 1");


        System.out.println(System.getProperty("mycustomvsystemproperty")); //firefox   mvn test

        System.out.println(System.getProperty("mycustomvsystemproperty")); //xxx
        //xxx
       // mvn test -Dmycustomvsystemproperty="xxx"

        String custom2=System.getProperty("mycustomvsystemproperty2", "newdefault");//newdefault
        System.out.println(custom2); //something  mvn test -Dmycustomvsystemproperty2="something"
    }

}





