package Automacao.Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    private WebDriver webDriver;

    public Login(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Login acessarPagina() {
        this.webDriver.get("https://suporte.gpm.srv.br");
        return this;
    }

    public void acessarSistema () {
        WebElement usuario = this.webDriver.findElement(By.name("login"));
        WebElement senha = this.webDriver.findElement(By.name("password"));

        usuario.sendKeys("usuario");
        senha.sendKeys("senha");

        senha.submit();
    }

}
