import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.SetUp as SetUp
import com.kms.katalon.core.annotation.TearDown as TearDown
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

if (WebUI.verifyElementVisible(findTestObject('banner1'))) {
    WebUI.click(findTestObject('button_close_popup'))
}

WebUI.click(findTestObject('Object Repository/lupaSandiPage/Page_Masuk Akun Gramedia  Toko Buku Online _0125a3/a_Lupa Kata Sandi'))

WebUI.setText(findTestObject('Object Repository/lupaSandiPage/Page_Lupa Kata Sandi  Toko Buku Online Terb_c96406/input_Email_email'), 
    email)

WebUI.click(findTestObject('Object Repository/lupaSandiPage/Page_Lupa Kata Sandi  Toko Buku Online Terb_c96406/button_Kirim'))

WebUI.click(findTestObject('Object Repository/lupaSandiPage/Page_Toko Buku Online Terbesar  Gramedia.com/div_Email Telah Terkirim'))

WebUI.click(findTestObject('Object Repository/lupaSandiPage/Page_Toko Buku Online Terbesar  Gramedia.com/button_Cek Email'))

@SetUp(skipped = false)
def setUp() {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.baseUrl)

    WebUI.maximizeWindow()
}

@TearDown(skipped = false)
def tearDown() {
    WebUI.closeBrowser()
}

