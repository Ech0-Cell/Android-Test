import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TestCase7_MakeCall {
    
    static void main(String[] args) {
        WebUI.openBrowser('')
        WebUI.navigateToUrl('http://your-app-url')

        // Login
        WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email'), 'testuser@example.com')
        WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password'), 'encryptedPassword')
        WebUI.click(findTestObject('Object Repository/LoginPage/button_Login'))

        // Test case: Make a Call
        WebUI.callTestCase(findTestCase('MakeCall'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.delay(5)

        WebUI.verifyElementPresent(findTestObject('Object Repository/AccountPage/label_UpdatedBalance'), 10)
        
        WebUI.closeBrowser()
    }
}
