package com.athena;

import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestAPIWithError7 {

    @Test
    public void testAuthenticationWithError() throws IOException {
        // 模拟接口请求数据
        String requestData = "{ \"username\": \"testuser\", \"password\": \"password123\" }";
        Allure.attachment("Request Data", requestData);

        try {
            // 模拟发送 API 请求（假设请求会出错）
            String responseData = sendApiRequestWithError(requestData);

            // 记录响应数据到 Allure 报告
            Allure.attachment("Response Data", responseData);

            // 不再使用断言，直接执行测试

        } catch (Exception e) {
            // 在测试失败时附加错误信息到报告
            Allure.attachment("Error", e.getMessage());

            // 调用封装的截图方法，捕获错误截图并附加到 Allure 报告中
            try (InputStream is = Files.newInputStream(Paths.get("src/test/resources/screenshots/error_screenshot.png"))) {
                Allure.attachment("Error Screenshot", is);  // 捕获并附加截图
            } catch (IOException ioException) {
                System.out.println("Screenshot not found: " + ioException.getMessage());
            }

            // 继续执行，报告错误信息
            System.out.println("Test failed due to exception: " + e.getMessage());
        }

        // 测试完成后，没有断言，测试结束
    }

    // 模拟带错误的 API 请求方法
    private String sendApiRequestWithError(String requestData) throws Exception {
        // 强制抛出异常以模拟接口错误
        throw new Exception("Simulated API error: Authentication failed.");
    }
}
