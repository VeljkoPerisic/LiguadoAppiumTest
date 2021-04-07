import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LinkRequestTest extends AndroidAppium {

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
    public void sendingLinkRequest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("linguado.com.linguado:id/btnGoLinguado")).click();
        driver.findElement(By.id("linguado.com.linguado:id/btnEmail")).click();
        driver.findElement(By.id("linguado.com.linguado:id/etEmail")).sendKeys("veljko.perisic@justraspberry.com");
        System.out.println("Email unet");
        driver.findElement(By.id("linguado.com.linguado:id/etPassword")).sendKeys("qwerty");
        System.out.println("Password unet");
        driver.findElement(By.id("linguado.com.linguado:id/btnNext")).click();
        Thread.sleep(3000);
        System.out.println("Korisnik ulogovan");
        driver.findElement(By.id("linguado.com.linguado:id/btnNext")).click();
        driver.findElement(By.id("linguado.com.linguado:id/ivFlag")).click();
        System.out.println("Visibility tutorijal dismisovan");
        driver.findElement(By.id("linguado.com.linguado:id/scVisibilitySwitch")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("linguado.com.linguado:id/scVisibilitySwitch")).click();
        System.out.println("Filter tutorijal dismisovan");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget." +
                "RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget." +
                "RelativeLayout[1]/android.widget.ImageView[3][@bounds='[1188,525][1356,693]']")).click();
        System.out.println("Link request tutorijal dismisovan");
        Thread.sleep(5000);
        driver.findElement(By.id("linguado.com.linguado:id/ivFlag")).click();
        driver.findElement(By.id("linguado.com.linguado:id/btnMale")).click();
        System.out.println("Male button kliknuto");
        driver.findElement(By.id("linguado.com.linguado:id/btnGoLinguado")).click();
        System.out.println("Male filter selektovan, filter zatvoren");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget." +
                "RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget." +
                "RelativeLayout[1]/android.widget.ImageView[3][@bounds='[1188,525][1356,693]']")).click();




    }


}
