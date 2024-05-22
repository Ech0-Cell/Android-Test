import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Setup
WebUI.openBrowser('')
WebUI.navigateToUrl('http://your-app-url')

// Test Execution
WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_Name'), 'Test User')
WebUI.setText(findTestObject('Object Repository/RegistrationPage/input_Email'), 'invalidemail')
WebUI.setEncryptedText(findTestObject('Object Repository/RegistrationPage/input_Password'), 'encryptedPassword')
WebUI.click(findTestObject('Object Repository/RegistrationPage/button_Register'))

// Verification
WebUI.verifyElementPresent(findTestObject('Object Repository/RegistrationPage/error_InvalidEmail'), 10)

// Teardown
WebUI.closeBrowser()
