import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Page_GASPAR - Administrar rdenes de Trabajo_ Directo/a_000233014'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/select_000F2710'), 
    '180', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/select_5490-Suspensin por vencimiento de certificado'), 
    '146', true)

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/textarea_Observaciones_ctl00cphContenidotextObservacionOT'), 
    'Se cortan los servicios por falta de pago')

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/input_Lectura Medidor_ctl00cphContenidotextLecturaInicial'), 
    '120')

WebUI.click(findTestObject('Page_GASPAR - Modificar rdenes de Trabajo/input__ctl00cphContenidobotonGuardar'))

WebUI.click(findTestObject('Page_GASPAR - Modificar rdenes de Trabajo/li_La orden de trabajo fue modificada exitosamente (1)'))

