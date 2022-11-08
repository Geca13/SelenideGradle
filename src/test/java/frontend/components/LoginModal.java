package frontend.components;

import com.codeborne.selenide.SelenideElement;
import frontend.BaseClass;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginModal extends BaseClass {


    private SelenideElement modal(){
        return $(By.className("content"));
    }

    private  SelenideElement usernameInput(){
        return $(By.name("username"));
    }

    private  SelenideElement passwordInput(){
        return $(By.name("password"));
    }

    private  SelenideElement submitBtn(){
        return $(By.xpath("//button[@type='submit']"));
    }




    public void loginAsAdmin(){
        this.isDisplayed(modal());
        this.sendKeysToInput(usernameInput(), "email1@email.com");
        this.sendKeysToInput(passwordInput(), "Password@123");
        this.clickElement(submitBtn());
    }

    public void failLoginAsAdmin(){
        this.isDisplayed(modal());
        this.sendKeysToInput(usernameInput(), "emaill@email.com");
        this.sendKeysToInput(passwordInput(), "Password@123");
        this.clickElement(submitBtn());
    }
}
