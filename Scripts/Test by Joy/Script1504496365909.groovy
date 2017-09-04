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

WebUI.openBrowser('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('Test1/Page_ -/input_EMAIL'), 'noochesn@gmail.com')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_PASSWORD'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_password_confirmation'), '1234567890')

WebUI.uploadFile(findTestObject('Test1/Page_ -/input_PATH_IMAGE'), 'C:\\Users\\HP\\Pictures\\Screenshots\\2.png')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_FIRST_NAME_TH'), 'นุช')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_LAST_NAME_TH'), 'นุชเชส')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_FIRST_NAME_EN'), 'nooch')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_LAST_NAME_EN'), 'nooches')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_CITIZEN_ID'), '2680775476651')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_BIRTH_DATE'), '16/03/1999')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test1/Page_ -/select_RELIGION'), 'อื่นๆ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test1/Page_ -/select_EDUCATIONAL'), 'ปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test1/Page_ -/select_CAREER'), 'รับราชการ', true)

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_ADDRESS_NO'), '50')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_ADDRESS_MOO'), 'หมู่6')

WebUI.setText(findTestObject('Object Repository/Test1/Page_ -/input_ADDRESS_ROAD'), 'ฮอด')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Test1/Page_ -/select_ADDRESS_PROVINCE'), 6)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Test1/Page_ -/select_ADDRESS_DISTRICT'), 1)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Test1/Page_ -/select_ADDRESS_SUBDISTRICT'), 1)

WebUiBuiltInKeywords.setText(findTestObject('Object Repository/Test1/Page_ -/input_ADDRESS_POSTCODE'), '20000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test1/Page_ -/select_STATUS_EDU_WORK'), 'กำลังศึกษา', false)

WebUiBuiltInKeywords.setText(findTestObject('Object Repository/Test1/Page_ -/input_ADDRESS_ALL'), 'บ้าน')

WebUiBuiltInKeywords.setText(findTestObject('Object Repository/Test1/Page_ -/input_PHONE'), '2')

WebUiBuiltInKeywords.setText(findTestObject('Object Repository/Test1/Page_ -/input_CELL_PHONE'), '9812027456')

//'Click on \'Book Appointment\' button'
//WebUI.click(findTestObject('Object Repository/Test by Joy/Page_ -/input_CELL_PHONE'))
//'Click on \'Book Appointment\' button'
//WebUI.click(findTestObject('Object Repository/Test by Joy/Page_ -/input_CELL_PHONE'))
WebUiBuiltInKeywords.setText(findTestObject('Object Repository/Test1/Page_ -/input_FAX'), '1')

WebUI.click(findTestObject('Test2/Page_ -/input_btn btn-primary'))

WebUI.delay(1)

//verify Cell_Phone
WebUI.verifyTextNotPresent('กรุณากรอกเบอร์มือถือ 10 หลัก', false)

WebUI.verifyTextNotPresent('กรุณากรอกรหัสไปรษณีย์ 5 หลัก', false)

