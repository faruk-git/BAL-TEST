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

TestObject obj_2 = new TestObject()
obj_2.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@class, \'android.widget.EditText\')]')

//TestObject obj_3 = new TestObject()
//obj_3.addProperty('xpath', ConditionType.EQUALS, '//*[contains(@content-desc, \'Search\')]')
Mobile.tap(obj_1, 5)

Mobile.tap(obj_2, 4)

Mobile.setText(obj_2, 'Water', 5)

Mobile.pressBack()




//selectProducts(2, 5)
//void selectProducts(int firstIndex, int totalProducts) {
//	int tapCount = 5
//
//	for (int i = firstIndex; i <= totalProducts; i += 3) {
//		TestObject product = new TestObject("product_$i")
//
//		String xpath = "(//android.widget.ScrollView//android.view.View[contains(@content-desc, \'QAR 5.5\')]//android.widget.ImageView)[$i]"
//
//		product.addProperty('xpath', ConditionType.EQUALS, xpath)
//
//		println("Tapping product $i")
//
//		Mobile.tap(product, 10)
//
//		if (Mobile.verifyElementVisible(product, 2, FailureHandling.OPTIONAL)) {
//			Mobile.tap(product, 2)
//	}
//	else
//	{
//		int startX = Mobile.getDeviceWidth() / 2
//			int startY = (Mobile.getDeviceHeight() * 3) / 4
//			int endY = Mobile.getDeviceHeight() / 4
//			Mobile.swipe(startX, startY, startX, endY)
//			Mobile.delay(1)
//	}
//}
//			
//		}





selectProducts(2, 5)

void selectProducts(int firstIndex, int totalProducts) {
	int maxScrolls = 5  // You can increase if items are deeper
	int i = firstIndex
	while (i<= totalProducts) {
		boolean tapped = false
		int scrolls = 0

		while (!tapped && scrolls < maxScrolls) {
			TestObject product = new TestObject("product_$i")
			String xpath = "(//android.widget.ScrollView//android.view.View[contains(@content-desc, 'QAR 5.5')]//android.widget.ImageView)[$i]"
			product.addProperty("xpath", ConditionType.EQUALS, xpath)

			if (Mobile.verifyElementVisible(product, 2, FailureHandling.OPTIONAL)) {
				println("✅ Tapping product $i with 'R 5.5'")
				Mobile.tap(product, 10)
				tapped = true
				Mobile.delay(1)
			} else {
				println("🔁 Product $i not visible yet. Scrolling...")
				
			}
			int startX = Mobile.getDeviceWidth() / 2
				int startY = (Mobile.getDeviceHeight() * 3) / 4
				int endY = Mobile.getDeviceHeight() / 4
				Mobile.swipe(startX, startY, startX, endY)
				Mobile.delay(1)
				scrolls++
		}

		if (!tapped) {
			println("❌ Could not tap product $i after scrolling $scrolls times.")
		}
	}
}




