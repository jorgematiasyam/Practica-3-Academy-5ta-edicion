package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationPracticeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationPracticeValidator extends ActionManager {

    public static void ValidatorLogin() {
        Assert.assertTrue(isVisible(AutomationPracticeConstants.BUTTON_SIGNOUT_XPATH));

    }
}
