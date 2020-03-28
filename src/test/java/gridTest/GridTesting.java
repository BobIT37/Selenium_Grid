package gridTest;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTesting {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("firefox");
        cap.setPlatform(Platform.MAC);

        FirefoxOptions options = new FirefoxOptions();
        options.merge(cap);

        String hubURL = "http://192.168.1.164:4444/wd/hub";

        WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);

        driver.get("https://www.google.com");
        System.out.println("Title: "+ driver.getTitle());

        driver.close();
    }
}
