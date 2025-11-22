package com.athena;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： 示例测试类
 **/
public class AllureStepTest9 {
    @Test
    public void testSteps() {
        // 这些步骤将自动被 AspectJ 切面捕获并记录到 Allure
        stepOne();
        stepTwo("Test parameter");
        stepThree();
    }

    @Step("Step 1: Initialize the process")
    public void stepOne() {
        System.out.println("Initializing the process...");
    }

    @Step("Step 2: Perform action with parameter {0}")
    public void stepTwo(String param) {
        System.out.println("Performing action with parameter: " + param);
    }

    @Step("Step 3: Complete the process")
    public void stepThree() {
        System.out.println("Completing the process...");
    }
}
