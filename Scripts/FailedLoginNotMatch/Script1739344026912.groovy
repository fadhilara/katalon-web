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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

if (WebUI.verifyElementVisible(findTestObject('banner'))) {
	WebUI.click(findTestObject('button_close_popup'))
}

WebUI.click(findTestObject('Object Repository/loginPage/Page_Masuk Akun Gramedia  Toko Buku Online _0125a3/div_Masuk'))

WebUI.setText(findTestObject('Object Repository/loginPage/Page_Masuk Akun Gramedia  Toko Buku Online _0125a3/input_Email_email'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/loginPage/Page_Masuk Akun Gramedia  Toko Buku Online _0125a3/input_Kata Sandi_password'), 
    password)

WebUI.click(findTestObject('Object Repository/loginPage/Page_Masuk Akun Gramedia  Toko Buku Online _0125a3/button_Masuk'))

WebUI.verifyElementVisible(findTestObject('Object Repository/loginPage/Page_Masuk Akun Gramedia  Toko Buku Online _0125a3/div_Email atau kata sandi tidak cocok. Sila_55fa16'))

WebUI.closeBrowser()

