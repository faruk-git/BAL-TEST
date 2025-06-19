import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

//Mobile.startApplication('C:\\Users\\Farook\\Downloads\\app-release (7).apk', false)
//
//Mobile.pressBack()
TestObject order = new TestObject()
order.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'account')]")
//TestObject obj_1 = new TestObject()
//obj_1.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@index, '3')]")

TestObject obj_2 = new TestObject()
obj_2.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@hint, 'Number')]")
TestObject obj_3 = new TestObject()
obj_3.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'Continue')]")

//TestObject obj_4 = new TestObject()
//obj_4.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@hint, '----')]")

//TestObject obj_5 = new TestObject()
//obj_5.addProperty("xpath", ConditionType.EQUALS, "//*[(@content-desc, 'Verify')]")
TestObject obj_6 = new TestObject()
obj_6.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'Resend')]")

//Mobile.tap(order, 10)
//Mobile.tap(findTestObject('Object Repository/Wallet Objects/click_button'), 10)
Mobile.tap(obj_2, 10)
Mobile.setText(obj_2, '77196492', 10)
Mobile.pressBack()
Mobile.verifyElementVisible(obj_3, 10)
Mobile.tap(obj_3, 10)
Mobile.waitForElementPresent(findTestObject('Object Repository/Wallet Objects/select_box'), 10)
Mobile.tap(findTestObject('Object Repository/Wallet Objects/select_box'), 10)
Mobile.setText(findTestObject('Object Repository/Wallet Objects/select_box'), '1234', 10)
Mobile.tap(findTestObject('Object Repository/Login objects/Verify'), 10)
//Mobile.tap(obj_6, 10)
//Mobile.verifyElementVisible(obj_5, 10)
//Mobile.delay(1)
//Mobile.tap(obj_5, 10)





