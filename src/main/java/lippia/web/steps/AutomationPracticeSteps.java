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

    @And("^Ingresa su username \"(.*)\"$")
    public void ingresaSuUsername(String username) {
        AutomationPracticeService.inputUsername(username);
    }

    @And("^Ingresa su password \"(.*)\"$")
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
}
