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

Mobile.startApplication('C:\\Users\\Farook\\Downloads\\app-release (4).apk', false)

Mobile.pressBack()

TestObject obj_1 = findTestObject('Object Repository/Test Objects/Category', [('index') : '5'])

TestObject obj_2 = findTestObject('Object Repository/Test Objects/Sub Category', [('text') : 'Dried Fruits'])

//TestObject obj_3 = findTestObject('Object Repository/Test Objects/Select item')


TestObject obj_3 = new TestObject()
obj_3.addProperty("xpath", ConditionType.EQUALS, "//*[contains(@content-desc, 'QAR 12.5Baladi') and @index = '1']")

TestObject obj_4 = findTestObject('Object Repository/Test Objects/Add Items', [('index') : '5'])



Mobile.waitForElementPresent(obj_1, 10, FailureHandling.STOP_ON_FAILURE)

//println("Resolved XPath: " + obj_2.getSelectorCollection())
Mobile.takeScreenshot('Myscreenshot/before-tap.png')

Mobile.tap(obj_1, 10)

Mobile.waitForElementPresent(obj_2, 10)

Mobile.tap(obj_2, 10)
//
Mobile.waitForElementPresent(obj_3, 10)
//
//Mobile.takeScreenshot('Myscreenshot/after-tap.png')
//Mobile.delay(3)

Mobile.tap(obj_3, 10)

//Mobile.waitForElementPresent(obj_4, 10)
////Mobile.tap(obj_4, 10)
//
//for (int i = 0; i < 5; i++) {
//	Mobile.tap(obj_4, 10)
//	Mobile.delay(1) // Optional: short pause between taps
//}




