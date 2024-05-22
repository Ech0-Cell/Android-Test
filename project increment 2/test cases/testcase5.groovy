import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Setup
WebUI.openBrowser('')
WebUI.navigateToUrl('http://your-app-url')

// Login
WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email'), 'testuser@example.com')
WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password'), 'encryptedPassword')
WebUI.click(findTestObject('Object Repository/LoginPage/button_Login'))

// Test Execution
WebUI.click(findTestObject('Object Repository/AccountPage/tab_AccountDetails'))

// Verification
WebUI.verifyElementPresent(findTestObject('Object Repository/AccountPage/label_AccountDetails'), 10)

// Teardown
WebUI.closeBrowser()
