package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationPracticeService;
import lippia.web.services.AutomationPracticeValidator;

public class AutomationPracticeSteps extends PageSteps {


    @Given("El usuario se encuentra en el sitio Automation Practice")
    public void home() {

        AutomationPracticeService.navegarWeb();
    }

    @When("^el usuario hace click en el boton My Account del menu$")
    public void elUsuarioHaceClickEnElBotonDelMenuMyAccount() {

        AutomationPracticeService.clickMyAccount();
    }

    @And("^Ingresa su username (.*)$")
    public void ingresaSuUsername(String username) {

        AutomationPracticeService.inputUsername(username);
    }

    @And("^Ingresa su password (.*)$")
    public void ingresaSuPassword(String password) {

        AutomationPracticeService.inputPassword(password);
    }

    @And("^El usuario hace click en el boton Login")
    public void elUsuarioHaceClickEnElBotonLogin() {

        AutomationPracticeService.clickLogin();
    }

    @Then("El usuario verifica que el ingreso fue realizado correctamente")
    public void elUsuarioVerificaQueElIngresoFueRealizadoCorrectamente() {
        AutomationPracticeValidator.ValidatorLogin();
    }

    @When("El usuario hace click en el boton Shop")
    public void elUsuarioHaceClickEnElBotonShop() {
        AutomationPracticeService.clickShop();
    }

    @And("El usuario hace click en el boton Home")
    public void elUsuarioHaceClickEnElBotonHome() {
        AutomationPracticeService.clickHome();
    }

    @Then("El usuario verifica que existan solamente tres Arrivals")
    public void elUsuarioVerificaQueExistanSolamenteTresArrivals() {
        AutomationPracticeValidator.arrivalsQuantityValidator();
    }

    @Then("El usuario hace click en la imagen izquierda")
    public void elUsuarioHaceClickEnLaImagenIzquierda() {
        AutomationPracticeService.clickImage();
    }

    @Then("El usuario verifica que el ingreso a la pagina del producto fue realizado correctamente")
    public void elUsuarioVerificaQueElIngresoALaPaginaDelProductoFueRealizadoCorrectamente() {
        AutomationPracticeValidator.isTitleVisible();
    }

    @Then("El usuario hace click en el boton description")
    public void elUsuarioHaceClickEnElBotonDescription() {
        AutomationPracticeService.clickButtonDescription();
    }

    @Then("El usuario verifica que se muestra la descripcion del producto")
    public void elUsuarioVerificaQueSeMuestraLaDescripcionDelProducto() {
        AutomationPracticeValidator.isDescriptionVisible();
    }
}


