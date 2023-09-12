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

WebUI.openBrowser('https://executive.co.id/account/login')

WebUI.click(findTestObject('Object Repository/Login/Login_buat akun'))

WebUI.setText(findTestObject('Object Repository/Register/Register_field email'), 'syahbanu1997@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register/Register_field nama depan'), 'Ikhsan Nur')

WebUI.setText(findTestObject('Object Repository/Register/Register_field nama belakang'), 
    'Syahbanu')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Register_field password'), 
    'uitdICz1+UtRJVGrsrCHyQ==')

WebUI.setText(findTestObject('Object Repository/Register/Register_field telepon'), '087708771440')

WebUI.setText(findTestObject('Object Repository/Register/Register_field tanggal lahir'), 
    '28 Dec 1997')

WebUI.click(findTestObject('Object Repository/Register/Register_radio button pria'))

WebUI.click(findTestObject('Object Repository/Register/Register_Button buat akun'))

WebUI.verifyElementText(findTestObject('Object Repository/Akun_Ikhsan Nur Syahbanu'), 'Ikhsan Nur Syahbanu')

