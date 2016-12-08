package com.epam.gomel.tat.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseLoginPage {
    @FindBy(how = How.XPATH, xpath = "//input[@name='Username']")
    private WebElement userName;
    @FindBy(how = How.XPATH, xpath = "//input[@name='Password']")
    private WebElement password;
    @FindBy(how = How.XPATH, xpath = "(//button[@data-name='submit'])[1]")
    private WebElement loginBtn;

    public void userLogin() {
        userName.sendKeys(Tests.EMAIL);
        password.sendKeys(Tests.CORRECT_PASS);
        loginBtn.click();
    }
}
