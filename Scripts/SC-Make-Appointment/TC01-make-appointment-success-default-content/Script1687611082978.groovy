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
	
	// get current date
	Date date = new Date()
	visitDate = date.format("dd/MM/yyyy")
	
    WebUI.callTestCase(findTestCase('step-login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/labelMakeAppointment'), 
        0)

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/textfieldVisitDate'), 
        visitDate)
	
	switch (program) {
		case 'medicare':
			healthCareProgram = 'Medicare'
			break
		case 'medicaid':
			healthCareProgram = 'Medicaid'
			break
		case 'none':
			healthCareProgram = 'None'
			break
	}

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/buttonBookAppointment'))

    WebUI.waitForElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/appointment_confirmation_page/labelAppointmentConfirmation'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/appointment_confirmation_page/labelPleaseBeInformedThatYourAppointment'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/appointment_confirmation_page/confirmationLabelVerifFacility', 
            [('textFacility') : facility]), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/appointment_confirmation_page/confirmationLabelVerifHospitalReadmission', 
            [('textHospitalReadmission') : hospitalReadmisson]), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/appointment_confirmation_page/confirmationLabelVerifProgram', 
            [('textHealthCareProgram') : healthCareProgram]), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/appointment_confirmation_page/confirmationLabelVerifVisitDate', 
            [('textVisitDate') : visitDate]), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/appointment_confirmation_page/confirmationLabelVerifComment', 
            [('textComment') : comment]), 0)

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/appointment_confirmation_page/hyperlinkGoToHomepage'))

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/home_page/labelWeCareAboutYourHealth'), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/home_page/buttonMakeAppointment'), 0)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/home_page/buttonMenuToggle'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service/home_page/hyperlinkHistory'))

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/history_page/labelHistory'), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/history_page/historyLabelVerifFacility', [('textFacility') : facility]), 
        0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/history_page/historyLabelVerifHospitalReadmission', 
            [('textHospitalReadmission') : hospitalReadmisson]), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/history_page/historyLabelVerifProgram', [('textProgram') : healthCareProgram]), 
        0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/history_page/historyLabelVerifVisitDate', [('textVisitDate') : visitDate]), 
        0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/history_page/historyLabelVerifComment', [('textComment') : comment]), 
        0)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/history_page/buttonGoToHomepage'))

    WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/home_page/labelWeCareAboutYourHealth'), 0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/home_page/buttonMakeAppointment'), 0)
}
finally { 
    WebUI.closeBrowser()
}

