import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TestCase3_ValidLogin {
    
    static void main(String[] args) {
        WebUI.openBrowser('')
        WebUI.navigateToUrl('http://your-app-url')

        // Test case: Valid Login
        WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email'), 'testuser@example.com')
        WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password'), 'encryptedPassword')
        WebUI.click(findTestObject('Object Repository/LoginPage/button_Login'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/AccountPage/label_AccountDetails'), 10)
        
        WebUI.closeBrowser()
    }
}
