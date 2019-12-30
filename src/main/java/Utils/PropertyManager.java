package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//**********************************************************************************************************
//Description: PropertyManager class reads global configurations and use them during test execution.
//**********************************************************************************************************
public class PropertyManager {

    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = "/Users/macoscatalina/Desktop/appium_project_ios/src/main/java/config.properties";

    public String getChangeAccountTestId() {
        return ChangeAccountTestId;
    }

    public String getChangeAccountTestPass() {
        return ChangeAccountTestPass;
    }

    private  String CashWithdrawalPageTestId;
    private  String CashWithdrawalPageTestPass;
    private  String ChangeAccountTestId;
    private  String ChangeAccountTestPass;
    private  String CheckBookOrderPageTestId;
    private  String CheckBookOrderPageTestPass;
    private  String CreditCardOrderPageTestId;
    private  String CreditCardOrderPageTestPass;
    private  String CreditCardPageTestId;
    private  String CreditCardPageTestPass;
    private  String DashboardSwipeTestId;
    private  String DashboardSwipeTestPass;
    private  String ForeignCurrencyConversionsPageTestId;
    private  String GetLoanPageTestTestId;
    private  String GetLoanPageTestPass;
    private  String LoginPageTestId;
    private  String LoginPageTestPass;
    private  String TransfersPageTestId;
    private  String TransfersPageTestPass;
    private  String MeetBankerPageTestId;
    private  String MeetBankerPageTestPass;
    private  String WithdrawalOfDepositTestId;
    private  String WithdrawalOfDepositTestPass;
    private  String TradePageTestId;
    private  String TradePageTestPass;
    private  String MyProfilePageTestId;
    private  String MyProfilePageTestPass;
    private  String CancelCyclicTransferPageTestId;
    private  String CancelCyclicTransferPageTestPass;
    private  String ToucherPageTestId;
    private  String VIPFlyPageTestPass;
    private  String VIPFlyPageTestId;
    private  String TwoGoCardPageTestPass;
    private  String SettingsPageTestId;

    public String getSettingsPageTestId() {
        return SettingsPageTestId;
    }

    public String getSettingsPageTestPass() {
        return SettingsPageTestPass;
    }

    private  String SettingsPageTestPass;

    public String getTwoGoCardPageTestPass() {
        return TwoGoCardPageTestPass;
    }

    public String getTwoGoCardPageTestId() {
        return TwoGoCardPageTestId;
    }

    private  String TwoGoCardPageTestId;

    public String getToucherPageTestId() {
        return ToucherPageTestId;
    }

    public String getToucherPageTestPass() {
        return ToucherPageTestPass;
    }

    private  String ToucherPageTestPass;



    public String getLoginPageTestId() {
        return LoginPageTestId;
    }

    public String getLoginPageTestPass() {
        return LoginPageTestPass;
    }


    public String getGetLoanPageTestPass() {
        return GetLoanPageTestPass;
    }

    public String getGetLoanPageTestTestId() {
        return GetLoanPageTestTestId;
    }


    public String getDashboardSwipeTestId() {
        return DashboardSwipeTestId;
    }

    public String getDashboardSwipeTestPass() {
        return DashboardSwipeTestPass;
    }

    public String getForeignCurrencyConversionsPageTestId() {
        return ForeignCurrencyConversionsPageTestId;
    }

    public String getForeignCurrencyConversionsPageTestPass() {
        return ForeignCurrencyConversionsPageTestPass;
    }

    private  String ForeignCurrencyConversionsPageTestPass;

    public String getCheckBookOrderPageTestId() {
        return CheckBookOrderPageTestId;
    }

    public String getCheckBookOrderPageTestPass() {
        return CheckBookOrderPageTestPass;
    }

    public String getCashWithdrawalPageTestId() {
        return CashWithdrawalPageTestId;
    }

    public String getCashWithdrawalPageTestPass() {
        return CashWithdrawalPageTestPass;
    }

    public static String getWrongPassword() {
        return wrongPassword;
    }

    private static String wrongPassword;

    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance () {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }


    public String getCreditCardOrderPageTestId() {
        return CreditCardOrderPageTestId;
    }

    public String getCreditCardOrderPageTestPass() {
        return CreditCardOrderPageTestPass;
    }

    public String getCreditCardPageTestId() {
        return CreditCardPageTestId;
    }

    public String getCreditCardPageTestPass() {
        return CreditCardPageTestPass;
    }

    public String getTransfersPageTestId() {
        return TransfersPageTestId;
    }

    public String getTransfersPageTestPass() {
        return TransfersPageTestPass;
    }

