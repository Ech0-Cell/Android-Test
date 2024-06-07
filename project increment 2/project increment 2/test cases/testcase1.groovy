import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TestCase1_ValidRegistration {
    
    static void main(String[] args) {
        WebUI.openBrowser('')
        WebUI.navigateToUrl('http://your-app-url')

        // Test case: Valid Registration
        WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_Name'), 'Test User')
        WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_Surname'), 'Test Surname')
        WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_Email'), 'testuser@example.com')
        WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_PhoneNumber'), '1234567890')
        WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_Password'), 'encryptedPassword')
        WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_ConfirmPassword'), 'encryptedPassword')
        WebUI.click(findTestObject('Object Repository/RegistrationPage/check_Terms'))
        WebUI.click(findTestObject('Object Repository/RegistrationPage/check_DataProcessing'))
        WebUI.click(findTestObject('Object Repository/RegistrationPage/button_Register'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/input_Email'), 10)
        
        WebUI.closeBrowser()
    }
}
