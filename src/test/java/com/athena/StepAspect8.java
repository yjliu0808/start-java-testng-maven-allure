package com.athena;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： 创建一个切面类来拦截所有带有 @Step 注解的方法，并自动调用 Allure.step() 来记录这些步骤
 **/

@Aspect
public class StepAspect8 {

    @Pointcut("@annotation(io.qameta.allure.Step)")  // 捕获所有带有 @Step 注解的方法
    public void stepMethods() {}

    @Before("stepMethods()")
    public void addStepToAllure(JoinPoint joinPoint) {
        // 获取执行的方法名
        String methodName = joinPoint.getSignature().getName();

        // 使用 Allure.step() 记录步骤
        Allure.step(methodName);
    }
}