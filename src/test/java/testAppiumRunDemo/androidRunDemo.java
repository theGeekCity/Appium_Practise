package testAppiumRunDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class androidRunDemo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        UiAutomator2Options obj_uiAuto2_Opt = new UiAutomator2Options();
        obj_uiAuto2_Opt.setPlatformName("Android");
        obj_uiAuto2_Opt.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        obj_uiAuto2_Opt.setUdid("RZCW92RJCFA");
        obj_uiAuto2_Opt.setApp(System.getProperty("user.dir")+ "\\src\\test\\resources\\sampleApp\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        obj_uiAuto2_Opt.setAppPackage("com.swaglabsmobileapp");
        obj_uiAuto2_Opt.setAppActivity("com.swaglabsmobileapp.SplashActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), obj_uiAuto2_Opt);
        Thread.sleep(3000);


        driver.quit();



    }
}
