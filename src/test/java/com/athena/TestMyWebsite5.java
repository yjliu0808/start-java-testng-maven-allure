package com.athena;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： 描述参数化测试
 **/
public class TestMyWebsite5 {
    @Test
    @Parameters({"Login", "Password"})
    public void testAuthentication(String login, String password) {
        String A = login+password;
      System.out.println(A);
    }
}
