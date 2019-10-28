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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration



//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/Contenedor1_SeleccionarCodigo'),  '9', true)
Robot robot = new Robot()

WebUI.sendKeys(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/Contenedor1_SeleccionarCodigo'), Keys.chord(Keys.ENTER))
for (def index : (6)) 
{
	robot.keyPress(KeyEvent.VK_DOWN)
}

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/textarea_Observaciones_ctl00cphContenidotextBoxGasparDetalleSolicitud'), 
    'Se realiza modificación del servicio')

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/input_Identificacin del Cliente_ctl00cphContenidotxtIdCliente'), 
    '1036672555')

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/input_Identificacin del G0_ctl00cphContenidotxtIdGcero'), 
    '105')

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/textarea_Detalle de la Direccin_ctl00cphContenidotextBoxGasparDetalleDireccion'), 
    'carrera 40 no 78 . 61')

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/input_Nombre del Contacto_ctl00cphContenidotxtNombreContacto'), 
    'Liced Toro')

WebUI.setText(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/input_Telfono del Contacto_ctl00cphContenidotxtTelefonoContacto'), 
    '3116685468')

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/input__ctl00cphContenidobtnGuardar'))

WebUI.click(findTestObject('Object Repository/Page_GASPAR - Crear Requerimiento/li_Se cre un requerimiento de tipo evento por favor informar al personal operativo'))

