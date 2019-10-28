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

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Entregar Requerimientos a Contratistas/a_AsignarRequerimientoActivo'))

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Entregar Requerimientos a Contratistas/a_AsignarRequerimientoContratista'))

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Entregar Requerimientos a Contratistas/input_Entrega de Requerimiento por Contratistas_ctl00cphContenidobtnAsignar'))

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Entregar Requerimientos a Contratistas/li_El registro fue creado exitosamente'))

