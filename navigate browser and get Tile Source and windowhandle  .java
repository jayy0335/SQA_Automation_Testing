import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateBrowserAndGetUrl {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String googlehandle = driver.getWindowHandle();
        System.out.println("google handle is: =" +googlehandle);
        String googlesource = driver.getPageSource();
        System.out.println("Google is here: ="+googlesource);
        driver.navigate().to("https://www.youtube.com");
        driver.getCurrentUrl();
        String youtubeurl = driver.getCurrentUrl();
        System.out.println("youtube url is:=" + youtubeurl);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.getCurrentUrl();
        String googleurl = driver.getCurrentUrl();
        System.out.println("google URl is: =" + googleurl);
        driver.navigate().to("https://www.facebook.com");
        driver.getCurrentUrl();
        String facebookurl = driver.getCurrentUrl();
        System.out.println("facebook URL is: = "+ facebookurl);
        driver.navigate().back();
        driver.navigate().to("https://www.udemy.com");
        String udemytitle = driver.getTitle();
        System.out.println("this is udemy title: = "+ udemytitle);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
    }
}
