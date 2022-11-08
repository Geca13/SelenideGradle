package frontend.pages;

import com.codeborne.selenide.SelenideElement;
import frontend.BaseClass;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends BaseClass {
    public void openRegisterPage() {
        this.navigateTo("https://zavodlivakvecherina.herokuapp.com/registerNewAdminForKvecherina");
    }

    //By password = By.id("password");


    private SelenideElement email(){
        return $(By.id("email"));
    }

    private  SelenideElement submitBtn(){
        return $(By.xpath("(//button[@class='button'])[2]"));
    }

    private  SelenideElement password(){
        return $(By.id("password"));
    }


    public void registerNewAdmin(){
        this.sendKeysToInput( email(), "email1@email.com");
        this.sendKeysToInput(password() ,"Password@123");
        this.clickElement(submitBtn());
    }
}
