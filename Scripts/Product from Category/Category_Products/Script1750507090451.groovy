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

Mobile.startApplication('C:\\Users\\Farook\\Downloads\\app-release (7).apk', false)

Mobile.pressBack()

TestObject obj_1 = new TestObject()

obj_1.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Ice Cream\')]')

if (Mobile.verifyElementVisible(obj_1,1)) {
	boolean found = false
int maxScrolls = 5

for (int i = 0; i < maxScrolls; i++) {
    if (Mobile.verifyElementVisible(obj_1, 1)) {
        Mobile.tap(obj_1, 10)
		found = true
		break
        println('Element Exist')
    } else {
        println('Element Does not Exist')

        int startX = Mobile.getDeviceWidth() / 2

        int startY = (Mobile.getDeviceHeight() * 3) / 4

        int endY = Mobile.getDeviceHeight() / 4

        Mobile.swipe(startX, startY, startX, endY)
    }
}
}
