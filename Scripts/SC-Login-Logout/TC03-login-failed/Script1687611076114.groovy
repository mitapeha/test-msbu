import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
    // blank username
    GlobalVariable.username = ''

    GlobalVariable.password = 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'

    WebUI.callTestCase(findTestCase('step-login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/labelLoginFailed'), 0)

    WebUI.closeBrowser()

    // blank password
    GlobalVariable.username = 'John Doe'

    GlobalVariable.password = ''

    WebUI.callTestCase(findTestCase('step-login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/labelLoginFailed'), 0)

    WebUI.closeBrowser()

    // wrong username
    GlobalVariable.username = 'popo'

    GlobalVariable.password = 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'

    WebUI.callTestCase(findTestCase('step-login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/labelLoginFailed'), 0)

    WebUI.closeBrowser()

    // wrong password
    GlobalVariable.username = 'John Doe'

    GlobalVariable.password = '8SQVv/p9jVScEs4/2CZsLw=='

    WebUI.callTestCase(findTestCase('step-login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/labelLoginFailed'), 0)
}
finally { 
    WebUI.closeBrowser()
}

