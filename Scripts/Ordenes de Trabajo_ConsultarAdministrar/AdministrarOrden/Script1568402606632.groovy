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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/Seleccion Codigo General'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/Seleccion Codigo Especifico'), 
    '120', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/Seleccion Causa'), 
    '47', true)

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/Ingresar Observacion'), 'Creo que se daño mi manguera')

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/input__ctl00cphContenidobotonGuardar'))

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Modificar rdenes de Trabajo/li_La orden de trabajo fue modificada exitosamente'))

