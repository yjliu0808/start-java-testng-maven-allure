package com.athena;

import io.qameta.allure.Step;
import org.testng.annotations.Test;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： Allure TestNG 提供了三种[创建步骤和子步骤](https://allurereport.org/docs/steps/)的方法：“带注释的步骤”、“lambda 步骤”和“空操作步骤”
 **/
public class TestMyWebsite4 {
    @Test
    public void testAuthentication() {
        step1();
        step2();
    }

    @Step("Step 1")
    public void step1() {
        subStep1();
        subStep2();
    }

    @Step("Sub-step 1")
    public void subStep1() {
        // ...
    }

    @Step("Sub-step 2")
    public void subStep2() {
        // ...
    }

    @Step("Step 2")
    public void step2() {
        // ...
    }
}
