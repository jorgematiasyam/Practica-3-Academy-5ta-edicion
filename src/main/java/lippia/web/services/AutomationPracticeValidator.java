package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationPracticeConstants;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationPracticeValidator extends ActionManager {

    public static void ValidatorLogin() {
        Assert.assertTrue(isVisible(AutomationPracticeConstants.BUTTON_SIGNOUT_XPATH));
    }

    public static void arrivalsQuantityValidator(){
        Assert.assertTrue(isVisible(AutomationPracticeConstants.BOOK_LEFT_ID));
        Assert.assertTrue(isVisible(AutomationPracticeConstants.BOOK_RIGHT_ID));
        Assert.assertTrue(isVisible(AutomationPracticeConstants.BOOK_MIDDLE_ID));
    }
    public static void isTitleVisible() {
        Assert.assertTrue(isVisible(AutomationPracticeConstants.TITLE_ARRIVALS_XPATH));
    }

    public static void isDescriptionVisible() {
        Assert.assertTrue(isVisible(AutomationPracticeConstants.DESCRIPTION_ID));

    }
}
