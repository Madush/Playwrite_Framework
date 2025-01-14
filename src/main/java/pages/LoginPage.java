package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    // Locators
    private String usernameSelector = "#username";
    private String passwordSelector = "#password";
    private String loginButtonSelector = "#loginButton";

    // Constructor
    public LoginPage(Page page) {
        this.page = page;
    }

    // Methods
    public void navigateTo(String url) {
        page.navigate(url);
    }

    public void login(String username, String password) {
        page.fill(usernameSelector, username);
        page.fill(passwordSelector, password);
        page.click(loginButtonSelector);
    }
}
