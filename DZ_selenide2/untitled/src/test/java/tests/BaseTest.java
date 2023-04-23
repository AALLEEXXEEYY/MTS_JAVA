package tests;
import config.ProjectConfig;
import com.codeborne.selenide.Selenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.io.File;
public abstract class BaseTest {
//    public static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class);
    protected WebDriver driver;
    @Before
    public void setup() {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new  File("C:\\Users\\1\\MTS1\\DZ_selenide\\untitled\\Chrome_driver\\chromedriver.exe")).build();
        WebDriver driver = new ChromeDriver(service);
    }
    @After
    public void turnDown() {
        Selenide.closeWebDriver();}

}
