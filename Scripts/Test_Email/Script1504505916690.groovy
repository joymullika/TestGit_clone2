import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('Test Email/Page_ - (1)/input_EMAIL'), 'aa')

WebUI.setText(findTestObject('Test Email/Page_ - (1)/input_EMAIL'), 'aaa')

WebUI.click(findTestObject('Test Email/Page_ -/input_btn btn-primary'))

//verify Email
WebUI.verifyTextPresent('กรุณากรอก รหัสสมาชิก ในรูปแบบ Email', false)

WebUI.setText(findTestObject('Test Email/Page_ - (1)/input_EMAIL'), 'ๅ/ดเกเ@hh.com')

WebUI.click(findTestObject('Test Email/Page_ -/input_btn btn-primary'))

//verify Email
WebUI.verifyTextPresent('กรุณากรอก รหัสสมาชิก ในรูปแบบ Email', false)

WebUI.setText(findTestObject('Test Email/Page_ - (1)/input_EMAIL'), 'ccc@ff.com')

WebUI.click(findTestObject('Test Email/Page_ -/input_btn btn-primary'))

//verify Email
WebUI.verifyTextNotPresent('กรุณากรอก รหัสสมาชิก ในรูปแบบ Email', false)

WebUI.setText(findTestObject('Test Email/Page_ - (1)/input_EMAIL'), '1212@gg.com')

WebUI.click(findTestObject('Test Email/Page_ - (1)/input_EMAIL'))

//verify Email
WebUI.verifyTextNotPresent('กรุณากรอก รหัสสมาชิก ในรูปแบบ Email', false)

WebUI.closeBrowser()