    public String getMeetBankerPageTestId() {
        return MeetBankerPageTestId;
    }

    public String getMeetBankerPageTestPass() {
        return MeetBankerPageTestPass;
    }

    public String getWithdrawalOfDepositTestId() {
        return WithdrawalOfDepositTestId;
    }

    public String getWithdrawalOfDepositTestPass() {
        return WithdrawalOfDepositTestPass;
    }

    public String getTradePageTestId() {
        return TradePageTestId;
    }

    public String getTradePageTestPass() {
        return TradePageTestPass;
    }

    public String getMyProfilePageTestId() {
        return MyProfilePageTestId;
    }

    public String getMyProfilePageTestPass() {
        return MyProfilePageTestPass;
    }

    public String getCancelCyclicTransferPageTestId() {
        return CancelCyclicTransferPageTestId;
    }

    public String getCancelCyclicTransferPageTestPass() {
        return CancelCyclicTransferPageTestPass;
    }

    public String getVIPFlyPageTestPass() {
        return VIPFlyPageTestPass;
    }

    public String getVIPFlyPageTestId() {
        return VIPFlyPageTestId;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        //Get properties from configuration.properties
        CashWithdrawalPageTestId = prop.getProperty("CashWithdrawalPageTest.id");
        CashWithdrawalPageTestPass = prop.getProperty("CashWithdrawalPageTest.password");
        ChangeAccountTestId = prop.getProperty("ChangeAccountTest.id");
        ChangeAccountTestPass = prop.getProperty("ChangeAccountTest.password");
        CheckBookOrderPageTestId = prop.getProperty("CheckBookOrderPageTest.id");
        CheckBookOrderPageTestPass = prop.getProperty("CheckBookOrderPageTest.password");
        CreditCardOrderPageTestId = prop.getProperty("CreditCardOrderPageTest.id");
        CreditCardOrderPageTestPass = prop.getProperty("CreditCardOrderPageTest.password");
        CreditCardPageTestId = prop.getProperty("CreditCardPageTest.id");
        CreditCardPageTestPass = prop.getProperty("CreditCardPageTest.password");
        DashboardSwipeTestId = prop.getProperty("DashboardSwipeTest.id");
        DashboardSwipeTestPass = prop.getProperty("DashboardSwipeTest.password");
        ForeignCurrencyConversionsPageTestId = prop.getProperty("ForeignCurrencyConversionsPageTest.id");
        ForeignCurrencyConversionsPageTestPass = prop.getProperty("ForeignCurrencyConversionsPageTest.password");
        GetLoanPageTestTestId = prop.getProperty("GetLoanPageTest.id");
        GetLoanPageTestPass = prop.getProperty("GetLoanPageTest.password");
        LoginPageTestId = prop.getProperty("LoginPageTest.id");
        LoginPageTestPass = prop.getProperty("LoginPageTest.password");
        TransfersPageTestId = prop.getProperty("TransfersPageTest.id");
        TransfersPageTestPass = prop.getProperty("TransfersPageTest.password");
        MeetBankerPageTestId = prop.getProperty("MeetBankerPageTest.id");
        MeetBankerPageTestPass = prop.getProperty("MeetBankerPageTest.password");
        WithdrawalOfDepositTestId = prop.getProperty("WithdrawalOfDepositTest.id");
        WithdrawalOfDepositTestPass = prop.getProperty("WithdrawalOfDepositTest.password");
        TradePageTestId = prop.getProperty("TradePageTest.id");
        TradePageTestPass = prop.getProperty("TradePageTest.password");
        MyProfilePageTestId = prop.getProperty("MyProfilePageTest.id");
        MyProfilePageTestPass = prop.getProperty("MyProfilePageTest.password");
        CancelCyclicTransferPageTestId = prop.getProperty("CancelCyclicTransferPageTest.id");
        CancelCyclicTransferPageTestPass = prop.getProperty("CancelCyclicTransferPageTest.password");
        ToucherPageTestId = prop.getProperty("ToucherPageTest.id");
        ToucherPageTestPass = prop.getProperty("ToucherPageTest.password");
        VIPFlyPageTestId = prop.getProperty("VIPFlyPageTest.id");
        VIPFlyPageTestPass = prop.getProperty("VIPFlyPageTest.password");
        TwoGoCardPageTestId = prop.getProperty("TwoGoCardPageTest.id");
        TwoGoCardPageTestPass = prop.getProperty("TwoGoCardPageTest.password");
        SettingsPageTestId = prop.getProperty("SettingsPageTest.id");
        SettingsPageTestPass = prop.getProperty("SettingsPageTest.password");


    }


}