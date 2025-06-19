import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

Mobile.startApplication('C:\\Users\\Farook\\Downloads\\app-release (7).apk', false)

Mobile.pressBack()

TestObject obj_1 = new TestObject()
obj_1.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'order')]")

TestObject obj_2 = findTestObject('Object Repository/Wallet Objects/select_box')
TestObject obj_3 = new TestObject()
obj_3.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'Proceed')]")
TestObject obj_4 = new TestObject()
obj_4.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'Pay via credit')]")
Mobile.tap(obj_1, 10)
TestObject obj_5 = new TestObject()
obj_5.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@hint, 'Card')]")
Mobile.tap(obj_2, 10)
TestObject obj_6 = new TestObject()
obj_6.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@hint, 'Name*')]")
TestObject obj_7 = new TestObject()
obj_7.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@hint, 'CVV')]")
TestObject obj_8 = new TestObject()
obj_8.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@hint, 'Expiry')]")
TestObject obj_9 = new TestObject()
obj_9.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'Add (QAR')]")

//Mobile.tap(findTestObject('null'), 10)

Mobile.setText(obj_2, '10', 10)

Mobile.waitForElementPresent(obj_3, 10)

Mobile.tap(obj_3, 10)

Mobile.tap(obj_4, 10)

Mobile.tap(obj_5, 10)

Mobile.setText(obj_5, '4245424542454245', 10)


Mobile.tap(obj_6, 10)

Mobile.setText(obj_6, 'Test', 10)

Mobile.tap(obj_7, 10)
Mobile.setText(obj_7, '123', 10)

Mobile.tap(obj_8, 10)
Mobile.setText(obj_8, '1225', 10)

Mobile.tap(obj_9, 10)
