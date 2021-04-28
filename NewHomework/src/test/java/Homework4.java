import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework4 {
    @Test
    public void search(){

        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "Files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://vendoo.ge/");
        $("#searchinput").setValue("საყოფაცხოვრებო ტექნიკა").sendKeys( Keys.ENTER);
        //$(".header-menu__all-categories--text").sendKeys( Keys.ENTER );
        sleep(5000);


    }
}
