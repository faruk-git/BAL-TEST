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

Mobile.startApplication('C:\\Users\\Farook\\Downloads\\app-release (7).apk', true)

TestObject obj_1 = new TestObject()

obj_1.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'English\')]')

TestObject obj_2 = new TestObject()

obj_2.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Continue\')]')

TestObject obj_3 = new TestObject()

obj_3.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Next\')]')

TestObject obj_4 = new TestObject()

obj_4.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Get\')]')

TestObject obj_5 = new TestObject()

obj_5.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Grant\')]')

TestObject obj_6 = new TestObject()

obj_6.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'yes\')]')

Mobile.pressBack()

Mobile.tap(obj_1, 10)

Mobile.tap(obj_2, 10)

Mobile.tap(obj_3, 10)

Mobile.tap(obj_4, 10)

if (Mobile.verifyElementExist(obj_5, 10)) {
    println('✅ Main button found, tapping it...')

    Mobile.tap(obj_5, 10)
} else {
    Mobile.verifyElementNotExist(obj_5, 10).call({ 
            println('Main button not found, tapping fallback...')

            Mobile.pressBack()

            Mobile.tap(obj_6, 10)
        })
}

