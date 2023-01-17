package com.virgin.pages;

import com.virgin.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveCasinoPage extends Utility {

    private static final Logger log = LogManager.getLogger(LiveCasinoPage.class.getName());

    public LiveCasinoPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement acceptCookie;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Live Casino')]" )
    WebElement liveCasinoTab;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/section[3]/h2[1]")
    WebElement verifyText;


    public void clickAcceptCookie(){
        log.info("Clicking on Accept Cookie : " + liveCasinoTab.toString());
        clickOnElement(acceptCookie);
    }

public void liveCasinoTab(){
    log.info("Clicking on Live casino tab : " + liveCasinoTab.toString());
    clickOnElement(liveCasinoTab);
}

public String verifyLiveBlackjackGames(){
    log.info("Verifying the text Live Blackjack Games : " + liveCasinoTab.toString());
        String actualMessage = getTextFromElement(verifyText);
        return actualMessage;
}

}


