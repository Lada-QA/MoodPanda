package pages;

import com.codeborne.selenide.Selenide;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BasePage {

    public static final String BASE_URL = "https://moodpanda.com";

    public void openURL(String url){
        log.info("Open URL: " + url);
       Selenide.open(url);
    }
}
