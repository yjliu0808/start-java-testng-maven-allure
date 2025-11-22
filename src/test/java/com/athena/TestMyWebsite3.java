package com.athena;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： 要指定测试在[基于套件的层次结构
 **/
public class TestMyWebsite3 {

    @Test
    public void testAuthentication() {
        Allure.label("Ums", "API 测试");
        Allure.suite("基础功能测试");
        Allure.label("Ams", "登录模块");

        // ...
    }
}
