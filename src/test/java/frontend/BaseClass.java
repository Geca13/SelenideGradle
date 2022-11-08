package frontend;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class BaseClass {

    public void navigateTo(String url){
        open(url);
    }

    public Boolean isDisplayed(SelenideElement element){
       return element.exists();
    }

    public String getElementText(SelenideElement element){
        return element.getText();
    }

    public void clickElement(SelenideElement element){
        element.click();
    }

    public void sendKeysToInput(SelenideElement element, String keys){
        element.sendKeys(keys);
    }

}
