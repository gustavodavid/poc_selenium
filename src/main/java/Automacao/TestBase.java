package Automacao;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    private final String CAMINHO_PASTA_DRIVER = "C:\\Users\\gustavo.souza\\Documents\\GitHub\\poc_selenium\\src\\main\\java\\drivers";

    protected WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_PASTA_DRIVER+"\\chromedriver.exe");
        this.webDriver = new ChromeDriver();
    }

    @After
    public void after() {
        this.webDriver.close();
    }
}
