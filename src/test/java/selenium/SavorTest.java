package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class SavorTest {

    WebDriver driver;
    WebDriverWait wait;
    String testEmail;
    String testPassword = "password123";

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

//    @Test
//    public void test01_ThemSanPhamVaoGioHang() {
//        System.out.println("🔹 Bắt đầu test02_ThemSanPhamVaoGioHang");
//        driver.get("https://www.savor.vn/");
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".product-box")));
//
//        WebElement sanPham = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-box a.product-thumbnail")));
//        sanPham.click();
//
//        try {
//            WebElement sizeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".swatch-element input")));
//            sizeBtn.click();
//        } catch (Exception ignored) {
//            System.out.println("⚠️ Không có lựa chọn size.");
//        }
//
//        WebElement btnThem = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart")));
//        btnThem.click();
//
//        System.out.println("✅ Đã thêm sản phẩm vào giỏ hàng.");
//    }


    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🧹 Đã đóng trình duyệt.");
        }
    }
}
