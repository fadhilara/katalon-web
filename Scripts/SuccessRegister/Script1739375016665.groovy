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
import com.github.javafaker.Faker as Faker

def faker = new Faker()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

if (WebUI.verifyElementVisible(findTestObject('banner'))) {
	WebUI.click(findTestObject('button_close_popup'))
}


//WebUI.click(findTestObject('button_close_popup'))

WebUI.click(findTestObject('registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/div_Daftar'))

email = ('test-' + faker.internet().emailAddress())

WebUI.setText(findTestObject('Object Repository/registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/input_Email_email'), 
    email)

fullName = ('test ' + faker.name().fullName())

WebUI.setText(findTestObject('Object Repository/registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/input_Nama Lengkap_fullname'), 
    fullName)

WebUI.setEncryptedText(findTestObject('Object Repository/registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/input_Kata Sandi_password'), 
    password)

WebUI.setEncryptedText(findTestObject('Object Repository/registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/input_Konfirmasi Kata Sandi_confirmationPassword'), 
    confirmPassword)

WebUI.click(findTestObject('registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/button_checkbox_tc'))

WebUI.click(findTestObject('Object Repository/registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/button_Daftar'))

//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('Object Repository/registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/div_Daftar'))
WebUI.verifyElementPresent(findTestObject('registerPage/Page_Daftar Akun Gramedia  Toko Buku Online_677304/p_Selamat datang'), 
    0)

WebUI.closeBrowser()

