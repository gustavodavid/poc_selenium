import Automacao.Telas.Login;
import Automacao.TestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testAmbienteSuporte extends TestBase {

    Login login;

    @Before
    public void setUp() {
        super.setUp();
        this.webDriver.manage().window().fullscreen();

        this.login = new Login(this.webDriver);
    }

    @After
    public void after() {

    }

    @Test
    public void abrirPagina() {
        this.login.acessarPagina()
        .acessarSistema();
    }

}