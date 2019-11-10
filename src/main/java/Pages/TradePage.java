package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class TradePage {

    public TradePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/NavBarTitle")  //שוק ההון
    public MobileElement titel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/securitiesSummaryFragmentSubtitle")  //תשואת תיק נומינלית מתחילת שנה:
    public MobileElement securitiesSummaryFragment;
    @AndroidFindBy(id = "com.ideomobile.discount:id/summary_fragment_title")  //שווי תיק
    public MobileElement summary_fragment;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocksPortfolioButton")  //תיק ניירות ערך
    public MobileElement stocksPortfolioButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocksOrdersButton")  //הוראות ממתינות
    public MobileElement stocksOrdersButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocksTrackedButton")  // ניירות למעקב
    public MobileElement stocksTrackedButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocksSearchButton")  //חיפוש נייר
    public MobileElement stocksSearchButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocksMarketButton")  //מדדים ומטבעות
    public MobileElement stocksMarketButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocks_portfolio_all_title")  //כל הניירות בתיק
    public MobileElement stocks_portfolio_all;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocks_portfolio_all_israeli")  //כל הניירות בארץ
    public MobileElement stocks_portfolio_all_israeli;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocks_portfolio_all_foreign")  //כל הניירות בחו"ל
    public MobileElement stocks_portfolio_all_foreign;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocks_portfolio_stocks_share_and_convertibles_title")  //מניות והמירים
    public MobileElement stocks_share_and_convertibles;
    @AndroidFindBy(id = "com.ideomobile.discount:id/stocks_portfolio_bonds_title")  //אג"ח
    public MobileElement stocks_portfolio_bonds;
    @AndroidFindBy(id = "com.ideomobile.discount:id/securitiesSearchResultEditText")  //הזינו שם נייר /מספר נייר /סימבול
    public MobileElement securitiesSearch;
    @AndroidFindBy(id = "com.ideomobile.discount:id/deposit_line_buy_button")  //
    public MobileElement buy_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/deposit_line_sell_button")  //
    public MobileElement sell_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/securityPortfolio")  //נתוני מסחר
    public MobileElement securityPortfolio;
    @AndroidFindBy(id = "com.ideomobile.discount:id/securityPortfolioItemCloseButton")  //x לסגירת החלון
    public MobileElement securityPortfolioItemCloseButton;



    @Step("לחיצה על קנייה ")
    public  TradePage click_buy_button(){
        this.buy_button.click();
        return this;
    }
    @Step("לחיצה על נתוני מסחר בנייר ")
    public  TradePage click_securityPortfolio(){
        this.securityPortfolio.click();
        return this;
    }
    @Step("לחיצה על מכירה ")
    public  TradePage click_sell_button(){
        sell_button.click();
        return this;
    }
    @Step("לחיצה על תיק ניירות ערך ")
    public  TradePage type_SecuritiesName(String name){
        this.securitiesSearch.clear();
        this.securitiesSearch.sendKeys(name);
        return  this;
    }

    @Step("לחיצה על תיק ניירות ערך ")
    public  TradePage click_stocksPortfolioButton(){
        this.stocksPortfolioButton.click();
        return  this;
    }
    @Step("לחיצה על הוראות ממתינות")
    public  TradePage click_stocksOrdersButton(){
        this.stocksOrdersButton.click();
        return  this;
    }
    @Step("לחיצה על ניירות למעקב")
    public  TradePage click_stocksTrackedButton(){
        this.stocksTrackedButton.click();
        return  this;
    }
    @Step("לחיצה על חיפוש נייר ")
    public  TradePage click_stocksSearchButton(){
        this.stocksSearchButton.click();
        return  this;
    }
    @Step("לחיצה על כל הניירות בתיק")
    public  TradePage click_stocks_portfolio_all(){
        this.stocks_portfolio_all.click();
        return  this;
    }
    @Step("לחיצה על מדדים ומטבעות")
    public  TradePage click_stocksMarketButton(){
        this.stocksMarketButton.click();
        return  this;
    }
    @Step("לחיצה על כל הניירות בארץ")
    public  TradePage click_stocks_portfolio_all_israeli(){
        this.stocks_portfolio_all_israeli.click();
        return  this;
    }
    @Step("לחיצה על הניירות בחול")
    public  TradePage click_stocks_portfolio_all_foreign(){
        this.stocks_portfolio_all_foreign.click();
        return  this;
    }
    @Step("לחיצה על מניות והמרים ")
    public  TradePage click_stocks_share_and_convertibles(){
        this.stocks_share_and_convertibles.click();
        return  this;
    }
    @Step("לחיצה על אגח")
    public  TradePage click_stocks_portfolio_bonds(){
        this.stocks_portfolio_bonds.click();
        return  this;
    }

}
