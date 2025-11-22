package com.athena;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;


/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： 指定描述、链接和其他元数据
 **/
public class TestMyWebsite1 {
    @Test
    @Description("This test attempts to log into the website using a login and a password. Fails if any error happens.\n\nNote that this test does not test 2-Factor Authentication.")
    @Owner("John Doe")
    @Link(name = "Website", url = "https://dev.example.com/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    public void testAuthentication() {
        // ...
    }
}
