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

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/uploadAFile/Page_The Internet/li_File Upload'))

WebUI.click(findTestObject('Object Repository/uploadAFile/Page_The Internet/a_File Upload'))

WebUI.uploadFile(findTestObject('uploadAFile/Page_The Internet/input_File Uploader_file'), 'C:\\Users\\User\\git\\filemanagement-katalon\\Data Files\\Upload Data\\SAP_KOTAK_MONO_KROM.png')

WebUI.click(findTestObject('uploadAFile/Page_The Internet/input_File Uploader_file-submit'))

WebUI.verifyElementPresent(findTestObject('uploadAFile/Page_The Internet/h3_File Uploaded'), 1)

WebUI.closeBrowser()

