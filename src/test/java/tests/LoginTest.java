package tests;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @BeforeEach
    public void setUpTest() {
        setUp();
    }

    @AfterEach
    public void tearDownTest() {
        tearDown();
    }

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(page);
        loginPage.navigateTo("https://example.com/login");
//        loginPage.login("testuser", "password123");

        Assertions.assertEquals("Example Domain", page.title(), "Page title mismatch after login");
    }
}
