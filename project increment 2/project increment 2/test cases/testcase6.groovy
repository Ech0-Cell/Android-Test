import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TestCase6_PasswordChange {
    
    static void main(String[] args) {
        WebUI.openBrowser('')
        WebUI.navigateToUrl('http://your-app-url')

        // Login
        WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email'), 'testuser@example.com')
        WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password'), 'encryptedPassword')
        WebUI.click(findTestObject('Object Repository/LoginPage/button_Login'))

        // Test case: Change Password
        WebUI.click(findTestObject('Object Repository/AccountPage/tab_AccountManagement'))
        WebUI.setEncryptedText(findTestObject('Object Repository/AccountPage/input_NewPassword'), 'encryptedNewPassword')
        WebUI.click(findTestObject('Object Repository/AccountPage/button_Save'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/AccountPage/confirmation_Message'), 10)
        
        WebUI.closeBrowser()
    }
}
