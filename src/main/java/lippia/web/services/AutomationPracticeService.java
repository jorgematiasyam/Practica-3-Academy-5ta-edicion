package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationPracticeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationPracticeService extends ActionManager {

    public static void navegarWeb(){

        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickMyAccount() {
        click((AutomationPracticeConstants.BUTTON_MYACCOUNT_ID));
    }
    public static void inputUsername(String username){
        setInput(AutomationPracticeConstants.INPUT_USERNAME_ID,username);
    }
    public static void inputPassword(String password){
        setInput(AutomationPracticeConstants.INPUT_PASSWORD_ID,password);
    }
    public static void clickLogin(){
        click(AutomationPracticeConstants.BUTTON_LOGIN_XPATH);
    }


}
