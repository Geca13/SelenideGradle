package frontend.components;

import com.codeborne.selenide.SelenideElement;
import frontend.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class Navbar extends BaseClass {


    private  SelenideElement loginIcon(){
        return $(By.id("login-open-popup"));
    }

    private  SelenideElement newShowLink(){
        return $(By.xpath("//a[@href='/new']"));
    }

    public Boolean newShowLinkIsVisible(){
       return this.newShowLink().exists();
    }


    public void clickLoginIcon() {
        this.clickElement(loginIcon());
    }


}
