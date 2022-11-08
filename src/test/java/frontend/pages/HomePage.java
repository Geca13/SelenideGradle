package frontend.pages;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import frontend.BaseClass;
import org.openqa.selenium.By;


public class HomePage extends BaseClass {


    private  SelenideElement audioElementContainer(){
        return $(By.id("about"));
    }

    private  SelenideElement showTitle(){
        return $(By.xpath("//section[@id='about']//h2"));
    }


    public void openHomePage(){
        this.navigateTo("https://zavodlivakvecherina.herokuapp.com/");
    }

    public void isAtHomePage(){
        this.isDisplayed(audioElementContainer());
    }

    public String getLastShowName(){
        return this.getElementText(showTitle());
    }

}
