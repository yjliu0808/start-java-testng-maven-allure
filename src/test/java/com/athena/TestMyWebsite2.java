package com.athena;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： 改进测试报告导航”一文所述，Allure 支持多种方式将测试组织成层级结构。Allure TestNG 提供了一些函数，可以通过添加注解或“动态”（与](https://allurereport.org/docs/gettingstarted-navigation/)[元数据字段
 **/
public class TestMyWebsite2 {

    @Test
    @Epic("Web interface")
    @Feature("Essential features")
    @Story("Authentication")
    public void testAuthentication() {
        // ...
    }
}
