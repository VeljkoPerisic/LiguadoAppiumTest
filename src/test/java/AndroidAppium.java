
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.util.Collections.singletonList;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import static java.time.Duration.ofMillis;




public class AndroidAppium {


    AndroidDriver driver;

    @Before
    public void launchLinguado() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();


        cap.setCapability("deviceName", "Pixel 2");
        cap.setCapability("udid", "712KPXV1196874");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("appPackage", "linguado.com.linguado");
        cap.setCapability("appActivity", "linguado.com.linguado.views.login.SplashActivity");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("automationName", "UiAutomator2");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(url, cap);

        System.out.println("Pokrenuto");


    }

    @Test
    public void Login() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("linguado.com.linguado:id/btnGoLinguado")).click();
        driver.findElement(By.id("linguado.com.linguado:id/btnEmail")).click();
        driver.findElement(By.id("linguado.com.linguado:id/etEmail")).sendKeys("veljko.perisic@justraspberry.com");
        driver.findElement(By.id("linguado.com.linguado:id/etPassword")).sendKeys("qwerty");
        driver.findElement(By.id("linguado.com.linguado:id/btnNext")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("linguado.com.linguado:id/btnNext")).click();
        driver.findElement(By.id("linguado.com.linguado:id/ivFlag")).click();
        driver.findElement(By.id("linguado.com.linguado:id/scVisibilitySwitch")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("linguado.com.linguado:id/scVisibilitySwitch")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView[@bounds='[1182,2656][1266,2740]']")).click();
        driver.findElement(By.id("ivSettings")).click();
        System.out.println("Tutorijal za link requestove dismissovan");

        // Vertical scroll
        
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceIdMatches(\".*linguado.com.linguado:id/tvLogout.*\"))"));
        driver.findElement(By.id("linguado.com.linguado:id/tvLogout")).click();
    }
}




