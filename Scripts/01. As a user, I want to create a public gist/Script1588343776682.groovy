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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'User Open Browser\r\n\r\n'
WebUI.openBrowser('')

'User Open Link GitHub'
WebUI.navigateToUrl('https://github.com/')

'User click button Sign in on github homepage'
WebUI.click(findTestObject('GitHub/Homepage/bt_Signin'))

'User Input Username'
WebUI.setText(findTestObject('GitHub/Page_Sign in/text_UserName'), GlobalVariable.dtUserName)

'User Input Password'
WebUI.setText(findTestObject('GitHub/Page_Sign in/text_Password'), GlobalVariable.dtPassword)

'User Click Log in'
WebUI.click(findTestObject('GitHub/Page_Sign in/bt_Login'))

'User Click User Profile'
WebUI.click(findTestObject('GitHub/Page_GitHub/bt_UserProfile'))

'User verify username account same with data when log in'
WebUI.verifyElementText(findTestObject('GitHub/Page_GitHub/dtUsername'), GlobalVariable.dtUserName)

'User Click Gist Menu'
WebUI.click(findTestObject('GitHub/Page_GitHub/bt_MyGists'))

'User click add gist button'
WebUI.click(findTestObject('GitHub/Page_My Gists/bt_AddGists'))

'User input title Gist'
WebUI.setText(findTestObject('GitHub/Page_Create a new Gist/text_GistTitle'), 'Create New Gist')

'User input description Gist'
WebUI.setText(findTestObject('GitHub/Page_Create a new Gist/text_GistDescription'), 'Test Case Create Gist')

'User click button create public gist'
WebUI.click(findTestObject('GitHub/Page_Create a new Gist/bt_CreatePublicGist'))

'User Click User Profile'
WebUI.click(findTestObject('GitHub/Page_Create a new Gist/bt_Profile'))

'User Click Gist Menu'
WebUI.click(findTestObject('GitHub/Page_Create a new Gist/bt_MyGist'))

'User verify gist has been created'
WebUI.verifyElementText(findTestObject('GitHub/Page_My Gists/bt_ViewGist'), 'Create New Gist')

'User close browser'
WebUI.closeBrowser()

