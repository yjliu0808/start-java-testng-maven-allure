package com.athena;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * @Author： Athena
 * @Date： 2025-11-22
 * @Desc： ### 附上屏幕截图和其他文件
 **/
public class TestMyWebsite6 {

    @Test
    public void testAuthentication() throws IOException {
        // ...
        Allure.attachment("data.txt", "This is the file content.");
        try (InputStream is = Files.newInputStream(Paths.get("src/test/resources/screenshots/error_screenshot.png"))) {
            Allure.attachment("image.png", is);
        }
    }
}
