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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/home_page/labelCURAHealthcareService'), 0)

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/home_page/labelWeCareAboutYourHealth'), 0)

WebUI.click(findTestObject('Page_CURA Healthcare Service/home_page/buttonMenuToggle'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/home_page/hyperlinkLogin'))

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/labelLogin'), 0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/labelPleaseLoginToMakeAppointment'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/login_page/buttonLogin'), 0)

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/login_page/textfieldUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/login_page/textfieldPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/login_page/buttonLogin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/labelMakeAppointment'), 
    'Make Appointment')

