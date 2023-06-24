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
    WebUI.callTestCase(findTestCase('step-login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/labelMakeAppointment'), 
        0)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/dropdownHealthcareCenter'), 
        facility, true)

    switch (hospitalReadmisson) {
        case 'Yes':
            WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/checkboxApplyForHospitalReadmission'))

            break
        case 'No':
            break
    }
    
    switch (program) {
        case 'medicare':
            healthCareProgram = 'Medicare'

            healthCareIndex = 1

            break
        case 'medicaid':
            healthCareProgram = 'Medicaid'

            healthCareIndex = 2

            break
        case 'none':
            healthCareProgram = 'None'

            healthCareIndex = 3

            break
    }
    
    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/make_appointment_page/buttonBookAppointment'))

    WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/appointment_confirmation_page/labelAppointmentConfirmation'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/make_appointment_page/buttonBookAppointment'), 
        0)
}
finally { 
    WebUI.closeBrowser()
}

