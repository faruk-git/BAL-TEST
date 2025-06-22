import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

obj_1.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Search\')]')

TestObject obj_2 = findTestObject('Object Repository/Add products/Element Present')

TestObject obj_3 = new TestObject()

obj_3.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'cart\')]')

TestObject obj_4 = new TestObject()

obj_4.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Yes\')]')

TestObject obj_5 = new TestObject()

obj_5.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Login\')]')

Mobile.tap(obj_1, 10)

// Wait for screen to load
Mobile.waitForElementPresent(findTestObject('Object Repository/Add products/Element Present'), 10)

// Main function
// Create dynamic object
Mobile.delay(0.1)

// Scroll after every 5 taps
// Call it
startProducts(2, 17)

startProducts(2, 17)

//startProducts(2, 17)
//startProducts(2, 27)
Mobile.pressBack()

Mobile.tap(obj_3, 10)

//if (Mobile.verifyElementVisible(obj_4, 10) == false) {
//    println('✅ Address Confirmation button found, tapping it...')
//
//    Mobile.tap(obj_4, 10)
//
//    
//} else {
//            println('Address Confirmation not found, tapping fallback...')

            Mobile.tap(obj_5, 10)
//}

void startProducts(int firstIndex, int totalProducts) {
    int tapCount = 17

    for (int i = firstIndex; i <= totalProducts; i += 3) {
        TestObject product = new TestObject("product_$i")

        String xpath = "(//android.widget.ScrollView//android.widget.ImageView)[$i]"

        product.addProperty('xpath', ConditionType.EQUALS, xpath)

        println("Tapping product $i")

        Mobile.tap(product, 10)

        if ((i % tapCount) == 0) {
            println("Scrolling after product $i")

            int startX = Mobile.getDeviceWidth() / 2

            int startY = (Mobile.getDeviceHeight() * 3) / 4

            int endY = Mobile.getDeviceHeight() / 4

            Mobile.swipe(startX, startY, startX, endY)

            Mobile.delay(1)
        }
    }
}

