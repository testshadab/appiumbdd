package objectRepository;
import org.openqa.selenium.By;
public class SignupObject {
	public static By skip=By.id("llSkip");
	public static By menu_more=By.id("menu_more");
	public static By Register=By.xpath("//android.widget.TextView[@text='Register']");
	public static By FName=By.id("edit_fname");
	public static By lastname=By.id("edit_text_l_name");
	public static By Dateof_birth=By.id("rrDOB");
	public static By Email = By.id("edit_text_email");
	public static By password= By.id("edit_text_pswd");
	public static By Submit=By.id("RegisterButton");
//	public static By Address = By.id("rrAddress");
//	public static By LocationState = By.id("etState");
//	public static By licenseNumber = By.id("etLicense");
//	public static By attach_file=By.id("ImgSelection");
//	public static By checkbox=By.id("checkboxTAndC");
	
	//error message validation
	public static By FNVal = By.id("FirstNameWarningText");
	public static By LNVal = By.id("l_name_warning_text");
	public static By Email_AddressVal = By.id("email_warning_txt");
	public static By passwordVal = By.id("password_warning_uppertxt");
	public static By Signup_errormessage = By.id("message");
	
	//close popup
	public static By ok = By.id("button1");
	public static By Profile=By.xpath("(//android.widget.TextView[@text='Profile'])");
	public static By ProfileName=By.id("ProfileName");
	
	//Login the sandaman hotel 
	
	public static By login=By.id("LoginButton");
	public static By USemail=By.id("edit_username");
	public static By USpwd=By.id("edit_password");
	public static By logintap=By.id("LogInButton");

	
	//All object for quickhealth
//	public static By Email1 = By.id("editTextEmailLogin");
//	public static By password1=By.id("editTextPass");
//	public static By login=By.xpath("//android.widget.TextView[@text='Login']");
//	
			
}
