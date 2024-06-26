import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TestCase4_InvalidPasswordLogin {
    
    static void main(String[] args) {
        WebUI.openBrowser('')
        WebUI.navigateToUrl('http://your-app-url')

        // Test case: Invalid Password Login
        WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email'), 'testuser@example.com')
        WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password'), 'encryptedInvalidPassword')
        WebUI.click(findTestObject('Object Repository/LoginPage/button_Login'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/error_IncorrectPassword'), 10)
        
        WebUI.closeBrowser()
    }
}
